package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author KING
 */
@Data
@ApiModel
public class LiverDamageVO {

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
     * 肝损害 0.否 1.是
     */
    @ApiModelProperty(value = "肝损害 0.否 1.是")
    private Integer liverDamage;

    /**
     * 肝损害详细描述
     */
    @ApiModelProperty(value = "肝损害详细描述")
    private String liverDamageDesc;

}

