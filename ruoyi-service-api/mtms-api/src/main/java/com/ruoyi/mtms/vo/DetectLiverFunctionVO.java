package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
@ApiModel
public class DetectLiverFunctionVO {
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
     * 谷丙转氨酶
     */
    @ApiModelProperty(value = "谷丙转氨酶")
    private String alt;

    /**
     * 谷草转氨酶
     */
    @ApiModelProperty(value = "谷草转氨酶")
    private String ast;

    /**
     * 总胆红素
     */
    @ApiModelProperty(value = "总胆红素")
    private String totalBilirubin;

    /**
     * 直接胆红素
     */
    @ApiModelProperty(value = "直接胆红素")
    private String directBilirubin;

    /**
     * 间接胆红素
     */
    @ApiModelProperty(value = "间接胆红素")
    private String indirectBilirubin;

}

