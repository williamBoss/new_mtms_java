package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "Eq5d5lVO")
@Data
public class Eq5d5lVO {
    /**
     * EQ-5D-5L主键
     */
    @ApiModelProperty(value = "EQ-5D-5L主键")
    private Integer eq5d5lId;

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者主键
     */
    @ApiModelProperty(value = "患者主键")
    private Integer patId;

    /**
     * 行动问题
     */
    @ApiModelProperty(value = "行动问题")
    private Byte actionQ;

    /**
     * 自己照顾自己
     */
    @ApiModelProperty(value = "自己照顾自己")
    private Byte lookAfterSelfQ;

    /**
     * 日常活动
     */
    @ApiModelProperty(value = "日常活动")
    private Byte dailyActQ;

    /**
     * 疼痛/不舒服问题
     */
    @ApiModelProperty(value = "疼痛/不舒服问题")
    private Byte painQ;

    /**
     * 焦虑抑郁问题
     */
    @ApiModelProperty(value = "焦虑抑郁问题")
    private Byte anxietyQ;

    /**
     * 分数
     */
    @ApiModelProperty(value = "分数")
    private String eq5d5lScore;

}

