package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-vo-FamilyMedicalHistoryVO")
@Data
public class FamilyMedicalHistoryVO {
    /**
     * 家族病史id
     */
    @ApiModelProperty(value = "家族病史id")
    private Integer familyHistoryId;

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 家族病史病种id
     */
    @ApiModelProperty(value = "家族病史病种id")
    private Integer diseaseId;

    @ApiModelProperty(value = "家族病史病种ids")
    private Integer[] familyMedicalHistoryDiseaseIds;

    @ApiModelProperty(value = "家族病史病种名称")
    private String diseaseName;

}

