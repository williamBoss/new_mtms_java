package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 患者评估记录表
 *
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-Assessment")
@Data
@TableName(value = "mtms_assessment")
public class Assessment {

    /**
     * 评估id
     */
    @TableId(value = "assessment_id", type = IdType.AUTO)
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 评估填写时间
     */
    @TableField(value = "fill_date")
    @ApiModelProperty(value = "评估填写时间")
    private Date fillDate;

    /**
     * 本次评估主诉
     */
    @TableField(value = "main_consult")
    @ApiModelProperty(value = "本次评估主诉")
    private String mainConsult;

    /**
     * 肝损害 0.否 1.是
     */
    @TableField(value = "liver_damage")
    @ApiModelProperty(value = "肝损害 0.否 1.是")
    private Boolean liverDamage;

    /**
     * 肝损害详细描述
     */
    @TableField(value = "liver_damage_desc")
    @ApiModelProperty(value = "肝损害详细描述")
    private String liverDamageDesc;

    /**
     * 肾损害 0.否 1.是
     */
    @TableField(value = "kidney_damage")
    @ApiModelProperty(value = "肾损害 0.否 1.是")
    private Boolean kidneyDamage;

    /**
     * 肾损害详细描述
     */
    @TableField(value = "kidney_damage_desc")
    @ApiModelProperty(value = "肾损害详细描述")
    private String kidneyDamageDesc;

    /**
     * 过敏史 0.无 1.有
     */
    @TableField(value = "allergy_history")
    @ApiModelProperty(value = "过敏史 0.无 1.有")
    private Boolean allergyHistory;

    /**
     * 过敏症状
     */
    @TableField(value = "allergy_symptoms")
    @ApiModelProperty(value = "过敏症状")
    private String allergySymptoms;

    /**
     * 过敏发生时间
     */
    @TableField(value = "allergy_datetime")
    @ApiModelProperty(value = "过敏发生时间")
    private Date allergyDatetime;

    /**
     * 药物不良反应史 0.无 1.有
     */
    @TableField(value = "medication_side_effect")
    @ApiModelProperty(value = "药物不良反应史 0.无 1.有")
    private Boolean medicationSideEffect;

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