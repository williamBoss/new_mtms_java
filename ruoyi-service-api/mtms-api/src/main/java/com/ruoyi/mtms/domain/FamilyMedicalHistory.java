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
* @author KING
* @date 2020/9/6 19:52
* @version V1.0
*/

/**
 * 家族病史与评估关系表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-FamilyMedicalHistory")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_family_medical_history")
public class FamilyMedicalHistory extends BaseEntity {
    /**
     * 家族病史id
     */
    @TableId(value = "family_history_id", type = IdType.AUTO)
    @ApiModelProperty(value = "家族病史id")
    private Integer familyHistoryId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 家族病史病种id
     */
    @TableField(value = "disease_id")
    @ApiModelProperty(value = "家族病史病种id")
    private Integer diseaseId;
}