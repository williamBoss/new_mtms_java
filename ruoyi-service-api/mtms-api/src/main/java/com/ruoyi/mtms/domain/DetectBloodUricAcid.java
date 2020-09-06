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
* ${TODO}
* @author KING
* @date 2020/9/6 19:52
* @version V1.0
*/

/**
 * 血尿酸检测检验
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectBloodUricAcid")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_blood_uric_acid")
public class DetectBloodUricAcid extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_ASSESSMENT_ID = "assessment_id";
    public static final String COL_PATIENT_ID = "patient_id";
    public static final String COL_DETECT_DATE = "detect_date";
    public static final String COL_BLOOD_URIC_ACID_VALUE = "blood_uric_acid_value";
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
     * 血尿酸（mmol/L）
     */
    @TableField(value = "blood_uric_acid_value")
    @ApiModelProperty(value = "血尿酸（mmol/L）")
    private String bloodUricAcidValue;
}