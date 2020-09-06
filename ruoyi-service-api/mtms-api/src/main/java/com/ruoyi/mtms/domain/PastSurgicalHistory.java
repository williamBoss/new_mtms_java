package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
* @Title: PastSurgicalHistory
* @Package com.ruoyi.mtms.domain
* @Description: ${TODO}(这里用一句话描述这个类的作用)
* @author KING
* @date 2020/5/27 15:36
* @version V1.0
*/

/**
    * 既往手术史与评估关系表
    */
@ApiModel(value="com-ruoyi-mtms-domain-PastSurgicalHistory")
@Data
@TableName(value = "mtms_past_surgical_history")
public class PastSurgicalHistory {
    /**
     * 既往手术史id
     */
    @TableId(value = "past_surgical_history_id", type = IdType.AUTO)
    @ApiModelProperty(value="既往手术史id")
    private Integer pastSurgicalHistoryId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 手术名称id
     */
    @TableField(value = "surgical_history_id")
    @ApiModelProperty(value="手术名称id")
    private Integer surgicalHistoryId;

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
    private LocalDateTime createTime;

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

    public static final String COL_PAST_SURGICAL_HISTORY_ID = "past_surgical_history_id";

    public static final String COL_ASSESSMENT_ID = "assessment_id";

    public static final String COL_SURGICAL_HISTORY_ID = "surgical_history_id";

    public static final String COL_DEL_FLAG = "del_flag";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_TIME = "update_time";
}