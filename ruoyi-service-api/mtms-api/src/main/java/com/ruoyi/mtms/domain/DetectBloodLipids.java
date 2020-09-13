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
 * 血脂检测检验
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectBloodLipids")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_blood_lipids")
public class DetectBloodLipids extends BaseEntity {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 检测日期
     */
    @TableField(value = "detect_date")
    @ApiModelProperty(value = "检测日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime detectDate;

    /**
     * 总胆固醇TC(mmol/L)
     */
    @TableField(value = "TC")
    @ApiModelProperty(value = "总胆固醇TC(mmol/L)")
    private String tc;

    /**
     * 低密度脂蛋白LDL-C(mmol/L)
     */
    @TableField(value = "LDL")
    @ApiModelProperty(value = "低密度脂蛋白LDL-C(mmol/L)")
    private String ldl;

    /**
     * 甘油三酯TG(mmol/L)
     */
    @TableField(value = "TG")
    @ApiModelProperty(value = "甘油三酯TG(mmol/L)")
    private String tg;

    /**
     * 脂蛋白LP-A
     */
    @TableField(value = "LP_A")
    @ApiModelProperty(value = "脂蛋白LP-A")
    private String lpA;

    /**
     * 高密度脂蛋白HDL-C（mmol/L）
     */
    @TableField(value = "HDL_C")
    @ApiModelProperty(value = "高密度脂蛋白HDL-C（mmol/L）")
    private String hdlC;

    /**
     * 低密度脂蛋白胆固醇
     */
    @TableField(value = "LDL_C")
    @ApiModelProperty(value = "低密度脂蛋白胆固醇")
    private String ldlC;
}