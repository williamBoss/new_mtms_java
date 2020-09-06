package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Title: MedicineInfo
 * @Package com.ruoyi.mtms.domain
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @author KING
 * @date 2020/5/27 15:36
 * @version V1.0
 */

/**
 * 药品目录表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-MedicineInfo")
@Data
@TableName(value = "mtms_medicine_info")
public class MedicineInfo {

    /**
     * 药品主键
     */
    @TableId(value = "med_id", type = IdType.AUTO)
    @ApiModelProperty(value = "药品主键")
    private Integer medId;

    /**
     * 药品名称
     */
    @TableField(value = "med_name")
    @ApiModelProperty(value = "药品名称")
    private String medName;

    /**
     * 药品规格
     */
    @TableField(value = "med_spec")
    @ApiModelProperty(value = "药品规格")
    private String medSpec;

    /**
     * 药品剂型
     */
    @TableField(value = "med_type")
    @ApiModelProperty(value = "药品剂型")
    private String medType;

    /**
     * 生产厂家
     */
    @TableField(value = "vendor")
    @ApiModelProperty(value = "生产厂家")
    private String vendor;

    /**
     * 包装单位
     */
    @TableField(value = "package_unit")
    @ApiModelProperty(value = "包装单位")
    private String packageUnit;

    /**
     * 使用单位
     */
    @TableField(value = "use_unit")
    @ApiModelProperty(value = "使用单位")
    private String useUnit;

    /**
     * 适应症
     */
    @TableField(value = "indication")
    @ApiModelProperty(value = "适应症")
    private String indication;

    /**
     * 用法用量
     */
    @TableField(value = "usage_standard")
    @ApiModelProperty(value = "用法用量")
    private String usageStandard;

    /**
     * 单价
     */
    @TableField(value = "unit_price")
    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    /**
     * 不良反应
     */
    @TableField(value = "untoward_effect")
    @ApiModelProperty(value = "不良反应")
    private String untowardEffect;

    /**
     * 禁忌
     */
    @TableField(value = "taboo")
    @ApiModelProperty(value = "禁忌")
    private String taboo;

    /**
     * 注意事项
     */
    @TableField(value = "caution")
    @ApiModelProperty(value = "注意事项")
    private String caution;

    /**
     * 存储方式
     */
    @TableField(value = "storage_method")
    @ApiModelProperty(value = "存储方式")
    private String storageMethod;

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