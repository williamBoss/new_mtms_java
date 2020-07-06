package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 病种表
 *
 * @author KING
 */
@Data
@TableName(value = "mtms_disease")
public class Disease {
    /**
     * 病种id
     */
    @TableId(value = "disease_id", type = IdType.AUTO)
    private Integer diseaseId;

    /**
     * 病种名称
     */
    @TableField(value = "disease_name")
    private String diseaseName;

    /**
     * 病种编码
     */
    @TableField(value = "disease_key")
    private String diseaseKey;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableLogic
    @TableField(value = "del_flag", fill = FieldFill.INSERT)
    private Boolean delFlag;

    /**
     * 创建人
     */
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

}