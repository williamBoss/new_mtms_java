package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/9/9 9:47
 * @version V1.0
 */

/**
 * 药物治疗问题
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-MedicationProblems")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_medication_problems")
public class MedicationProblems extends BaseEntity {
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
     * 病种id
     */
    @TableField(value = "disease_id")
    @ApiModelProperty(value = "病种id")
    private Integer diseaseId;

    /**
     * 药物id
     */
    @TableField(value = "med_id")
    @ApiModelProperty(value = "药物id")
    private Integer medId;

    /**
     * 适应症
     */
    @TableField(value = "indications")
    @ApiModelProperty(value = "适应症")
    private Integer indications;

    /**
     * 有效性
     */
    @TableField(value = "effectiveness")
    @ApiModelProperty(value = "有效性")
    private Integer effectiveness;

    /**
     * 安全性
     */
    @TableField(value = "safety")
    @ApiModelProperty(value = "安全性")
    private Integer safety;

    /**
     * 依从性
     */
    @TableField(value = "compliance")
    @ApiModelProperty(value = "依从性")
    private Integer compliance;

    /**
     * 具体问题
     */
    @TableField(value = "problem")
    @ApiModelProperty(value = "具体问题")
    private String problem;

    /**
     * 处理建议
     */
    @TableField(value = "treatment_suggestion")
    @ApiModelProperty(value = "处理建议")
    private String treatmentSuggestion;

    /**
     * 是否解决：1.本次就诊解决 2.未解决 3.待解决
     */
    @TableField(value = "is_resolved")
    @ApiModelProperty(value = "是否解决：1.本次就诊解决 2.未解决 3.待解决")
    private Boolean isResolved;

    /**
     * 改善详情
     */
    @TableField(value = "improvement_details")
    @ApiModelProperty(value = "改善详情")
    private String improvementDetails;
}