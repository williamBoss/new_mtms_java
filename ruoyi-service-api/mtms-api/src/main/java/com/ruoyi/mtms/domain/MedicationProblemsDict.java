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
 * @date 2020/9/18 16:38
 * @version V1.0
 */

/**
 * 药物治疗相关问题字典表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-MedicationProblemsDict")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_medication_problems_dict")
public class MedicationProblemsDict extends BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 父级id
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value = "父级id")
    private Integer parentId;

    /**
     * 问题类型 1.适应症 2.有效性 3.安全性 4.依从性 
     */
    @TableField(value = "problem_type")
    @ApiModelProperty(value = "问题类型 1.适应症 2.有效性 3.安全性 4.依从性 ")
    private Integer problemType;

    /**
     * 药物治疗相关问题描述
     */
    @TableField(value = "medication_problems")
    @ApiModelProperty(value = "药物治疗相关问题描述")
    private String medicationProblems;
}