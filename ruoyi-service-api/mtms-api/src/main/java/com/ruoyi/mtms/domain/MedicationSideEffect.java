package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* @Title: MedicationSideEffect
* @Package com.ruoyi.mtms.domain
* @Description: ${TODO}(这里用一句话描述这个类的作用)
* @author KING
* @date 2020/5/27 15:36
* @version V1.0
*/

/**
    * 药物不良反应史与评估关系表
    */
@ApiModel(value="com-ruoyi-mtms-domain-MedicationSideEffect")
@Data
@TableName(value = "mtms_medication_side_effect")
public class MedicationSideEffect {
    /**
     * 药物不良反应史id
     */
    @TableId(value = "medication_side_effect_id", type = IdType.AUTO)
    @ApiModelProperty(value="药物不良反应史id")
    private Integer medicationSideEffectId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 药物id
     */
    @TableField(value = "med_id")
    @ApiModelProperty(value="药物id")
    private Integer medId;

    /**
     * 不良反应症状
     */
    @TableField(value = "adverse_reactions_symptoms")
    @ApiModelProperty(value="不良反应症状")
    private String adverseReactionsSymptoms;

    /**
     * 不良反应发生时间
     */
    @TableField(value = "occurrence_datetime")
    @ApiModelProperty(value="不良反应发生时间")
    private Date occurrenceDatetime;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableField(value = "del_flag")
    @ApiModelProperty(value="删除状态(0-正常,1-已删除)")
    private Boolean delFlag;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    @ApiModelProperty(value="创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    @ApiModelProperty(value="更新人")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    public static final String COL_MEDICATION_SIDE_EFFECT_ID = "medication_side_effect_id";

    public static final String COL_ASSESSMENT_ID = "assessment_id";

    public static final String COL_MED_ID = "med_id";

    public static final String COL_ADVERSE_REACTIONS_SYMPTOMS = "adverse_reactions_symptoms";

    public static final String COL_OCCURRENCE_DATETIME = "occurrence_datetime";

    public static final String COL_DEL_FLAG = "del_flag";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_TIME = "update_time";
}