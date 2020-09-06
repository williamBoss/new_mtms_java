package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
* ${TODO}
* @author KING
* @date 2020/9/6 19:52
* @version V1.0
*/

/**
 * 药物不良反应史与评估关系表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-MedicationSideEffect")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_medication_side_effect")
public class MedicationSideEffect extends BaseEntity {
    /**
     * 药物不良反应史id
     */
    @TableId(value = "medication_side_effect_id", type = IdType.AUTO)
    @ApiModelProperty(value = "药物不良反应史id")
    private Integer medicationSideEffectId;

    /**
     * 评估患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value = "评估患者id")
    private Integer patientId;

    /**
     * 药物id
     */
    @TableField(value = "med_id")
    @ApiModelProperty(value = "药物id")
    private Integer medId;

    /**
     * 不良反应症状
     */
    @TableField(value = "adverse_reactions_symptoms")
    @ApiModelProperty(value = "不良反应症状")
    private String adverseReactionsSymptoms;

    /**
     * 不良反应发生时间
     */
    @TableField(value = "occurrence_datetime")
    @ApiModelProperty(value = "不良反应发生时间")
    private LocalDateTime occurrenceDatetime;
}