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
* @Title: PastMedicalHistory
* @Package com.ruoyi.mtms.domain
* @Description: ${TODO}(这里用一句话描述这个类的作用)
* @author KING
* @date 2020/5/27 15:36
* @version V1.0
*/

/**
    * 既往病史与评估关系表
    */
@ApiModel(value="com-ruoyi-mtms-domain-PastMedicalHistory")
@Data
@TableName(value = "mtms_past_medical_history")
public class PastMedicalHistory {
    /**
     * 既往病史id
     */
    @TableId(value = "history_id", type = IdType.AUTO)
    @ApiModelProperty(value="既往病史id")
    private Integer historyId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 既往病史病种id
     */
    @TableField(value = "disease_id")
    @ApiModelProperty(value="既往病史病种id")
    private Integer diseaseId;

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

    public static final String COL_HISTORY_ID = "history_id";

    public static final String COL_ASSESSMENT_ID = "assessment_id";

    public static final String COL_DISEASE_ID = "disease_id";

    public static final String COL_DEL_FLAG = "del_flag";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_TIME = "update_time";
}