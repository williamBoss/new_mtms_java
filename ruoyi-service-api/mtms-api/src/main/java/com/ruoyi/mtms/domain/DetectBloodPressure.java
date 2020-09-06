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
 * 血压检测检验
 *
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectBloodPressure")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_blood_pressure")
public class DetectBloodPressure extends BaseEntity {
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
    private LocalDateTime detectDate;

    /**
     * 早上血压值
     */
    @TableField(value = "morning_value")
    @ApiModelProperty(value = "早上血压值")
    private String morningValue;

    /**
     * 中午血压值
     */
    @TableField(value = "noon_value")
    @ApiModelProperty(value = "中午血压值")
    private String noonValue;

    /**
     * 晚上血压值
     */
    @TableField(value = "night_value")
    @ApiModelProperty(value = "晚上血压值")
    private String nightValue;
}