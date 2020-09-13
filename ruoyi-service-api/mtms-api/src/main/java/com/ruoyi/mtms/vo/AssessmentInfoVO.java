package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.mtms.domain.AllergyHistory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author KING
 */
@Data
@ApiModel(value = "AssessmentInfoVO")
public class AssessmentInfoVO {

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 评估患者id
     */
    @ApiModelProperty(value = "评估患者id")
    private Integer patientId;

    /**
     * 评估填写时间
     */
    @ApiModelProperty(value = "评估填写时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime fillDate;

    /**
     * 本次评估主诉
     */
    @ApiModelProperty(value = "本次评估主诉")
    private String mainConsult;

    /**
     * 肝损害 0.否 1.是
     */
    @ApiModelProperty(value = "肝损害 0.否 1.是")
    private Integer liverDamage;

    /**
     * 肝损害详细描述
     */
    @ApiModelProperty(value = "肝损害详细描述")
    private String liverDamageDesc;

    /**
     * 肾损害 0.否 1.是
     */
    @ApiModelProperty(value = "肾损害 0.否 1.是")
    private Integer kidneyDamage;

    /**
     * 肾损害详细描述
     */
    @ApiModelProperty(value = "肾损害详细描述")
    private String kidneyDamageDesc;

    /**
     * 过敏史 0.无 1.有
     */
    @ApiModelProperty(value = "过敏史 0.无 1.有")
    private Integer allergyHistory;

    /**
     * 药物不良反应史 0.无 1.有
     */
    @ApiModelProperty(value = "药物不良反应史 0.无 1.有")
    private Integer medicationSideEffect;

    @ApiModelProperty(value = "过敏史")
    private List<AllergyHistory> allergyHistories;

    @ApiModelProperty(value = "手术id")
    private Integer[] surgicalIds;

    @ApiModelProperty(value = "其他手术名称（用顿号分割）")
    private String surgeryName;

}

