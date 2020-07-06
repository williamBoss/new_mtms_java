package com.ruoyi.mtms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author KING
 */
@ApiModel(value = "AssessmentDTO")
@Data
public class AssessmentDTO {

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 评估填写时间
     */
    @ApiModelProperty(value = "评估填写时间")
    private Date fillDate;

    /**
     * 本次评估主诉
     */
    @ApiModelProperty(value = "本次评估主诉")
    private String mainConsult;

    /**
     * 肝损害 0.否 1.是
     */
    @ApiModelProperty(value = "肝损害 0.否 1.是")
    private Boolean liverDamage;

    /**
     * 肝损害详细描述
     */
    @ApiModelProperty(value = "肝损害详细描述")
    private String liverDamageDesc;

    /**
     * 肾损害 0.否 1.是
     */
    @ApiModelProperty(value = "肾损害 0.否 1.是")
    private Boolean kidneyDamage;

    /**
     * 肾损害详细描述
     */
    @ApiModelProperty(value = "肾损害详细描述")
    private String kidneyDamageDesc;

    /**
     * 过敏史 0.无 1.有
     */
    @ApiModelProperty(value = "过敏史 0.无 1.有")
    private Boolean allergyHistory;

    /**
     * 过敏症状
     */
    @ApiModelProperty(value = "过敏症状")
    private String allergySymptoms;

    /**
     * 过敏发生时间
     */
    @ApiModelProperty(value = "过敏发生时间")
    private Date allergyDatetime;

    /**
     * 药物不良反应史 0.无 1.有
     */
    @ApiModelProperty(value = "药物不良反应史 0.无 1.有")
    private Boolean medicationSideEffect;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @ApiModelProperty(value = "删除状态(0-正常,1-已删除)")
    private Boolean delFlag;

    private String patientName;

    private String phone;

    private String idCardNum;

    private String fillDateStart;

    private String fillDateEnd;

}

