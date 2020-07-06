package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* @Title: Lifestyle
* @Package com.ruoyi.mtms.domain
* @Description: ${TODO}(这里用一句话描述这个类的作用)
* @author KING
* @date 2020/5/27 15:36
* @version V1.0
*/

/**
    * 生活方式与评估表
    */
@ApiModel(value="com-ruoyi-mtms-domain-Lifestyle")
@Data
@TableName(value = "mtms_lifestyle")
public class Lifestyle {
    /**
     * 生活方式id
     */
    @TableId(value = "lifestyle_id", type = IdType.AUTO)
    @ApiModelProperty(value="生活方式id")
    private Integer lifestyleId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 体重变化类型 1.增加 2.减少
     */
    @TableField(value = "weight_change_type")
    @ApiModelProperty(value="体重变化类型 1.增加 2.减少")
    private Integer weightChangeType;

    /**
     * 体重变化具体数值
     */
    @TableField(value = "weight_change_value")
    @ApiModelProperty(value="体重变化具体数值")
    private Double weightChangeValue;

    /**
     * 每日主食量
     */
    @TableField(value = "daily_basic_food_amount")
    @ApiModelProperty(value="每日主食量")
    private Integer dailyBasicFoodAmount;

    /**
     * 每日摄入盐量: 1.少 2.中 3.多
     */
    @TableField(value = "daily_salt_amount")
    @ApiModelProperty(value="每日摄入盐量: 1.少 2.中 3.多")
    private Integer dailySaltAmount;

    /**
     * 每日摄入油脂量: 1.少 2.中 3.多
     */
    @TableField(value = "daily_fat_amount")
    @ApiModelProperty(value="每日摄入油脂量: 1.少 2.中 3.多")
    private Integer dailyFatAmount;

    /**
     * 每日摄入蔬菜水果量: 1.少 2.中 3.多
     */
    @TableField(value = "daily_vegetable_fruit_amount")
    @ApiModelProperty(value="每日摄入蔬菜水果量: 1.少 2.中 3.多")
    private Integer dailyVegetableFruitAmount;

    /**
     * 每次的运动时间 分钟
     */
    @TableField(value = "each_exercise_time")
    @ApiModelProperty(value="每次的运动时间 分钟")
    private String eachExerciseTime;

    /**
     * 每周的运动频率 次
     */
    @TableField(value = "weekly_exercise_frequency")
    @ApiModelProperty(value="每周的运动频率 次")
    private String weeklyExerciseFrequency;

    /**
     * 每周的运动时间 小时
     */
    @TableField(value = "weekly_exercise_time")
    @ApiModelProperty(value="每周的运动时间 小时")
    private String weeklyExerciseTime;

    /**
     * 通常的运动项目
     */
    @TableField(value = "usual_sports")
    @ApiModelProperty(value="通常的运动项目")
    private String usualSports;

    /**
     * 是否有睡眠障碍 1.没有 2.入睡困难 3.早醒 4.多梦
     */
    @TableField(value = "is_sleep_disorder")
    @ApiModelProperty(value="是否有睡眠障碍 1.没有 2.入睡困难 3.早醒 4.多梦")
    private Integer isSleepDisorder;

    /**
     * 睡眠障碍发生的频率 次/周
     */
    @TableField(value = "sleep_disorder_amount")
    @ApiModelProperty(value="睡眠障碍发生的频率 次/周")
    private String sleepDisorderAmount;

    /**
     * 是否有过跌倒 0.否 1.是
     */
    @TableField(value = "is_fall")
    @ApiModelProperty(value="是否有过跌倒 0.否 1.是")
    private Integer isFall;

    /**
     * 跌倒原因
     */
    @TableField(value = "fall_reason")
    @ApiModelProperty(value="跌倒原因")
    private String fallReason;

    /**
     * 就诊前每月医疗总花费
     */
    @TableField(value = "before_treatment_monthly_total")
    @ApiModelProperty(value="就诊前每月医疗总花费")
    private BigDecimal beforeTreatmentMonthlyTotal;

    /**
     * 就诊前每月药费
     */
    @TableField(value = "before_treatment_monthly_medical_expenses")
    @ApiModelProperty(value="就诊前每月药费")
    private BigDecimal beforeTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊3个月后每月医疗总花费
     */
    @TableField(value = "after_three_months_treatment_monthly_total")
    @ApiModelProperty(value="就诊3个月后每月医疗总花费")
    private BigDecimal afterThreeMonthsTreatmentMonthlyTotal;

    /**
     * 就诊3个月后每月药费
     */
    @TableField(value = "after_three_months_treatment_monthly_medical_expenses")
    @ApiModelProperty(value="就诊3个月后每月药费")
    private BigDecimal afterThreeMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊6个月后每月医疗总花费
     */
    @TableField(value = "after_six_months_treatment_monthly_total")
    @ApiModelProperty(value="就诊6个月后每月医疗总花费")
    private BigDecimal afterSixMonthsTreatmentMonthlyTotal;

    /**
     * 就诊6个月后每月药费
     */
    @TableField(value = "after_six_months_treatment_monthly_medical_expenses")
    @ApiModelProperty(value="就诊6个月后每月药费")
    private BigDecimal afterSixMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 就诊12个月后每月医疗总花费
     */
    @TableField(value = "after_twelve_months_treatment_monthly_total")
    @ApiModelProperty(value="就诊12个月后每月医疗总花费")
    private BigDecimal afterTwelveMonthsTreatmentMonthlyTotal;

    /**
     * 就诊12个月后每月药费
     */
    @TableField(value = "after_twelve_months_treatment_monthly_medical_expenses")
    @ApiModelProperty(value="就诊12个月后每月药费")
    private BigDecimal afterTwelveMonthsTreatmentMonthlyMedicalExpenses;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableField(value = "del_flag")
    @ApiModelProperty(value="删除状态(0-正常,1-已删除)")
    private Boolean delFlag;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    @ApiModelProperty(value="创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    @ApiModelProperty(value="更新人")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    public static final String COL_LIFESTYLE_ID = "lifestyle_id";

    public static final String COL_ASSESSMENT_ID = "assessment_id";

    public static final String COL_WEIGHT_CHANGE_TYPE = "weight_change_type";

    public static final String COL_WEIGHT_CHANGE_VALUE = "weight_change_value";

    public static final String COL_DAILY_BASIC_FOOD_AMOUNT = "daily_basic_food_amount";

    public static final String COL_DAILY_SALT_AMOUNT = "daily_salt_amount";

    public static final String COL_DAILY_FAT_AMOUNT = "daily_fat_amount";

    public static final String COL_DAILY_VEGETABLE_FRUIT_AMOUNT = "daily_vegetable_fruit_amount";

    public static final String COL_EACH_EXERCISE_TIME = "each_exercise_time";

    public static final String COL_WEEKLY_EXERCISE_FREQUENCY = "weekly_exercise_frequency";

    public static final String COL_WEEKLY_EXERCISE_TIME = "weekly_exercise_time";

    public static final String COL_USUAL_SPORTS = "usual_sports";

    public static final String COL_IS_SLEEP_DISORDER = "is_sleep_disorder";

    public static final String COL_SLEEP_DISORDER_AMOUNT = "sleep_disorder_amount";

    public static final String COL_IS_FALL = "is_fall";

    public static final String COL_FALL_REASON = "fall_reason";

    public static final String COL_BEFORE_TREATMENT_MONTHLY_TOTAL = "before_treatment_monthly_total";

    public static final String COL_BEFORE_TREATMENT_MONTHLY_MEDICAL_EXPENSES = "before_treatment_monthly_medical_expenses";

    public static final String COL_AFTER_THREE_MONTHS_TREATMENT_MONTHLY_TOTAL = "after_three_months_treatment_monthly_total";

    public static final String COL_AFTER_THREE_MONTHS_TREATMENT_MONTHLY_MEDICAL_EXPENSES = "after_three_months_treatment_monthly_medical_expenses";

    public static final String COL_AFTER_SIX_MONTHS_TREATMENT_MONTHLY_TOTAL = "after_six_months_treatment_monthly_total";

    public static final String COL_AFTER_SIX_MONTHS_TREATMENT_MONTHLY_MEDICAL_EXPENSES = "after_six_months_treatment_monthly_medical_expenses";

    public static final String COL_AFTER_TWELVE_MONTHS_TREATMENT_MONTHLY_TOTAL = "after_twelve_months_treatment_monthly_total";

    public static final String COL_AFTER_TWELVE_MONTHS_TREATMENT_MONTHLY_MEDICAL_EXPENSES = "after_twelve_months_treatment_monthly_medical_expenses";

    public static final String COL_DEL_FLAG = "del_flag";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_TIME = "update_time";
}