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
 * 同型半胱氨酸检测检验
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectHomocysteine")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_homocysteine")
public class DetectHomocysteine extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_ASSESSMENT_ID = "assessment_id";
    public static final String COL_PATIENT_ID = "patient_id";
    public static final String COL_DETECT_DATE = "detect_date";
    public static final String COL_HOMOCYSTEINE_VALUE = "homocysteine_value";
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
     * 同型半胱氨酸（umol/L）
     */
    @TableField(value = "homocysteine_value")
    @ApiModelProperty(value = "同型半胱氨酸（umol/L）")
    private String homocysteineValue;
}