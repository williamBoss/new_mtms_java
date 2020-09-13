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

import java.time.LocalDateTime;

/**
* ${TODO}
* @author KING
* @date 2020/9/9 20:24
* @version V1.0
*/
/**
    * 过敏史与评估关系
    */
@ApiModel(value="com-ruoyi-mtms-domain-AllergyHistory")
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "mtms_allergy_history")
public class AllergyHistory extends BaseEntity {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键id")
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
     * 过敏原
     */
    @TableField(value = "allergen")
    @ApiModelProperty(value="过敏原")
    private String allergen;

    /**
     * 过敏症状
     */
    @TableField(value = "allergy_symptoms")
    @ApiModelProperty(value="过敏症状")
    private String allergySymptoms;

    /**
     * 过敏发生时间
     */
    @TableField(value = "allergy_datetime")
    @ApiModelProperty(value="过敏发生时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime allergyDatetime;
}