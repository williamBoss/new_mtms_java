package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author KING
 */
@Data
@ApiModel
public class MedicationProblemsVO {

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
     * 病种id
     */
    @ApiModelProperty(value = "病种id")
    private Integer diseaseId;

    @ApiModelProperty(value = "病种名称")
    private String diseaseName;

    /**
     * 药物id
     */
    @ApiModelProperty(value = "药物id")
    private Integer medId;

    @ApiModelProperty(value = "药物名称")
    private String medName;

    /**
     * 适应症
     */
    @ApiModelProperty(value = "适应症")
    private Integer indications;

    /**
     * 有效性
     */
    @ApiModelProperty(value = "有效性")
    private Integer effectiveness;

    /**
     * 安全性
     */
    @ApiModelProperty(value = "安全性")
    private Integer safety;

    /**
     * 依从性
     */
    @ApiModelProperty(value = "依从性")
    private Integer compliance;

    /**
     * 具体问题
     */
    @ApiModelProperty(value = "具体问题")
    private String problem;

    /**
     * 处理建议
     */
    @ApiModelProperty(value = "处理建议")
    private String treatmentSuggestion;

    /**
     * 是否解决：1.本次就诊解决 2.未解决 3.待解决
     */
    @ApiModelProperty(value = "是否解决：1.本次就诊解决 2.未解决 3.待解决")
    private Integer isResolved;

    /**
     * 改善详情
     */
    @ApiModelProperty(value = "改善详情")
    private String improvementDetails;

}

