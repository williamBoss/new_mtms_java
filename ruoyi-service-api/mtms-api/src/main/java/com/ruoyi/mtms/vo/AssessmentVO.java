package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author KING
 */
@ApiModel(value = "AssessmentVO")
@Data
public class AssessmentVO {
    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 评估患者id
     */
    @ApiModelProperty(value = "评估患者id")
    private Integer patientId;

    /**
     * 评估填写时间
     */
    @ApiModelProperty(value = "评估填写时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime fillDate;

    /**
     * 本次评估主诉
     */
    @ApiModelProperty(value = "本次评估主诉")
    private String mainConsult;

    /**
     * 肝损害 0.否 1.是
     */
    @ApiModelProperty(value = "肝损害 0.否 1.是")
    private Boolean liverDamage;

    /**
     * 肝损害详细描述
     */
    @ApiModelProperty(value = "肝损害详细描述")
    private String liverDamageDesc;

    /**
     * 肾损害 0.否 1.是
     */
    @ApiModelProperty(value = "肾损害 0.否 1.是")
    private Boolean kidneyDamage;

    /**
     * 肾损害详细描述
     */
    @ApiModelProperty(value = "肾损害详细描述")
    private String kidneyDamageDesc;

    /**
     * 过敏史 0.无 1.有
     */
    @ApiModelProperty(value = "过敏史 0.无 1.有")
    private Boolean allergyHistory;

    /**
     * 药物不良反应史 0.无 1.有
     */
    @ApiModelProperty(value = "药物不良反应史 0.无 1.有")
    private Boolean medicationSideEffect;

    private String patientName;

    private String phone;

    private String idCardNum;

    private String fillDateStart;

    private String fillDateEnd;

    private PatientInfoVO patientInfoVO;

    private AssessmentDiagnosisVO diagnosisVO;

    private List<DiseaseVO> diseaseVOS;

    /**
     * 诊断
     **/
    private Integer[] diseaseIds;
    private String diseaseName;

    /**
     * 当前症状描述
     **/
    private Integer[] physique;
    private String physiqueOtherDesc;
    private Integer[] facialFeatures;
    private String facialFeaturesOtherDesc;
    private Integer[] endocrine;
    private String endocrineOtherDesc;
    private Integer[] respiratorySystem;
    private String respiratorySystemOtherDesc;
    private Integer[] cardiovascular;
    private String cardiovascularOtherDesc;
    private Integer[] digestiveSystem;
    private String digestiveSystemOtherDesc;
    private Integer[] urogenitalSystem;
    private String urogenitalSystemOtherDesc;
    private Integer[] musculoskeletalSystem;
    private String musculoskeletalSystemOtherDesc;
    private Integer[] nervousSystem;
    private String nervousSystemOtherDesc;
    private Integer[] hemolymphSystem;
    private String hemolymphSystemOtherDesc;
    private Integer[] immuneSystem;
    private String immuneSystemOtherDesc;
    private Integer[] psychological;
    private String psychologicalOtherDesc;

    // 既往病史
    private Integer[] pastMedicalHistoryDiseaseIds;
    private String pastMedicalHistoryDiseaseName;

    // 家族史
    private Integer[] familyMedicalHistoryDiseaseIds;
    private String familyMedicalHistoryDiseaseName;

    // 既往手术史
    private Integer[] surgicalHistoryIds;
    private String surgeryName;

}

