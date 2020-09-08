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
 *
 * @author KING
 * @date 2020/9/9 0:16
 * @version V1.0
 */

/**
 * 患者就诊历史记录表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-PatientTreatmentHistory")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_patient_treatment_history")
public class PatientTreatmentHistory extends BaseEntity {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 接诊日期
     */
    @TableField(value = "consultation_date")
    @ApiModelProperty(value = "接诊日期")
    private LocalDateTime consultationDate;

    /**
     * 就诊后一年急诊/输液次数
     */
    @TableField(value = "emergency_infusion_num")
    @ApiModelProperty(value = "就诊后一年急诊/输液次数")
    private Integer emergencyInfusionNum;

    /**
     * 就诊后一年住院次数
     */
    @TableField(value = "hospitalization_num")
    @ApiModelProperty(value = "就诊后一年住院次数")
    private Integer hospitalizationNum;

    /**
     * 接诊医师
     */
    @TableField(value = "physician")
    @ApiModelProperty(value = "接诊医师")
    private String physician;

    /**
     * 接诊医师科室
     */
    @TableField(value = "department")
    @ApiModelProperty(value = "接诊医师科室")
    private String department;
}