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
* @date 2020/11/26 0:10
* @version V1.0
*/
/**
    * vas评估表
    */
@ApiModel(value="com-ruoyi-mtms-domain-Vas")
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "mtms_vas")
public class Vas extends BaseEntity {
    /**
     * vas主键
     */
    @TableId(value = "vas_id", type = IdType.AUTO)
    @ApiModelProperty(value="vas主键")
    private Integer vasId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 患者主键
     */
    @TableField(value = "pat_id")
    @ApiModelProperty(value="患者主键")
    private Integer patId;

    /**
     * 分数
     */
    @TableField(value = "vas_score")
    @ApiModelProperty(value="分数")
    private String vasScore;
}