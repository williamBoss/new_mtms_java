package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

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
@Data
@ApiModel(value = "MedicineInfoVO")
public class MedicineInfoVO {
    /**
     * 药品主键
     */
    @ApiModelProperty(value = "药品主键")
    private Integer medId;

    /**
     * 药品名称
     */
    @ApiModelProperty(value = "药品名称")
    private String medName;

    /**
     * 药品规格
     */
    @ApiModelProperty(value = "药品规格")
    private String medSpec;

    /**
     * 药品剂型
     */
    @ApiModelProperty(value = "药品剂型")
    private String medType;

    /**
     * 生产厂家
     */
    @ApiModelProperty(value = "生产厂家")
    private String vendor;

    /**
     * 包装单位
     */
    @ApiModelProperty(value = "包装单位")
    private String packageUnit;

    /**
     * 使用单位
     */
    @ApiModelProperty(value = "使用单位")
    private String useUnit;

    /**
     * 适应症
     */
    @ApiModelProperty(value = "适应症")
    private String indication;

    /**
     * 用法用量
     */
    @ApiModelProperty(value = "用法用量")
    private String usageStandard;

    /**
     * 单价
     */
    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    /**
     * 不良反应
     */
    @ApiModelProperty(value = "不良反应")
    private String untowardEffect;

    /**
     * 禁忌
     */
    @ApiModelProperty(value = "禁忌")
    private String taboo;

    /**
     * 注意事项
     */
    @ApiModelProperty(value = "注意事项")
    private String caution;

    /**
     * 存储方式
     */
    @ApiModelProperty(value = "存储方式")
    private String storageMethod;


}