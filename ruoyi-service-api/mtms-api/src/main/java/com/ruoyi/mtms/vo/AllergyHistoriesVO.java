package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class AllergyHistoriesVO {

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
     * 过敏史 0.无 1.有
     */
    @ApiModelProperty(value = "过敏史 0.无 1.有")
    private Integer allergyHistory;

    @ApiModelProperty(value = "过敏史")
    private List<AllergyHistoryVO> allergyHistories;

}

