package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author KING
 */
@Data
@ApiModel
public class MedicationSideEffectChooseVO {

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
     * 药物不良反应史 0.无 1.有
     */
    @ApiModelProperty(value = "药物不良反应史 0.无 1.有")
    private Integer medicationSideEffect;

}

