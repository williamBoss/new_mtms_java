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
 * 评估诊断关系表
 *
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-AssessmentDiagnosis")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_assessment_diagnosis")
public class AssessmentDiagnosis extends BaseEntity {
    /**
     * 诊断id
     */
    @TableId(value = "diagnosis_id", type = IdType.AUTO)
    @ApiModelProperty(value = "诊断id")
    private Integer diagnosisId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 诊断病种id
     */
    @TableField(value = "disease_id")
    @ApiModelProperty(value = "诊断病种id")
    private Integer diseaseId;
}