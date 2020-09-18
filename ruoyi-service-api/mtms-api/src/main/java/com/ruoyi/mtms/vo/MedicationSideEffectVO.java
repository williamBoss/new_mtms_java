package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
@ApiModel(value = "药物不良反应史")
public class MedicationSideEffectVO {
    /**
     * 药物不良反应史id
     */
    @ApiModelProperty(value = "药物不良反应史id")
    private Integer medicationSideEffectId;

    /**
     * 评估患者id
     */
    @ApiModelProperty(value = "评估患者id")
    private Integer patientId;

    /**
     * 药物id
     */
    @ApiModelProperty(value = "药物id")
    private Integer medId;

    /**
     * 药品名称
     */
    @ApiModelProperty(value = "药品名称")
    private String medName;

    /**
     * 不良反应症状
     */
    @ApiModelProperty(value = "不良反应症状")
    private String adverseReactionsSymptoms;

    /**
     * 不良反应发生时间
     */
    @ApiModelProperty(value = "不良反应发生时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate occurrenceDatetime;

}