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
 * ${TODO}
 *
 * @author KING
 * @date 2020/9/13 18:37
 * @version V1.0
 */

/**
 * 心率检测检验
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectHeartRate")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_heart_rate")
public class DetectHeartRate extends BaseEntity {
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
     * 早上心率值
     */
    @TableField(value = "morning_value")
    @ApiModelProperty(value = "早上心率值")
    private String morningValue;

    /**
     * 中午心率值
     */
    @TableField(value = "noon_value")
    @ApiModelProperty(value = "中午心率值")
    private String noonValue;

    /**
     * 晚上心率值
     */
    @TableField(value = "night_value")
    @ApiModelProperty(value = "晚上心率值")
    private String nightValue;
}