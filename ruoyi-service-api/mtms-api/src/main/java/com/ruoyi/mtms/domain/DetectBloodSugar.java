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

import java.time.LocalDate;

/**
 * 血糖检测检验
 *
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectBloodSugar")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_blood_sugar")
public class DetectBloodSugar extends BaseEntity {

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate detectDate;

    /**
     * 空腹血糖(mmol/L)
     */
    @TableField(value = "fasting_blood_glucose")
    @ApiModelProperty(value = "空腹血糖(mmol/L)")
    private String fastingBloodGlucose;

    /**
     * 餐后2小时血糖（mmol/L）
     */
    @TableField(value = "two_hours_postprandial")
    @ApiModelProperty(value = "餐后2小时血糖（mmol/L）")
    private String twoHoursPostprandial;

    /**
     * 糖化血红蛋白(%)
     */
    @TableField(value = "glycated_hemoglobin")
    @ApiModelProperty(value = "糖化血红蛋白(%)")
    private String glycatedHemoglobin;

    /**
     * C肽
     */
    @TableField(value = "c_peptide")
    @ApiModelProperty(value = "C肽")
    private String cpeptide;

    /**
     * 随机血糖
     */
    @TableField(value = "random_blood_sugar")
    @ApiModelProperty(value = "随机血糖")
    private String randomBloodSugar;

    /**
     * 尿微量白蛋白（mg/L）
     */
    @TableField(value = "urine_microalbumin")
    @ApiModelProperty(value = "尿微量白蛋白（mg/L）")
    private String urineMicroalbumin;
}