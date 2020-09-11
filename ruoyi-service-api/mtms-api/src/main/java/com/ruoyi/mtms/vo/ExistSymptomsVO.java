package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author KING
 */
@Data
@ApiModel(value = "ExistSymptomsVO")
public class ExistSymptomsVO extends SymptomDescriptionVO {

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

    @ApiModelProperty(value = "本次评估主诉")
    private String mainConsult;

}

