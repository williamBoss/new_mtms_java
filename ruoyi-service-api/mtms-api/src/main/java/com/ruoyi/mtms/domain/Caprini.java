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
 * @date 2020/11/26 15:05
 * @version V1.0
 */

/**
 * caprini静脉血栓评分
 */
@ApiModel(value = "com-ruoyi-mtms-domain-Caprini")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_caprini")
public class Caprini extends BaseEntity {
    /**
     * caprini主键
     */
    @TableId(value = "caprini_id", type = IdType.AUTO)
    @ApiModelProperty(value = "caprini主键")
    private Integer capriniId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者主键
     */
    @TableField(value = "pat_id")
    @ApiModelProperty(value = "患者主键")
    private Integer patId;

    /**
     * 选项值 逗号分隔
     */
    @TableField(value = "caprini_choose")
    @ApiModelProperty(value = "选项值 逗号分隔")
    private String capriniChoose;


    @ApiModelProperty(value = "选项值 逗号分隔")
    @TableField(exist = false)
    private String[] capriniChooseArr;

    /**
     * 分数
     */
    @TableField(value = "caprini_score")
    @ApiModelProperty(value = "分数")
    private String capriniScore;
}