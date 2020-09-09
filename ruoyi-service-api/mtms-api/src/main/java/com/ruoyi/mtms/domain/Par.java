package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* ${TODO}
* @author KING
* @date 2020/9/9 15:12
* @version V1.0
*/
/**
    * 心脑血管病风险评估
    */
@ApiModel(value="com-ruoyi-mtms-domain-Par")
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "mtms_par")
public class Par extends BaseEntity {
    /**
     * 主键id
     */
    @TableId(value = "par_id", type = IdType.AUTO)
    @ApiModelProperty(value="主键id")
    private Integer parId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @TableField(value = "pat_id")
    @ApiModelProperty(value="患者id")
    private Integer patId;

    /**
     * 10年发病风险
     */
    @TableField(value = "risk_ten_year")
    @ApiModelProperty(value="10年发病风险")
    private String riskTenYear;

    /**
     * 10年发病风险等级： 1.低危 2.中危 3.高危
     */
    @TableField(value = "risk_ten_year_level")
    @ApiModelProperty(value="10年发病风险等级： 1.低危 2.中危 3.高危")
    private Boolean riskTenYearLevel;

    /**
     * 理想危险因素状态下,10年发病风险应小于
     */
    @TableField(value = "estimated_risk_ten_year")
    @ApiModelProperty(value="理想危险因素状态下,10年发病风险应小于")
    private String estimatedRiskTenYear;

    /**
     * 终生发病风险
     */
    @TableField(value = "risk_lifetime")
    @ApiModelProperty(value="终生发病风险")
    private String riskLifetime;

    /**
     * 终生发病风险等级： 1.低危 2.中危 3.高危
     */
    @TableField(value = "risk_lifetime_level")
    @ApiModelProperty(value="终生发病风险等级： 1.低危 2.中危 3.高危")
    private Boolean riskLifetimeLevel;

    /**
     * 理想危险因素状态下,终生发病风险应小于
     */
    @TableField(value = "estimated_risk_lifetime")
    @ApiModelProperty(value="理想危险因素状态下,终生发病风险应小于")
    private String estimatedRiskLifetime;
}