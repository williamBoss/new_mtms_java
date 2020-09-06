package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Title: FamilyMedicalHistory
 * @Package com.ruoyi.mtms.domain
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @author KING
 * @date 2020/5/27 15:36
 * @version V1.0
 */

/**
 * 家族病史与评估关系表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-FamilyMedicalHistory")
@Data
@TableName(value = "mtms_family_medical_history")
public class FamilyMedicalHistory {
    /**
     * 家族病史id
     */
    @TableId(value = "family_history_id", type = IdType.AUTO)
    @ApiModelProperty(value = "家族病史id")
    private Integer familyHistoryId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 家族病史病种id
     */
    @TableField(value = "disease_id")
    @ApiModelProperty(value = "家族病史病种id")
    private Integer diseaseId;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableLogic
    @TableField(value = "del_flag", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "删除状态(0-正常,1-已删除)")
    private Boolean delFlag;

    /**
     * 创建人
     */
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新人")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}