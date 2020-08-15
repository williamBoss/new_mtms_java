package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.constant.ResponseConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.domain.Result;
import com.ruoyi.mtms.domain.*;
import com.ruoyi.mtms.service.*;
import com.ruoyi.mtms.vo.AssessmentVO;
import com.ruoyi.mtms.vo.MedicationSideEffectVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: AssessmentController
 * @Package com.ruoyi.mtms.controller
 * @Description: 患者评估(这里用一句话描述这个类的作用)
 * @date 2020/5/27 18:28
 */
@Slf4j
@Api("患者评估")
@RestController()
@RequestMapping("/assessment")
public class AssessmentController extends BaseController {

    @Autowired
    private AssessmentService assessmentService;

    @Autowired
    private AssessmentDiagnosisService assessmentDiagnosisService;

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private FamilyMedicalHistoryService familyMedicalHistoryService;

    @Autowired
    private SymptomDescriptionService symptomDescriptionService;

    @Autowired
    private PastMedicalHistoryService pastMedicalHistoryService;

    @Autowired
    private SurgicalHistoryService surgicalHistoryService;

    @Autowired
    private PastSurgicalHistoryService pastSurgicalHistoryService;

    @Autowired
    private MedicationSideEffectService medicationSideEffectService;

    @Autowired
    private Mapper dozenMapper;

    @GetMapping("/")
    @ApiOperation("患者评估列表")
    public R assessmentList(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, AssessmentVO assessmentVO,
        Integer[] diseaseIds) {
        Page<AssessmentVO> assessmentList = assessmentService.assessmentList(pageNo, pageSize, assessmentVO,
            diseaseIds != null ? StringUtils.join(diseaseIds, ",") : "");
        return result(pageNo, assessmentList, null);
    }

    @GetMapping("/patientId")
    @ApiOperation("患者评估列表，通过患者id获取")
    public R assessmentListByPatientId(@RequestParam(name = "patientId", defaultValue = "0") Integer patientId) {
        List<AssessmentVO> assessmentVOList = assessmentService.selectAssessmentByPatientId(patientId);
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "获取成功", assessmentVOList);
    }

    @PostMapping("/")
    @ApiOperation("新增评估记录，获取Id")
    public Result saveAssessment(@RequestBody AssessmentVO assessmentVO) {
        Assessment assessment = dozenMapper.map(assessmentVO, Assessment.class);
        //评估记录
        assessmentService.save(assessment);
        return Result.ok().data("assessment", assessment);
    }

    @PutMapping("/")
    @ApiOperation("新增评估记录")
    public Result updateAssessment(@RequestBody AssessmentVO assessmentVO) {

        Integer assessmentId = assessmentVO.getAssessmentId();

        Assessment assessment = dozenMapper.map(assessmentVO, Assessment.class);
        assessmentService.updateById(assessment);

        //评估诊断关系
        Integer[] diseaseIds =
            ArrayUtils.addAll(assessmentVO.getDiseaseIds(), saveDisease(assessmentVO.getDiseaseName()));
        for (Integer diseaseId : diseaseIds) {
            AssessmentDiagnosis assessmentDiagnosis = new AssessmentDiagnosis();
            assessmentDiagnosis.setAssessmentId(assessmentId);
            assessmentDiagnosis.setDiseaseId(diseaseId);
            assessmentDiagnosisService.save(assessmentDiagnosis);
        }

        //当前症状描述
        SymptomDescription symptomDescription = dozenMapper.map(assessmentVO, SymptomDescription.class);
        symptomDescription.setAssessmentId(assessmentId);
        symptomDescriptionService.save(symptomDescription);

        //既往病史
        Integer[] pastMedicalHistoryDiseaseIds = ArrayUtils.addAll(assessmentVO.getPastMedicalHistoryDiseaseIds(),
            saveDisease(assessmentVO.getPastMedicalHistoryDiseaseName()));
        for (Integer diseaseId : pastMedicalHistoryDiseaseIds) {
            PastMedicalHistory pastMedicalHistory = new PastMedicalHistory();
            pastMedicalHistory.setAssessmentId(assessmentId);
            pastMedicalHistory.setDiseaseId(diseaseId);
            pastMedicalHistoryService.save(pastMedicalHistory);
        }

        //家族病史
        Integer[] familyMedicalDiseaseIds = ArrayUtils.addAll(assessmentVO.getFamilyMedicalHistoryDiseaseIds(),
            saveDisease(assessmentVO.getFamilyMedicalHistoryDiseaseName()));
        for (Integer diseaseId : familyMedicalDiseaseIds) {
            FamilyMedicalHistory familyMedicalHistory = new FamilyMedicalHistory();
            familyMedicalHistory.setAssessmentId(assessmentId);
            familyMedicalHistory.setDiseaseId(diseaseId);
            familyMedicalHistoryService.save(familyMedicalHistory);
        }

        //既往手术史
        Integer[] surgicalHistoryIds =
            ArrayUtils.addAll(assessmentVO.getSurgicalHistoryIds(), saveSurgicalHistory(assessmentVO.getSurgeryName()));
        for (Integer surgicalHistoryId : surgicalHistoryIds) {
            PastSurgicalHistory pastSurgicalHistory = new PastSurgicalHistory();
            pastSurgicalHistory.setAssessmentId(assessmentId);
            pastSurgicalHistory.setPastSurgicalHistoryId(surgicalHistoryId);
            pastSurgicalHistoryService.save(pastSurgicalHistory);
        }

        return Result.ok();
    }

    @PostMapping("saveMedicationSideEffect")
    @ApiOperation("新增药物不良反应记录")
    public Result saveMedicationSideEffect(@RequestBody MedicationSideEffectVO medicationSideEffectVO) {
        MedicationSideEffect medicationSideEffect = dozenMapper.map(medicationSideEffectVO, MedicationSideEffect.class);
        medicationSideEffectService.save(medicationSideEffect);
        return Result.ok();
    }

    public Integer[] saveDisease(String diseaseNames) {
        List<Integer> diseaseIds = new ArrayList<>();
        if (StringUtils.isNotBlank(diseaseNames)) {
            String[] diseaseNameArr = diseaseNames.split(",");
            for (String diseaseName : diseaseNameArr) {
                // 查询该病种是否已经保存过
                if (StringUtils.isNotEmpty(diseaseName)) {
                    LambdaQueryWrapper<Disease> queryWrapper = new LambdaQueryWrapper<>();
                    queryWrapper.select(Disease::getDiseaseId);
                    queryWrapper.like(Disease::getDiseaseName, diseaseName);
                    queryWrapper.eq(Disease::getDelFlag, 0);
                    Disease disease = diseaseService.getOne(queryWrapper);
                    if (disease == null) {
                        disease.setDiseaseName(diseaseName);
                        diseaseService.save(disease);
                    }
                    diseaseIds.add(disease.getDiseaseId());
                }

            }
        }
        return diseaseIds.toArray(new Integer[0]);
    }

    public Integer[] saveSurgicalHistory(String surgeryNames) {
        List<Integer> surgicalHistoryId = new ArrayList<>();
        if (StringUtils.isNotBlank(surgeryNames)) {
            String[] surgeryNameArr = surgeryNames.split(",");
            for (String surgeryName : surgeryNameArr) {
                // 查询该病种是否已经保存过
                if (StringUtils.isNotEmpty(surgeryName)) {
                    LambdaQueryWrapper<SurgicalHistory> queryWrapper = new LambdaQueryWrapper<>();
                    queryWrapper.select(SurgicalHistory::getSurgicalHistoryId);
                    queryWrapper.like(SurgicalHistory::getSurgeryName, surgeryName);
                    queryWrapper.eq(SurgicalHistory::getDelFlag, 0);
                    SurgicalHistory surgicalHistory = surgicalHistoryService.getOne(queryWrapper);
                    if (surgicalHistory == null) {
                        surgicalHistory.setSurgeryName(surgeryName);
                        surgicalHistoryService.save(surgicalHistory);
                    }
                    surgicalHistoryId.add(surgicalHistory.getSurgicalHistoryId());
                }
            }
        }
        return surgicalHistoryId.toArray(new Integer[0]);
    }

}
