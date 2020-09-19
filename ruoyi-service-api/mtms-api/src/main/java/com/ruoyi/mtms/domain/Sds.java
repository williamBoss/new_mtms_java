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
* @date 2020/9/19 18:19
* @version V1.0
*/

/**
 * SDS评估表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-Sds")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_sds")
public class Sds extends BaseEntity {
    /**
     * SDS主键
     */
    @TableId(value = "sds_id", type = IdType.AUTO)
    @ApiModelProperty(value = "SDS主键")
    private Integer sdsId;

    /**
     * 评估ID
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估ID")
    private Integer assessmentId;

    /**
     * 患者主键
     */
    @TableField(value = "pat_id")
    @ApiModelProperty(value = "患者主键")
    private Integer patId;

    /**
     * 我感到情绪沮丧，郁闷: 1.很少 2.有时 3.经常 4.持续
     */
    @TableField(value = "sds_q_1")
    @ApiModelProperty(value = "我感到情绪沮丧，郁闷: 1.很少 2.有时 3.经常 4.持续")
    private Integer sdsQ1;

    /**
     * 我感到早晨心情最好
     */
    @TableField(value = "sds_q_2")
    @ApiModelProperty(value = "我感到早晨心情最好")
    private Integer sdsQ2;

    /**
     * 我要哭或想哭
     */
    @TableField(value = "sds_q_3")
    @ApiModelProperty(value = "我要哭或想哭")
    private Integer sdsQ3;

    /**
     * 我晚上睡眠不好
     */
    @TableField(value = "sds_q_4")
    @ApiModelProperty(value = "我晚上睡眠不好")
    private Integer sdsQ4;

    /**
     * 我吃得和平时一样多
     */
    @TableField(value = "sds_q_5")
    @ApiModelProperty(value = "我吃得和平时一样多")
    private Integer sdsQ5;

    /**
     * 异性接触时和以往一样感到愉快
     */
    @TableField(value = "sds_q_6")
    @ApiModelProperty(value = "异性接触时和以往一样感到愉快")
    private Integer sdsQ6;

    /**
     * 我感到体重减轻
     */
    @TableField(value = "sds_q_7")
    @ApiModelProperty(value = "我感到体重减轻")
    private Integer sdsQ7;

    /**
     * 我有便秘的苦恼
     */
    @TableField(value = "sds_q_8")
    @ApiModelProperty(value = "我有便秘的苦恼")
    private Integer sdsQ8;

    /**
     * 我的心跳比平时快
     */
    @TableField(value = "sds_q_9")
    @ApiModelProperty(value = "我的心跳比平时快")
    private Integer sdsQ9;

    /**
     * 我无故感到疲劳
     */
    @TableField(value = "sds_q_1_0")
    @ApiModelProperty(value = "我无故感到疲劳")
    private Integer sdsQ10;

    /**
     * 我的头脑象往常一样清楚
     */
    @TableField(value = "sds_q_1_1")
    @ApiModelProperty(value = "我的头脑象往常一样清楚")
    private Integer sdsQ11;

    /**
     * 我做事情象平时一样不感到困难
     */
    @TableField(value = "sds_q_1_2")
    @ApiModelProperty(value = "我做事情象平时一样不感到困难")
    private Integer sdsQ12;

    /**
     * 我坐卧不安,难以保持平静
     */
    @TableField(value = "sds_q_1_3")
    @ApiModelProperty(value = "我坐卧不安,难以保持平静")
    private Integer sdsQ13;

    /**
     * 我对未来感到有希望
     */
    @TableField(value = "sds_q_1_4")
    @ApiModelProperty(value = "我对未来感到有希望")
    private Integer sdsQ14;

    /**
     * 我比平时更容易激怒
     */
    @TableField(value = "sds_q_1_5")
    @ApiModelProperty(value = "我比平时更容易激怒")
    private Integer sdsQ15;

    /**
     * 我觉得决定什么事很容易
     */
    @TableField(value = "sds_q_1_6")
    @ApiModelProperty(value = "我觉得决定什么事很容易")
    private Integer sdsQ16;

    /**
     * 感到自己是有用的和不可缺少的人
     */
    @TableField(value = "sds_q_1_7")
    @ApiModelProperty(value = "感到自己是有用的和不可缺少的人")
    private Integer sdsQ17;

    /**
     * 我的生活很有意义
     */
    @TableField(value = "sds_q_1_8")
    @ApiModelProperty(value = "我的生活很有意义")
    private Integer sdsQ18;

    /**
     * 假若我死了别人会过得更好
     */
    @TableField(value = "sds_q_1_9")
    @ApiModelProperty(value = "假若我死了别人会过得更好")
    private Integer sdsQ19;

    /**
     * 我仍旧喜爱自己平时喜爱的东西
     */
    @TableField(value = "sds_q_2_0")
    @ApiModelProperty(value = "我仍旧喜爱自己平时喜爱的东西")
    private Integer sdsQ20;

    /**
     * 分数
     */
    @TableField(value = "sds_score")
    @ApiModelProperty(value = "分数")
    private String sdsScore;
}