package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.constant.ResponseConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.domain.Result;
import com.ruoyi.mtms.domain.*;
import com.ruoyi.mtms.service.*;
import com.ruoyi.mtms.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
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
    private AllergyHistoryService allergyHistoryService;

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

    @PostMapping("/save_family_medical_history")
    @ApiOperation("新增家族史记录")
    public BaseResult<FamilyMedicalHistoryVO> saveFamilyMedicalHistory(
        @RequestBody FamilyMedicalHistoryVO familyMedicalHistoryVO) {
        //家族病史
        for (Integer diseaseId : familyMedicalHistoryVO.getFamilyMedicalHistoryDiseaseIds()) {
            FamilyMedicalHistory familyMedicalHistory = new FamilyMedicalHistory();
            familyMedicalHistory.setAssessmentId(familyMedicalHistoryVO.getAssessmentId());
            familyMedicalHistory.setDiseaseId(diseaseId);
            familyMedicalHistoryService.save(familyMedicalHistory);
        }
        return BaseResult.success();
    }

    @GetMapping("/get_family_medical_history")
    @ApiOperation("获取家族史记录")
    public BaseResult<List<FamilyMedicalHistoryVO>> getFamilyMedicalHistory(
        @ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        //家族病史
        List<FamilyMedicalHistoryVO> list =
            familyMedicalHistoryService.selectFamilyMedicalHistory(patientId, assessmentId);
        return BaseResult.<List<FamilyMedicalHistoryVO>>success().data(list);
    }

    @DeleteMapping("/del_family_medical_history/{id}")
    @ApiOperation("删除家族史记录")
    public BaseResult<FamilyMedicalHistoryVO> delFamilyMedicalHistory(
        @ApiParam(value = "家族史记录Id") @PathVariable String id) {
        //家族病史
        familyMedicalHistoryService.removeById(id);
        return BaseResult.<FamilyMedicalHistoryVO>success();
    }

    @PostMapping("/save_past_medical_history")
    @ApiOperation("新增既往病史记录")
    public BaseResult<PastMedicalHistoryVO> savePastMedicalHistory(
        @RequestBody PastMedicalHistoryVO pastMedicalHistoryVO) {
        for (Integer diseaseId : pastMedicalHistoryVO.getPastMedicalHistoryDiseaseIds()) {
            PastMedicalHistory pastMedicalHistory = new PastMedicalHistory();
            pastMedicalHistory.setAssessmentId(pastMedicalHistoryVO.getAssessmentId());
            pastMedicalHistory.setDiseaseId(diseaseId);
            pastMedicalHistoryService.save(pastMedicalHistory);
        }
        return BaseResult.success();
    }

    @GetMapping("/get_past_medical_history")
    @ApiOperation("获取既往病史记录")
    public BaseResult<List<PastMedicalHistoryVO>> getPastMedicalHistory(
        @ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        //家族病史
        List<PastMedicalHistoryVO> list = pastMedicalHistoryService.selectPastMedicalHistory(patientId, assessmentId);
        return BaseResult.<List<PastMedicalHistoryVO>>success().data(list);
    }

    @DeleteMapping("/del_past_medical_history/{id}")
    @ApiOperation("删除既往病史记录")
    public BaseResult<PastMedicalHistoryVO> delPastMedicalHistory(
        @ApiParam(value = "既往病史记录Id") @PathVariable String id) {
        //家族病史
        pastMedicalHistoryService.removeById(id);
        return BaseResult.<PastMedicalHistoryVO>success();
    }

    @ApiOperation("保存既往手术史记录、肝损害、肾损害、过敏史、药物不良反应史选项")
    @PostMapping("/save_damage")
    public BaseResult<AssessmentInfoVO> saveLiverDamageAndKidneyDamage(@RequestBody AssessmentInfoVO assessmentInfoVO) {
        Assessment assessment = dozenMapper.map(assessmentInfoVO, Assessment.class);
        List<PastSurgicalHistory> pastSurgicalHistories = new ArrayList<>();
        //保存既往手术史记录
        PastSurgicalHistory pastSurgicalHistory = new PastSurgicalHistory();
        pastSurgicalHistory.setAssessmentId(assessment.getAssessmentId());
        pastSurgicalHistory.setPatientId(assessment.getPatientId());
        Arrays.stream(assessmentInfoVO.getSurgicalIds()).forEach(v -> {
            pastSurgicalHistory.setSurgicalHistoryId(v);
            pastSurgicalHistories.add(pastSurgicalHistory);
        });
        Arrays.stream(assessmentInfoVO.getSurgeryName().split("、")).forEach(v -> {
            SurgicalHistory surgicalHistory = new SurgicalHistory();
            surgicalHistory.setSurgeryName(v);
            surgicalHistoryService.save(surgicalHistory);
            pastSurgicalHistory.setSurgicalHistoryId(surgicalHistory.getSurgicalHistoryId());
            pastSurgicalHistories.add(pastSurgicalHistory);
        });
        pastSurgicalHistoryService.saveBatch(pastSurgicalHistories);
        //保存过敏史
        if (!assessment.getAllergyHistory()) {
            assessmentInfoVO.getAllergyHistories().forEach(v -> {
                AllergyHistory allergyHistory = new AllergyHistory();
                allergyHistory.setAssessmentId(assessment.getAssessmentId());
                allergyHistory.setPatientId(assessment.getPatientId());
                allergyHistory.setAllergen(v.getAllergen());
                allergyHistory.setAllergySymptoms(v.getAllergySymptoms());
                allergyHistory.setAllergyDatetime(v.getAllergyDatetime());
                allergyHistoryService.save(allergyHistory);
            });
        }
        assessmentService.updateById(assessment);
        return BaseResult.success();
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

    @PostMapping("/save_diagnosis")
    @ApiOperation("新增现有症状-诊断记录")
    public BaseResult<AssessmentDiagnosisVO> saveDiagnosis(@RequestBody AssessmentDiagnosisVO assessmentDiagnosisVO) {
        Arrays.stream(assessmentDiagnosisVO.getDiagnosisDiseaseIds()).forEach(v -> {
            AssessmentDiagnosis assessmentDiagnosis = new AssessmentDiagnosis();
            assessmentDiagnosis.setAssessmentId(assessmentDiagnosisVO.getAssessmentId());
            assessmentDiagnosis.setPatientId(assessmentDiagnosisVO.getPatientId());
            assessmentDiagnosis.setDiseaseId(v);
            assessmentDiagnosisService.save(assessmentDiagnosis);
        });
        return BaseResult.success();
    }

    @PostMapping("/get_diagnosis")
    @ApiOperation("获取现有症状-诊断记录")
    public BaseResult<List<AssessmentDiagnosisVO>> getDiagnosis(
        @ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        List<AssessmentDiagnosisVO> list =
            assessmentDiagnosisService.selectAssessmentDiagnosis(patientId, assessmentId);
        return BaseResult.<List<AssessmentDiagnosisVO>>success().data(list);
    }

    @DeleteMapping("/del_diagnosis/{id}")
    @ApiOperation("删除现有症状-诊断记录")
    public BaseResult<AssessmentDiagnosisVO> del_diagnosis(@ApiParam(value = "现有症状-诊断Id") @PathVariable String id) {
        //家族病史
        assessmentDiagnosisService.removeById(id);
        return BaseResult.<AssessmentDiagnosisVO>success();
    }

    @PostMapping("/save_exist_symptoms")
    @ApiOperation("新增现有症状记录")
    public BaseResult<ExistSymptomsVO> updateExistSymptoms(@RequestBody ExistSymptomsVO existSymptomsVO) {
        //保存主诉
        Assessment assessment = dozenMapper.map(existSymptomsVO, Assessment.class);
        assessmentService.updateById(assessment);
        //当前症状描述
        SymptomDescription symptomDescription = dozenMapper.map(existSymptomsVO, SymptomDescription.class);
        symptomDescription.setPhysique(String.join("、", existSymptomsVO.getPhysiques()));
        symptomDescription.setFacialFeatures(String.join("、", existSymptomsVO.getFacialFeaturess()));
        symptomDescription.setEndocrine(String.join("、", existSymptomsVO.getEndocrines()));
        symptomDescription.setRespiratorySystem(String.join("、", existSymptomsVO.getRespiratorySystems()));
        symptomDescription.setCardiovascular(String.join("、", existSymptomsVO.getCardiovasculars()));
        symptomDescription.setDigestiveSystem(String.join("、", existSymptomsVO.getDigestiveSystems()));
        symptomDescription.setUrogenitalSystem(String.join("、", existSymptomsVO.getUrogenitalSystems()));
        symptomDescription.setMusculoskeletalSystem(String.join("、", existSymptomsVO.getMusculoskeletalSystems()));
        symptomDescription.setNervousSystem(String.join("、", existSymptomsVO.getNervousSystems()));
        symptomDescription.setHemolymphSystem(String.join("、", existSymptomsVO.getHemolymphSystems()));
        symptomDescription.setImmuneSystem(String.join("、", existSymptomsVO.getImmuneSystems()));
        symptomDescription.setPsychological(String.join("、", existSymptomsVO.getPsychologicals()));

        LambdaUpdateWrapper<SymptomDescription> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(SymptomDescription::getAssessmentId, existSymptomsVO.getAssessmentId());
        symptomDescriptionService.remove(updateWrapper);

        symptomDescriptionService.save(symptomDescription);
        return BaseResult.success();
    }

    @PostMapping("/saveLifestyle")
    @ApiOperation("新增生活方式记录")
    public Result saveLifestyle(@RequestBody LifestyleVO lifestyleVO) {
        Lifestyle lifeStyle = dozenMapper.map(lifestyleVO, Lifestyle.class);
        lifestyleService.save(lifeStyle);
        return Result.ok();
    }

    @PutMapping("/save_lifestyle_summary")
    @ApiOperation("补充生活方式评估记录总评")
    public BaseResult<LifestyleVO> saveLifestyleSummary(@ApiParam(value = "总评") @RequestParam String lifestyleSummary,
        @RequestParam Integer assessmentId) {
        Lifestyle lifeStyle = new Lifestyle();
        lifeStyle.setLifestyleSummary(lifestyleSummary);
        LambdaQueryWrapper<Lifestyle> updateWrapper = new LambdaQueryWrapper<>();
        updateWrapper.eq(Lifestyle::getAssessmentId, assessmentId);
        lifestyleService.update(lifeStyle, updateWrapper);
        return BaseResult.success();
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
