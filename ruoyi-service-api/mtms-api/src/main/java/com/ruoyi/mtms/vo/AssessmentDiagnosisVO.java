package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "AssessmentDiagnosisVO")
@Data
public class AssessmentDiagnosisVO {
    /**
     * 诊断id
     */
    @ApiModelProperty(value = "诊断id")
    private Integer diagnosisId;

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
     * 诊断病种id
     */
    @ApiModelProperty(value = "诊断病种id")
    private Integer diseaseId;

    @ApiModelProperty(value = "诊断病种ids")
    private Integer[] diagnosisDiseaseIds;

    @ApiModelProperty(value = "诊断病种名称")
    private String diseaseName;
}
