package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SurgicalHistoryVO {

    /**
     * 手术史id
     */
    @ApiModelProperty(value = "手术史id")
    private Integer surgicalHistoryId;

    /**
     * 手术名称
     */
    @ApiModelProperty(value = "手术名称")
    private String surgeryName;

}

