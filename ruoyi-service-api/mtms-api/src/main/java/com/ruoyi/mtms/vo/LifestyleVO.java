package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(value = "LifestyleVO")
public class LifestyleVO {

    /**
     * 生活方式id
     */
    @ApiModelProperty(value = "生活方式id")
    private Integer lifestyleId;

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
     * 体重变化类型 1.增加 2.减少
     */
    @ApiModelProperty(value = "体重变化类型 1.增加 2.减少")
    private Integer weightChangeType;

    /**
     * 体重变化具体数值
     */
    @ApiModelProperty(value = "体重变化具体数值")
    private Double weightChangeValue;

    /**
     * 每日主食量
     */
    @ApiModelProperty(value = "每日主食量")
    private Integer dailyBasicFoodAmount;

    /**
     * 每日摄入盐量: 1.少 2.中 3.多
     */
    @ApiModelProperty(value = "每日摄入盐量: 1.少 2.中 3.多")
    private Integer dailySaltAmount;

    /**
     * 是否抽烟 1.是 2.否 3.已戒烟
     */
    @ApiModelProperty(value = "是否抽烟 1.是 2.否 3.已戒烟")
    private Integer isSmorker;

    /**
     * 吸烟量
     */
    @ApiModelProperty(value = "吸烟量")
    private Integer smokingNum;

    /**
     * 吸烟年限
     */
    @ApiModelProperty(value = "吸烟年限")
    private Integer smokingYear;

    /**
     * 戒烟时间
     */
    @ApiModelProperty(value = "戒烟时间")
    private Integer quitSmokingTime;

    /**
     * 是否饮酒 1.是 2.否
     */
    @ApiModelProperty(value = "是否饮酒 1.是 2.否")
    private Integer isDrinking;

    /**
     * 饮酒量
     */
    @ApiModelProperty(value = "饮酒量")
    private Integer drinkingNum;

    /**
     * 饮酒年限
     */
    @ApiModelProperty(value = "饮酒年限")
    private Integer drinkingYear;

    /**
     * 每日摄入油脂量: 1.少 2.中 3.多
     */
    @ApiModelProperty(value = "每日摄入油脂量: 1.少 2.中 3.多")
    private Integer dailyFatAmount;

    /**
     * 每日摄入蔬菜水果量: 1.少 2.中 3.多
     */
    @ApiModelProperty(value = "每日摄入蔬菜水果量: 1.少 2.中 3.多")
    private Integer dailyVegetableFruitAmount;

    /**
     * 是否运动 1.是 2.否
     */
    @ApiModelProperty(value = "是否运动 1.是 2.否")
    private Integer isExercise;

    /**
     * 通常的运动项目
     */
    @ApiModelProperty(value = "通常的运动项目")
    private String usualSports;

    /**
     * 每次的运动时间 分钟
     */
    @ApiModelProperty(value = "每次的运动时间 分钟")
    private String eachExerciseTime;

    /**
     * 每周的运动频率 次
     */
    @ApiModelProperty(value = "每周的运动频率 次")
    private String weeklyExerciseFrequency;

    /**
     * 每周的运动时间 小时
     */
    @ApiModelProperty(value = "每周的运动时间 小时")
    private String weeklyExerciseTime;

    /**
     * 是否有睡眠障碍 1.没有 2.入睡困难 3.早醒 4.多梦
     */
    @ApiModelProperty(value = "是否有睡眠障碍 1.没有 2.入睡困难 3.早醒 4.多梦")
    private String isSleepDisorder;

    /**
     * 睡眠障碍发生的频率 次/周
     */
    @ApiModelProperty(value = "睡眠障碍发生的频率 次/周")
    private String sleepDisorderAmount;

    /**
     * 是否有过跌倒 0.否 1.是
     */
    @ApiModelProperty(value = "是否有过跌倒 0.否 1.是")
    private Integer isFall;

    /**
     * 跌倒原因
     */
    @ApiModelProperty(value = "跌倒原因")
    private String fallReason;

    /**
     * 就诊前每月医疗总花费
     */
    @ApiModelProperty(value = "就诊前每月医疗总花费")
    private BigDecimal beforeTreatmentMonthlyTotal;

    /**
     * 就诊前每月药费
     */
    @ApiModelProperty(value = "就诊前每月药费")
    private BigDecimal beforeTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊3个月后每月医疗总花费
     */
    @ApiModelProperty(value = "就诊3个月后每月医疗总花费")
    private BigDecimal afterThreeMonthsTreatmentMonthlyTotal;

    /**
     * 就诊3个月后每月药费
     */
    @ApiModelProperty(value = "就诊3个月后每月药费")
    private BigDecimal afterThreeMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊6个月后每月医疗总花费
     */
    @ApiModelProperty(value = "就诊6个月后每月医疗总花费")
    private BigDecimal afterSixMonthsTreatmentMonthlyTotal;

    /**
     * 就诊6个月后每月药费
     */
    @ApiModelProperty(value = "就诊6个月后每月药费")
    private BigDecimal afterSixMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊12个月后每月医疗总花费
     */
    @ApiModelProperty(value = "就诊12个月后每月医疗总花费")
    private BigDecimal afterTwelveMonthsTreatmentMonthlyTotal;

    /**
     * 就诊12个月后每月药费
     */
    @ApiModelProperty(value = "就诊12个月后每月药费")
    private BigDecimal afterTwelveMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 生活方式 评估报告 总结
     */
    @ApiModelProperty(value = "生活方式 评估报告 总结")
    private String lifestyleSummary;

}

