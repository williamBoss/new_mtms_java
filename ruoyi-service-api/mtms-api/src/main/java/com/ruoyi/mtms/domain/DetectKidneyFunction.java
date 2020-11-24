package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/9/13 18:37
 * @version V1.0
 */

/**
 * 肾功能检测检验
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectKidneyFunction")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_kidney_function")
public class DetectKidneyFunction extends BaseEntity {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 检测日期
     */
    @TableField(value = "detect_date")
    @ApiModelProperty(value = "检测日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate detectDate;

    /**
     * 血肌酐Cr（umol/L）
     */
    @TableField(value = "serum_creatinine")
    @ApiModelProperty(value = "血肌酐Cr（umol/L）")
    private String serumCreatinine;

    /**
     * 24h尿蛋白（mg）
     */
    @TableField(value = "twenty_four_hour_urine_protein")
    @ApiModelProperty(value = "24h尿蛋白（mg）")
    private String twentyFourHourUrineProtein;

    /**
     * 肾小球滤过率（GFR）
     */
    @TableField(value = "glomerular_filtration_rate")
    @ApiModelProperty(value = "肾小球滤过率（GFR）")
    private String glomerularFiltrationRate;

    /**
     * 肌酐清除率（ml/min）
     */
    @TableField(value = "creatinine_clearance_rate")
    @ApiModelProperty(value = "肌酐清除率（ml/min）")
    private String creatinineClearanceRate;
}