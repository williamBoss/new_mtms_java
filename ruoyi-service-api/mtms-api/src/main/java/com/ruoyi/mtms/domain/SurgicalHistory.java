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

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/9/6 19:52
 * @version V1.0
 */

/**
 * 诊断手术史库表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-SurgicalHistory")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_surgical_history")
public class SurgicalHistory extends BaseEntity {
    /**
     * 手术史id
     */
    @TableId(value = "surgical_history_id", type = IdType.AUTO)
    @ApiModelProperty(value = "手术史id")
    private Integer surgicalHistoryId;

    /**
     * 手术名称
     */
    @TableField(value = "surgery_name")
    @ApiModelProperty(value = "手术名称")
    private String surgeryName;
}