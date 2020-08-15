package com.ruoyi.mtms.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 药物不良反应史与评估关系表
 *
 * @author KING
 */
@Data
@ApiModel(value = "药物不良反应史t")
@TableName(value = "mtms_medication_side_effect")
public class MedicationSideEffectVO {

    /**
     * 药物不良反应史id
     */
    @ApiModelProperty(value = "药物不良反应史id")
    private Integer medicationSideEffectId;

    /**
     * 患者id
     */
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 药物id
     */
    @ApiModelProperty(value = "药物id")
    private Integer medId;

    /**
     * 不良反应症状
     */
    @ApiModelProperty(value = "不良反应症状")
    private String adverseReactionsSymptoms;

    /**
     * 不良反应发生时间
     */
    @ApiModelProperty(value = "不良反应发生时间")
    private Date occurrenceDatetime;

}