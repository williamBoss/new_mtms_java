package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.constant.ResponseConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.domain.Result;
import com.ruoyi.mtms.domain.Assessment;
import com.ruoyi.mtms.domain.Disease;
import com.ruoyi.mtms.service.AssessmentDiagnosisService;
import com.ruoyi.mtms.service.AssessmentService;
import com.ruoyi.mtms.service.DiseaseService;
import com.ruoyi.mtms.service.FamilyMedicalHistoryService;
import com.ruoyi.mtms.vo.AssessmentVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
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
    public R assessmentListByPatientId(@RequestParam(name = "patientId",defaultValue = "0") Integer patientId) {
        List<AssessmentVO> assessmentVOList = assessmentService.selectAssessmentByPatientId(patientId);
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "获取成功", assessmentVOList);
    }

    @PostMapping("/")
    @ApiOperation("新增评估记录")
    public Result saveAssessment(@RequestBody AssessmentVO assessmentVO) {
        Assessment assessment = dozenMapper.map(assessmentVO, Assessment.class);
        //评估记录
        assessmentService.save(assessment);
        return Result.ok().data("assessment", assessment);
    }

    @PutMapping("/")
    @ApiOperation("新增评估记录")
    public Result updateAssessment(@RequestBody AssessmentVO assessmentVO) {

      /*
        Integer assessmentId = assessment.getAssessmentId();
        //评估诊断关系
        Integer[] diseaseIds =
            ArrayUtils.addAll(assessmentVO.getDiseaseIds(), saveDisease(assessmentVO.getDiseaseName()));
        for (Integer diseaseId : diseaseIds) {
            AssessmentDiagnosis assessmentDiagnosis = new AssessmentDiagnosis();
            assessmentDiagnosis.setAssessmentId(assessmentId);
            assessmentDiagnosis.setDiseaseId(diseaseId);
            assessmentDiagnosisService.save(assessmentDiagnosis);
        }
        //家族病史
        Integer[] familyMedicalDiseaseIds = ArrayUtils.addAll(assessmentVO.getFamilyMedicalHistoryDiseaseIds(),
            saveDisease(assessmentVO.getFamilyMedicalHistoryDiseaseName()));
        for (Integer diseaseId : familyMedicalDiseaseIds) {
            FamilyMedicalHistory familyMedicalHistory = new FamilyMedicalHistory();
            familyMedicalHistory.setAssessmentId(assessmentId);
            familyMedicalHistory.setDiseaseId(diseaseId);
            familyMedicalHistoryService.save(familyMedicalHistory);
        }*/
        //生活方式 mtms_lifestyle

        //药物不良反应 mtms_medication_side_effect

        //既往病史 mtms_past_medical_history

        //既往手术史 mtms_past_surgical_history

        //当前症状描述 mtms_symptom_description

        return Result.ok();
    }

    public Integer[] saveDisease(String diseaseNames) {
        List<Integer> diseaseIds = new ArrayList<>();
        if (StringUtils.isNotBlank(diseaseNames)) {
            String[] diseaseName = diseaseNames.split(",");
            for (String d : diseaseName) {
                Disease disease = new Disease();
                diseaseService.save(disease);
                diseaseIds.add(disease.getDiseaseId());
            }
        }
        return diseaseIds.toArray(new Integer[0]);
    }

}
