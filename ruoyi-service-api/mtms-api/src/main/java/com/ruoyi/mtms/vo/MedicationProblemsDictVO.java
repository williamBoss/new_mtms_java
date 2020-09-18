package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class MedicationProblemsDictVO {

    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 问题类型 1.适应症 2.有效性 3.安全性 4.依从性
     */
    @ApiModelProperty(value = "问题类型 1.适应症 2.有效性 3.安全性 4.依从性 ")
    private Integer problemType;

    /**
     * 药物治疗相关问题描述
     */
    @ApiModelProperty(value = "药物治疗相关问题描述")
    private String medicationProblems;

    @ApiModelProperty(value = "子级问题列表")
    private List<MedicationProblemsDictVO> childList;

}

