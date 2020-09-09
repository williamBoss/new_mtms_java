package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ParVO")
public class ParVO {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private Integer parId;

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @ApiModelProperty(value = "患者id")
    private Integer patId;

    /**
     * 10年发病风险
     */
    @ApiModelProperty(value = "10年发病风险")
    private String riskTenYear;

    /**
     * 10年发病风险等级： 1.低危 2.中危 3.高危
     */
    @ApiModelProperty(value = "10年发病风险等级： 1.低危 2.中危 3.高危")
    private Integer riskTenYearLevel;

    /**
     * 理想危险因素状态下,10年发病风险应小于
     */
    @ApiModelProperty(value = "理想危险因素状态下,10年发病风险应小于")
    private String estimatedRiskTenYear;

    /**
     * 终生发病风险
     */
    @ApiModelProperty(value = "终生发病风险")
    private String riskLifetime;

    /**
     * 终生发病风险等级： 1.低危 2.中危 3.高危
     */
    @ApiModelProperty(value = "终生发病风险等级： 1.低危 2.中危 3.高危")
    private Integer riskLifetimeLevel;

    /**
     * 理想危险因素状态下,终生发病风险应小于
     */
    @ApiModelProperty(value = "理想危险因素状态下,终生发病风险应小于")
    private String estimatedRiskLifetime;

}

