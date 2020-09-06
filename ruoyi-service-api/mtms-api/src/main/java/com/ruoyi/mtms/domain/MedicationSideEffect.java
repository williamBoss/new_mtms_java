package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Title: MedicationSideEffect
 * @Package com.ruoyi.mtms.domain
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @author KING
 * @date 2020/5/27 15:36
 * @version V1.0
 */

/**
 * 药物不良反应史与评估关系表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-MedicationSideEffect")
@Data
@TableName(value = "mtms_medication_side_effect")
public class MedicationSideEffect {
    /**
     * 药物不良反应史id
     */
    @TableId(value = "medication_side_effect_id", type = IdType.AUTO)
    @ApiModelProperty(value = "药物不良反应史id")
    private Integer medicationSideEffectId;

    /**
     * 患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value = "患者id")
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
    private Date occurrenceDatetime;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableLogic
    @TableField(value = "del_flag", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "删除状态(0-正常,1-已删除)")
    private Boolean delFlag;

    /**
     * 创建人
     */
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新人")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}