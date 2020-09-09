package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author KING
 */
@Data
@ApiModel(value = "MoriskyVO")
public class MoriskyVO {

    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private Integer moriskyId;

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @ApiModelProperty(value = "患者id")
    private Integer patId;

    /**
     * 你是否有忘记服药经历 0.是 1.否
     */
    @ApiModelProperty(value = "你是否有忘记服药经历 0.是 1.否")
    private Byte moriskyQuestion1;

    /**
     * 在过去的2周内，是否有一天或几天您忘记服药 0.是 1.否
     */
    @ApiModelProperty(value = "在过去的2周内，是否有一天或几天您忘记服药 0.是 1.否")
    private Byte moriskyQuestion2;

    /**
     * 治疗期间，当您觉得症状加重或出现其他症状时，您是否未告知医生而自行减少药量或停止服药 0.是 1.否
     */
    @ApiModelProperty(value = "治疗期间，当您觉得症状加重或出现其他症状时，您是否未告知医生而自行减少药量或停止服药 0.是 1.否")
    private Byte moriskyQuestion3;

    /**
     * 当您外出旅行或长时间离家时，您是否有时忘记随身携带药物 0.是 1.否
     */
    @ApiModelProperty(value = "当您外出旅行或长时间离家时，您是否有时忘记随身携带药物 0.是 1.否")
    private Byte moriskyQuestion4;

    /**
     * 昨天您服药了吗 0.是 1.否
     */
    @ApiModelProperty(value = "昨天您服药了吗 0.是 1.否")
    private Byte moriskyQuestion5;

    /**
     * 当您觉得自己的肿瘤已经得到控制时，您是否停止过服药 0.是 1.否
     */
    @ApiModelProperty(value = "当您觉得自己的肿瘤已经得到控制时，您是否停止过服药 0.是 1.否")
    private Byte moriskyQuestion6;

    /**
     * 您是否觉得要坚持治疗计划有困难 0.是 1.否
     */
    @ApiModelProperty(value = "您是否觉得要坚持治疗计划有困难 0.是 1.否")
    private Byte moriskyQuestion7;

    /**
     * 您觉得要记住按时按量服药很难吗 1.从不 2.偶尔 3.有时 4.经常 5.所有时间
     */
    @ApiModelProperty(value = "您觉得要记住按时按量服药很难吗 1.从不 2.偶尔 3.有时 4.经常 5.所有时间")
    private String moriskyQuestion8;

    /**
     * Morisky服药依从性问卷总分
     */
    @ApiModelProperty(value = "Morisky服药依从性问卷总分")
    private String morCountScore;

}

