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
* @date 2020/9/18 23:23
* @version V1.0
*/
/**
    * 评估报告 - 问题记录
    */
@ApiModel(value="com-ruoyi-mtms-domain-EvaluationReportProblem")
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "mtms_evaluation_report_problem")
public class EvaluationReportProblem extends BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value="患者id")
    private Integer patientId;

    /**
     * 发现的问题
     */
    @TableField(value = "problem_desc")
    @ApiModelProperty(value="发现的问题")
    private String problemDesc;

    /**
     * 干预计划
     */
    @TableField(value = "intervention_plan")
    @ApiModelProperty(value="干预计划")
    private String interventionPlan;

    /**
     * 显示排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="显示排序")
    private Integer sort;
}