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
 * 既往手术史与评估关系表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-PastSurgicalHistory")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_past_surgical_history")
public class PastSurgicalHistory extends BaseEntity {
    /**
     * 既往手术史id
     */
    @TableId(value = "past_surgical_history_id", type = IdType.AUTO)
    @ApiModelProperty(value = "既往手术史id")
    private Integer pastSurgicalHistoryId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 手术名称id
     */
    @TableField(value = "surgical_history_id")
    @ApiModelProperty(value = "手术名称id")
    private Integer surgicalHistoryId;
}