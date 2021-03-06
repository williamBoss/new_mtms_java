package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/9/18 22:21
 * @version V1.0
 */

/**
 * 患者评估记录表
 *
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-Assessment")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_assessment")
public class Assessment extends BaseEntity {
    /**
     * 评估id
     */
    @TableId(value = "assessment_id", type = IdType.AUTO)
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 评估患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value = "评估患者id")
    private Integer patientId;

    /**
     * 评估填写时间
     */
    @TableField(value = "fill_date")
    @ApiModelProperty(value = "评估填写时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime fillDate;

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
    private Integer liverDamage;

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
    private Integer kidneyDamage;

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
    private Integer allergyHistory;

    /**
     * 药物不良反应史 0.无 1.有
     */
    @TableField(value = "medication_side_effect")
    @ApiModelProperty(value = "药物不良反应史 0.无 1.有")
    private Integer medicationSideEffect;

    /**
     * 转归详情
     */
    @TableField(value = "sequelae")
    @ApiModelProperty(value = "转归详情")
    private String sequelae;
}