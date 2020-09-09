package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-mtms-vo-PastMedicalHistoryVO")
@Data
public class PastMedicalHistoryVO {
    /**
     * 既往病史id
     */
    @ApiModelProperty(value = "既往病史id")
    private Integer historyId;

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
     * 既往病史病种id
     */
    @ApiModelProperty(value = "既往病史病种id")
    private Integer diseaseId;

    @ApiModelProperty(value = "既往病史病种ids")
    private Integer[] pastMedicalHistoryDiseaseIds;

    @ApiModelProperty(value = "既往病史病种名称")
    private String diseaseName;

}

