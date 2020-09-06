package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* ${TODO}
* @author KING
* @date 2020/9/5 16:32
* @version V1.0
*/

/**
 * 血糖检测检验
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectBloodSugar")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_blood_sugar")
public class DetectBloodSugar extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_ASSESSMENT_ID = "assessment_id";
    public static final String COL_PATIENT_ID = "patient_id";
    public static final String COL_DETECT_DATE = "detect_date";
    public static final String COL_FASTING_BLOOD_GLUCOSE = "fasting_blood_glucose";
    public static final String COL_GLYCATED_HEMOGLOBIN = "glycated_hemoglobin";
    public static final String COL_TWO_HOURS_POSTPRANDIAL = "two_hours_postprandial";
    public static final String COL_URINE_MICROALBUMIN = "urine_microalbumin";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_CREATE_BY = "create_by";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_UPDATE_BY = "update_by";
    public static final String COL_UPDATE_TIME = "update_time";
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
     * 空腹血糖(mmol/L)
     */
    @TableField(value = "fasting_blood_glucose")
    @ApiModelProperty(value = "空腹血糖(mmol/L)")
    private String fastingBloodGlucose;

    /**
     * 糖化血红蛋白(%)
     */
    @TableField(value = "glycated_hemoglobin")
    @ApiModelProperty(value = "糖化血红蛋白(%)")
    private String glycatedHemoglobin;

    /**
     * 餐后2小时血糖（mmol/L）
     */
    @TableField(value = "two_hours_postprandial")
    @ApiModelProperty(value = "餐后2小时血糖（mmol/L）")
    private String twoHoursPostprandial;

    /**
     * 尿微量白蛋白（mg/L）
     */
    @TableField(value = "urine_microalbumin")
    @ApiModelProperty(value = "尿微量白蛋白（mg/L）")
    private String urineMicroalbumin;
}