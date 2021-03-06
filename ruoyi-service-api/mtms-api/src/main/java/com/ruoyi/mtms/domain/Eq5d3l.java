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
* @date 2020/9/19 18:18
* @version V1.0
*/

/**
 * EQ-5D-3L评估表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-Eq5d3l")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_eq5d3l")
public class Eq5d3l extends BaseEntity {
    /**
     * EQ-5D-3L主键
     */
    @TableId(value = "eq_5d_3l_id", type = IdType.AUTO)
    @ApiModelProperty(value = "EQ-5D-3L主键")
    private Integer eq5d3lId;

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
     * 行动问题
     */
    @TableField(value = "action_q")
    @ApiModelProperty(value = "行动问题")
    private Integer actionQ;

    /**
     * 自己照顾自己
     */
    @TableField(value = "look_after_self_q")
    @ApiModelProperty(value = "自己照顾自己")
    private Integer lookAfterSelfQ;

    /**
     * 日常活动
     */
    @TableField(value = "daily_act_q")
    @ApiModelProperty(value = "日常活动")
    private Integer dailyActQ;

    /**
     * 疼痛/不舒服问题
     */
    @TableField(value = "pain_q")
    @ApiModelProperty(value = "疼痛/不舒服问题")
    private Integer painQ;

    /**
     * 焦虑抑郁问题
     */
    @TableField(value = "anxiety_q")
    @ApiModelProperty(value = "焦虑抑郁问题")
    private Integer anxietyQ;

    /**
     * 分数
     */
    @TableField(value = "eq5d3l_score")
    @ApiModelProperty(value = "分数")
    private String eq5d3lScore;
}