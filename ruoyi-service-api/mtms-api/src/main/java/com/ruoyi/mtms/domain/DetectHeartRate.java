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

import java.time.LocalDateTime;

/**
* ${TODO}
* @author KING
* @date 2020/9/6 19:52
* @version V1.0
*/

/**
 * 心率检测检验
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectHeartRate")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_heart_rate")
public class DetectHeartRate extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_ASSESSMENT_ID = "assessment_id";
    public static final String COL_PATIENT_ID = "patient_id";
    public static final String COL_DETECT_DATE = "detect_date";
    public static final String COL_MORNING_VALUE = "morning_value";
    public static final String COL_NOON_VALUE = "noon_value";
    public static final String COL_NIGHT_VALUE = "night_value";
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime detectDate;

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