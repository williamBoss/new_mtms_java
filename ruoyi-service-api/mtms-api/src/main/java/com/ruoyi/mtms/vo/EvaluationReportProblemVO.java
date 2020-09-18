package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class EvaluationReportProblemVO {

    /**
     *
     */
    @ApiModelProperty(value = "")
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
     * 发现的问题
     */
    @ApiModelProperty(value = "发现的问题")
    private String problemDesc;

    /**
     * 干预计划
     */
    @ApiModelProperty(value = "干预计划")
    private String interventionPlan;

    /**
     * 显示排序
     */
    @ApiModelProperty(value = "显示排序")
    private Integer sort;

}

