package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
@ApiModel
public class DetectElectrolyteVO {
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
     * 检测日期
     */
    @ApiModelProperty(value = "检测日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate detectDate;

    /**
     * 钙
     */
    @ApiModelProperty(value = "钙")
    private String calcium;

    /**
     * 磷
     */
    @ApiModelProperty(value = "磷")
    private String phosphorus;

    /**
     * 25-OH-维生素D
     */
    @ApiModelProperty(value = "25-OH-维生素D")
    private String tfOhVitd;

}

