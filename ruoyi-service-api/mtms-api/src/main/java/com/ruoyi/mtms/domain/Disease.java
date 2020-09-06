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
* @author KING
* @date 2020/9/6 19:52
* @version V1.0
*/

/**
 * 病种表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-Disease")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_disease")
public class Disease extends BaseEntity {
    /**
     * 病种id
     */
    @TableId(value = "disease_id", type = IdType.AUTO)
    @ApiModelProperty(value = "病种id")
    private Integer diseaseId;

    /**
     * 病种名称
     */
    @TableField(value = "disease_name")
    @ApiModelProperty(value = "病种名称")
    private String diseaseName;

    /**
     * 病种编码
     */
    @TableField(value = "disease_key")
    @ApiModelProperty(value = "病种编码")
    private String diseaseKey;
}