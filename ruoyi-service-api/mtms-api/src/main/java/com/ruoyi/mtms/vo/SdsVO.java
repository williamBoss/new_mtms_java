package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "SdsVO")
@Data
public class SdsVO {
    /**
     * SDS主键
     */
    @ApiModelProperty(value = "SDS主键")
    private Integer sdsId;

    /**
     * 评估ID
     */
    @ApiModelProperty(value = "评估ID")
    private Integer assessmentId;

    /**
     * 患者主键
     */
    @ApiModelProperty(value = "患者主键")
    private Integer patId;

    /**
     * 我感到情绪沮丧，郁闷: 1.很少 2.有时 3.经常 4.持续
     */
    @ApiModelProperty(value = "我感到情绪沮丧，郁闷: 1.很少 2.有时 3.经常 4.持续")
    private Byte sdsQ1;

    /**
     * 我感到早晨心情最好
     */
    @ApiModelProperty(value = "我感到早晨心情最好")
    private Byte sdsQ2;

    /**
     * 我要哭或想哭
     */
    @ApiModelProperty(value = "我要哭或想哭")
    private Byte sdsQ3;

    /**
     * 我晚上睡眠不好
     */
    @ApiModelProperty(value = "我晚上睡眠不好")
    private Byte sdsQ4;

    /**
     * 我吃得和平时一样多
     */
    @ApiModelProperty(value = "我吃得和平时一样多")
    private Byte sdsQ5;

    /**
     * 异性接触时和以往一样感到愉快
     */
    @ApiModelProperty(value = "异性接触时和以往一样感到愉快")
    private Byte sdsQ6;

    /**
     * 我感到体重减轻
     */
    @ApiModelProperty(value = "我感到体重减轻")
    private Byte sdsQ7;

    /**
     * 我有便秘的苦恼
     */
    @ApiModelProperty(value = "我有便秘的苦恼")
    private Byte sdsQ8;

    /**
     * 我的心跳比平时快
     */
    @ApiModelProperty(value = "我的心跳比平时快")
    private Byte sdsQ9;

    /**
     * 我无故感到疲劳
     */
    @ApiModelProperty(value = "我无故感到疲劳")
    private Byte sdsQ10;

    /**
     * 我的头脑象往常一样清楚
     */
    @ApiModelProperty(value = "我的头脑象往常一样清楚")
    private Byte sdsQ11;

    /**
     * 我做事情象平时一样不感到困难
     */
    @ApiModelProperty(value = "我做事情象平时一样不感到困难")
    private Byte sdsQ12;

    /**
     * 我坐卧不安,难以保持平静
     */
    @ApiModelProperty(value = "我坐卧不安,难以保持平静")
    private Byte sdsQ13;

    /**
     * 我对未来感到有希望
     */
    @ApiModelProperty(value = "我对未来感到有希望")
    private Byte sdsQ14;

    /**
     * 我比平时更容易激怒
     */
    @ApiModelProperty(value = "我比平时更容易激怒")
    private Byte sdsQ15;

    /**
     * 我觉得决定什么事很容易
     */
    @ApiModelProperty(value = "我觉得决定什么事很容易")
    private Byte sdsQ16;

    /**
     * 感到自己是有用的和不可缺少的人
     */
    @ApiModelProperty(value = "感到自己是有用的和不可缺少的人")
    private Byte sdsQ17;

    /**
     * 我的生活很有意义
     */
    @ApiModelProperty(value = "我的生活很有意义")
    private Byte sdsQ18;

    /**
     * 假若我死了别人会过得更好
     */
    @ApiModelProperty(value = "假若我死了别人会过得更好")
    private Byte sdsQ19;

    /**
     * 我仍旧喜爱自己平时喜爱的东西
     */
    @ApiModelProperty(value = "我仍旧喜爱自己平时喜爱的东西")
    private Byte sdsQ20;

    /**
     * 分数
     */
    @ApiModelProperty(value = "分数")
    private String sdsScore;

}

