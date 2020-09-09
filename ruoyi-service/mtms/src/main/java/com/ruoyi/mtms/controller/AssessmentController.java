package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.constant.ResponseConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.domain.Result;
import com.ruoyi.mtms.domain.*;
import com.ruoyi.mtms.service.*;
import com.ruoyi.mtms.vo.AssessmentVO;
import com.ruoyi.mtms.vo.LifestyleVO;
import com.ruoyi.mtms.vo.MedicationSideEffectVO;
import com.ruoyi.mtms.vo.UseMedRecordVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private LifestyleService lifestyleService;

    @Autowired
    private UseMedRecordService useMedRecordService;

    @Autowired
    private MedicineInfoService medicineInfoService;

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

    @PostMapping("/saveAssessment")
    @ApiOperation("新增评估记录，获取Id")
    @ApiImplicitParam(name = "patientId", value = "患者id", required = true)
    public Result saveAssessment(Integer patientId) {
        //评估记录
        Assessment assessment = new Assessment();
        assessment.setPatientId(patientId);
        assessmentService.save(assessment);
        return Result.ok().data("assessment", assessment);
    }

    @PostMapping("/saveFMHistory")
    @ApiOperation("新增家族史和既往史记录")
    public Result saveFMHistory(@RequestBody AssessmentVO assessmentVO) {

        Integer assessmentId = assessmentVO.getAssessmentId();

        //家族病史
        for (Integer diseaseId : assessmentVO.getFamilyMedicalHistoryDiseaseIds()) {
            FamilyMedicalHistory familyMedicalHistory = new FamilyMedicalHistory();
            familyMedicalHistory.setAssessmentId(assessmentId);
            familyMedicalHistory.setDiseaseId(diseaseId);
            familyMedicalHistoryService.save(familyMedicalHistory);
        }

        //既往病史
        for (Integer diseaseId : assessmentVO.getPastMedicalHistoryDiseaseIds()) {
            PastMedicalHistory pastMedicalHistory = new PastMedicalHistory();
            pastMedicalHistory.setAssessmentId(assessmentId);
            pastMedicalHistory.setDiseaseId(diseaseId);
            pastMedicalHistoryService.save(pastMedicalHistory);
        }

        //既往手术史
        // TODO: 2020/8/31 需要提供curd接口
        for (Integer surgicalHistoryId : assessmentVO.getSurgicalHistoryIds()) {
            PastSurgicalHistory pastSurgicalHistory = new PastSurgicalHistory();
            pastSurgicalHistory.setAssessmentId(assessmentId);
            pastSurgicalHistory.setPastSurgicalHistoryId(surgicalHistoryId);
            pastSurgicalHistoryService.save(pastSurgicalHistory);
        }

        Assessment assessment = dozenMapper.map(assessmentVO, Assessment.class);
        assessmentService.updateById(assessment);

        return Result.ok();
    }

    @PostMapping("/saveMedicationSideEffect")
    @ApiOperation("新增药物不良反应记录")
    public Result saveMedicationSideEffect(@RequestBody MedicationSideEffectVO medicationSideEffectVO) {
        MedicationSideEffect medicationSideEffect = dozenMapper.map(medicationSideEffectVO, MedicationSideEffect.class);
        if (medicationSideEffectVO.getMedId() == null) {
            MedicineInfo medicineInfo = new MedicineInfo();
            medicineInfo.setMedName(medicationSideEffectVO.getMedName());
            medicineInfoService.save(medicineInfo);
            medicationSideEffect.setMedId(medicineInfo.getMedId());
        }
        medicationSideEffectService.save(medicationSideEffect);
        return Result.ok();
    }

    @GetMapping("/getMedicationSideEffectList")
    @ApiOperation("获取药物不良反应记录列表")
    public BaseResult<List<MedicationSideEffect>> getMedicationSideEffect(
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<MedicationSideEffect> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(MedicationSideEffect::getPatientId, patientId);
        List<MedicationSideEffect> list = medicationSideEffectService.list(queryWrapper);
        return BaseResult.<List<MedicationSideEffect>>success().data(list);
    }

    @PostMapping("/saveExistSymptoms")
    @ApiOperation("新增现有症状记录")
    public Result updateExistSymptoms(@RequestBody AssessmentVO assessmentVO) {
        Integer assessmentId = assessmentVO.getAssessmentId();
        Assessment assessment = dozenMapper.map(assessmentVO, Assessment.class);
        assessmentService.updateById(assessment);
        //评估诊断关系
        for (Integer diseaseId : assessmentVO.getDiseaseIds()) {
            AssessmentDiagnosis assessmentDiagnosis = new AssessmentDiagnosis();
            assessmentDiagnosis.setAssessmentId(assessmentId);
            assessmentDiagnosis.setDiseaseId(diseaseId);
            assessmentDiagnosisService.save(assessmentDiagnosis);
        }

        //当前症状描述
        SymptomDescription symptomDescription = dozenMapper.map(assessmentVO, SymptomDescription.class);
        symptomDescription.setAssessmentId(assessmentId);
        symptomDescriptionService.save(symptomDescription);

        return Result.ok();
    }

    @PostMapping("/saveLifestyle")
    @ApiOperation("新增生活方式记录")
    public Result saveLifestyle(@RequestBody LifestyleVO lifestyleVO) {
        Lifestyle lifeStyle = dozenMapper.map(lifestyleVO, Lifestyle.class);
        lifestyleService.save(lifeStyle);
        return Result.ok();
    }

    @PostMapping("/getUseMedRecordList")
    @ApiOperation("获取用药记录列表")
    public R getUseMedRecordList(@RequestBody UseMedRecordVO useMedRecordVO,
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        Page<UseMedRecordVO> useMedRecordList = assessmentService.useMedRecordList(pageNo, pageSize, useMedRecordVO);
        return result(pageNo, useMedRecordList, null);
    }

    @PostMapping("/saveUseMedRecord")
    @ApiOperation("新增用药记录")
    public Result saveUseMedRecordVO(@RequestBody UseMedRecordVO useMedRecordVO) {
        UseMedRecord useMedRecord = dozenMapper.map(useMedRecordVO, UseMedRecord.class);
        if (useMedRecordVO.getMedId() == null) {
            MedicineInfo medicineInfo = dozenMapper.map(useMedRecordVO, MedicineInfo.class);
            medicineInfoService.save(medicineInfo);
            useMedRecord.setMedId(medicineInfo.getMedId());
        }
        useMedRecordService.save(useMedRecord);
        return Result.ok();
    }

}
