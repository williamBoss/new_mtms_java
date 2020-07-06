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
     * 诊断病种id
     */
    @ApiModelProperty(value = "诊断病种id")
    private Integer diseaseId;

}
