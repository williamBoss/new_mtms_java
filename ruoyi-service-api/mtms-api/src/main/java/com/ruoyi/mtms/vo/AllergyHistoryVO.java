package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel(value = "AllergyHistoryVO")
public class AllergyHistoryVO {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private Integer id;

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
     * 过敏原
     */
    @ApiModelProperty(value = "过敏原")
    private String allergen;

    /**
     * 过敏症状
     */
    @ApiModelProperty(value = "过敏症状")
    private String allergySymptoms;

    /**
     * 过敏发生时间
     */
    @ApiModelProperty(value = "过敏发生时间")
    private LocalDateTime allergyDatetime;

}

