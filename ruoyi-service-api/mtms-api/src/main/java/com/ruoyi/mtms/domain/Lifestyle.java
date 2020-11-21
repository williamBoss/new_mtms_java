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

import java.math.BigDecimal;

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/9/9 19:39
 * @version V1.0
 */

/**
 * 生活方式与评估表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-Lifestyle")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_lifestyle")
public class Lifestyle extends BaseEntity {
    /**
     * 生活方式id
     */
    @TableId(value = "lifestyle_id", type = IdType.AUTO)
    @ApiModelProperty(value = "生活方式id")
    private Integer lifestyleId;

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
     * 体重变化类型 1.增加 2.减少
     */
    @TableField(value = "weight_change_type")
    @ApiModelProperty(value = "体重变化类型 1.增加 2.减少")
    private Integer weightChangeType;

    /**
     * 体重变化具体数值
     */
    @TableField(value = "weight_change_value")
    @ApiModelProperty(value = "体重变化具体数值")
    private Double weightChangeValue;

    /**
     * 每日主食量
     */
    @TableField(value = "daily_basic_food_amount")
    @ApiModelProperty(value = "每日主食量")
    private Integer dailyBasicFoodAmount;

    /**
     * 每日摄入盐量: 1.少 2.中 3.多
     */
    @TableField(value = "daily_salt_amount")
    @ApiModelProperty(value = "每日摄入盐量: 1.少 2.中 3.多")
    private Integer dailySaltAmount;

    /**
     * 是否抽烟 1.是 2.否 3.已戒烟
     */
    @TableField(value = "is_smorker")
    @ApiModelProperty(value = "是否抽烟 1.是 2.否 3.已戒烟")
    private Integer isSmorker;

    /**
     * 吸烟量
     */
    @TableField(value = "smoking_num")
    @ApiModelProperty(value = "吸烟量")
    private Integer smokingNum;

    /**
     * 吸烟年限
     */
    @TableField(value = "smoking_year")
    @ApiModelProperty(value = "吸烟年限")
    private Integer smokingYear;

    /**
     * 戒烟时间
     */
    @TableField(value = "quit_smoking_time")
    @ApiModelProperty(value = "戒烟时间")
    private Integer quitSmokingTime;

    /**
     * 是否饮酒 1.是 2.否
     */
    @TableField(value = "is_drinking")
    @ApiModelProperty(value = "是否饮酒 1.是 2.否")
    private Integer isDrinking;

    /**
     * 饮酒量
     */
    @TableField(value = "drinking_num")
    @ApiModelProperty(value = "饮酒量")
    private Integer drinkingNum;

    /**
     * 饮酒年限
     */
    @TableField(value = "drinking_year")
    @ApiModelProperty(value = "饮酒年限")
    private Integer drinkingYear;

    /**
     * 每日摄入油脂量: 1.少 2.中 3.多
     */
    @TableField(value = "daily_fat_amount")
    @ApiModelProperty(value = "每日摄入油脂量: 1.少 2.中 3.多")
    private Integer dailyFatAmount;

    /**
     * 每日摄入蔬菜水果量: 1.少 2.中 3.多
     */
    @TableField(value = "daily_vegetable_fruit_amount")
    @ApiModelProperty(value = "每日摄入蔬菜水果量: 1.少 2.中 3.多")
    private Integer dailyVegetableFruitAmount;

    /**
     * 是否运动 1.是 2.否
     */
    @TableField(value = "is_exercise")
    @ApiModelProperty(value = "是否运动 1.是 2.否")
    private Integer isExercise;

    /**
     * 通常的运动项目
     */
    @TableField(value = "usual_sports")
    @ApiModelProperty(value = "通常的运动项目")
    private String usualSports;

    /**
     * 每次的运动时间 分钟
     */
    @TableField(value = "each_exercise_time")
    @ApiModelProperty(value = "每次的运动时间 分钟")
    private String eachExerciseTime;

    /**
     * 每周的运动频率 次
     */
    @TableField(value = "weekly_exercise_frequency")
    @ApiModelProperty(value = "每周的运动频率 次")
    private String weeklyExerciseFrequency;

    /**
     * 每周的运动时间 小时
     */
    @TableField(value = "weekly_exercise_time")
    @ApiModelProperty(value = "每周的运动时间 小时")
    private String weeklyExerciseTime;

    /**
     * 是否有睡眠障碍 1.没有 2.入睡困难 3.早醒 4.多梦
     */
    @TableField(value = "is_sleep_disorder")
    @ApiModelProperty(value = "是否有睡眠障碍 1.没有 2.入睡困难 3.早醒 4.多梦")
    private Integer isSleepDisorder;

    /**
     * 睡眠障碍发生的频率 次/周
     */
    @TableField(value = "sleep_disorder_amount")
    @ApiModelProperty(value = "睡眠障碍发生的频率 次/周")
    private String sleepDisorderAmount;

    /**
     * 是否有过跌倒 0.否 1.是
     */
    @TableField(value = "is_fall")
    @ApiModelProperty(value = "是否有过跌倒 0.否 1.是")
    private Integer isFall;

    /**
     * 跌倒原因
     */
    @TableField(value = "fall_reason")
    @ApiModelProperty(value = "跌倒原因")
    private String fallReason;

    /**
     * 就诊前每月医疗总花费
     */
    @TableField(value = "before_treatment_monthly_total")
    @ApiModelProperty(value = "就诊前每月医疗总花费")
    private BigDecimal beforeTreatmentMonthlyTotal;

    /**
     * 就诊前每月药费
     */
    @TableField(value = "before_treatment_monthly_medical_expenses")
    @ApiModelProperty(value = "就诊前每月药费")
    private BigDecimal beforeTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊3个月后每月医疗总花费
     */
    @TableField(value = "after_three_months_treatment_monthly_total")
    @ApiModelProperty(value = "就诊3个月后每月医疗总花费")
    private BigDecimal afterThreeMonthsTreatmentMonthlyTotal;

    /**
     * 就诊3个月后每月药费
     */
    @TableField(value = "after_three_months_treatment_monthly_medical_expenses")
    @ApiModelProperty(value = "就诊3个月后每月药费")
    private BigDecimal afterThreeMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊6个月后每月医疗总花费
     */
    @TableField(value = "after_six_months_treatment_monthly_total")
    @ApiModelProperty(value = "就诊6个月后每月医疗总花费")
    private BigDecimal afterSixMonthsTreatmentMonthlyTotal;

    /**
     * 就诊6个月后每月药费
     */
    @TableField(value = "after_six_months_treatment_monthly_medical_expenses")
    @ApiModelProperty(value = "就诊6个月后每月药费")
    private BigDecimal afterSixMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊12个月后每月医疗总花费
     */
    @TableField(value = "after_twelve_months_treatment_monthly_total")
    @ApiModelProperty(value = "就诊12个月后每月医疗总花费")
    private BigDecimal afterTwelveMonthsTreatmentMonthlyTotal;

    /**
     * 就诊12个月后每月药费
     */
    @TableField(value = "after_twelve_months_treatment_monthly_medical_expenses")
    @ApiModelProperty(value = "就诊12个月后每月药费")
    private BigDecimal afterTwelveMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 费用备注
     */
    @TableField(value = "treatment_total_remark")
    @ApiModelProperty(value = "费用备注")
    private String treatmentTotalRemark;

    /**
     * 生活方式 评估报告 总结
     */
    @TableField(value = "lifestyle_summary")
    @ApiModelProperty(value = "生活方式 评估报告 总结")
    private String lifestyleSummary;
}