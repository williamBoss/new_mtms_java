package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class PastSurgicalHistoryVO {

    /**
     * 既往手术史id
     */
    @ApiModelProperty(value = "既往手术史id")
    private Integer pastSurgicalHistoryId;

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
     * 手术名称id
     */
    @ApiModelProperty(value = "手术名称id")
    private Integer surgicalHistoryId;

    @ApiModelProperty(value = "手术id")
    private Integer[] surgicalIds;

    @ApiModelProperty(value = "其他手术名称（用顿号分割）")
    private String surgeryName;

}

