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

import java.time.LocalDate;

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/9/18 15:53
 * @version V1.0
 */

/**
 * 用药记录
 */
@ApiModel(value = "com-ruoyi-mtms-domain-UseMedRecord")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_use_med_record")
public class UseMedRecord extends BaseEntity {
    /**
     * 用药记录主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "用药记录主键id")
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
     * 开始时间
     */
    @TableField(value = "use_start_time")
    @ApiModelProperty(value = "开始时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate useStartTime;

    /**
     * 结束时间
     */
    @TableField(value = "use_end_time")
    @ApiModelProperty(value = "结束时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate useEndTime;

    /**
     * 药品id
     */
    @TableField(value = "med_id")
    @ApiModelProperty(value = "药品id")
    private Integer medId;

    /**
     * 用法
     */
    @TableField(value = "`usage`")
    @ApiModelProperty(value = "用法")
    private String usage;

    /**
     * 月用药量（盒）
     */
    @TableField(value = "dosage_monthly")
    @ApiModelProperty(value = "月用药量（盒）")
    private String dosageMonthly;

    /**
     * 备注（新增/停用）
     */
    @TableField(value = "remark")
    @ApiModelProperty(value = "备注（新增/停用）")
    private String remark;

}