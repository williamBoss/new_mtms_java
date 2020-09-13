package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * ${TODO}
 *
 * @author KING
 * @date 2020/8/31 16:38
 * @version V1.0
 */

/**
 * 用药记录
 */
@Data
@ApiModel(value = "UseMedRecordVO")
public class UseMedRecordVO extends MedicineInfoVO {
    /**
     * 用药记录主键id
     */
    @ApiModelProperty(value = "用药记录主键id")
    private Integer id;

    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "开始时间")
    private LocalDateTime useStartTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "结束时间")
    private LocalDateTime useEndTime;

    /**
     * 药品id
     */
    @ApiModelProperty(value = "药品id")
    private Integer medId;

    /**
     * 用法
     */
    @ApiModelProperty(value = "用法")
    private String usage;

    /**
     * 月用药量（盒）
     */
    @ApiModelProperty(value = "月用药量（盒）")
    private String dosageMonthly;

    /**
     * 备注（新增/停用）
     */
    @ApiModelProperty(value = "备注（新增/停用）")
    private String remark;

}