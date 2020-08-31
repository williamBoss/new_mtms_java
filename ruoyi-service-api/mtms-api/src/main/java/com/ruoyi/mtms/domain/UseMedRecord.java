package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/8/31 16:38
 * @version V1.0
 */

/**
 * 用药记录
 */
@ApiModel(value = "com-ruoyi-mtms-domain-UseMedRecord")
@Data
@TableName(value = "mtms_use_med_record")
public class UseMedRecord {
    /**
     * 用药记录主键id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "用药记录主键id")
    private Integer id;

    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    @TableField(value = "patient_id")
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 开始时间
     */
    @TableField(value = "use_start_tIme")
    @ApiModelProperty(value = "开始时间")
    private LocalDateTime useStartTime;

    /**
     * 结束时间
     */
    @TableField(value = "use_end_time")
    @ApiModelProperty(value = "结束时间")
    private LocalDateTime useEndTime;

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

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableField(value = "del_flag")
    @ApiModelProperty(value = "删除状态(0-正常,1-已删除)")
    private Boolean delFlag;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    @ApiModelProperty(value = "更新人")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

}