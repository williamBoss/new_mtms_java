package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
@ApiModel
public class DetectBloodSugarVO {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 检测日期
     */
    @ApiModelProperty(value = "检测日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate detectDate;

    /**
     * 空腹血糖(mmol/L)
     */
    @ApiModelProperty(value = "空腹血糖(mmol/L)")
    private String fastingBloodGlucose;

    /**
     * 餐后2小时血糖（mmol/L）
     */
    @ApiModelProperty(value = "餐后2小时血糖（mmol/L）")
    private String twoHoursPostprandial;

    /**
     * 糖化血红蛋白(%)
     */
    @ApiModelProperty(value = "糖化血红蛋白(%)")
    private String glycatedHemoglobin;

    /**
     * C肽
     */
    @ApiModelProperty(value = "C肽")
    private String cpeptide;

    /**
     * 随机血糖
     */
    @ApiModelProperty(value = "随机血糖")
    private String randomBloodSugar;

    /**
     * 尿微量白蛋白（mg/L）
     */
    @ApiModelProperty(value = "尿微量白蛋白（mg/L）")
    private String urineMicroalbumin;
}