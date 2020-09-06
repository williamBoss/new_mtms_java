package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 评估诊断关系表
 *
 * @author KING
 */
@ApiModel(value = "com-ruoyi-mtms-domain-AssessmentDiagnosis")
@Data
@TableName(value = "mtms_assessment_diagnosis")
public class AssessmentDiagnosis {

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

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableLogic
    @TableField(value = "del_flag", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "删除状态(0-正常,1-已删除)")
    private Boolean delFlag;

    /**
     * 创建人
     */
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新人")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}