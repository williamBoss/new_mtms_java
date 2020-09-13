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
 * 其他检测检验
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectOther")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_other")
public class DetectOther extends BaseEntity {
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
     * 检测项名称
     */
    @TableField(value = "detect_name")
    @ApiModelProperty(value = "检测项名称")
    private String detectName;

    /**
     * 检测项单位
     */
    @TableField(value = "detect_unit")
    @ApiModelProperty(value = "检测项单位")
    private String detectUnit;

    /**
     * 检测值
     */
    @TableField(value = "detect_value")
    @ApiModelProperty(value = "检测值")
    private String detectValue;
}