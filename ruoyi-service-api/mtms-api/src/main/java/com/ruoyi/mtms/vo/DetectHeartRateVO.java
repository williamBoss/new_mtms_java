package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
@ApiModel
public class DetectHeartRateVO {
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
     * 早上心率值
     */
    @ApiModelProperty(value = "早上心率值")
    private String morningValue;

    /**
     * 中午心率值
     */
    @ApiModelProperty(value = "中午心率值")
    private String noonValue;

    /**
     * 晚上心率值
     */
    @ApiModelProperty(value = "晚上心率值")
    private String nightValue;

}

