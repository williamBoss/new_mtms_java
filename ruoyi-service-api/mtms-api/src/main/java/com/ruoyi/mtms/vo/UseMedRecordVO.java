package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

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

    /**
     * 评估id
     */
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    @ApiModelProperty(value = "开始时间")
    private LocalDate useStartTime;

    /**
     * 结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    @ApiModelProperty(value = "结束时间")
    private LocalDate useEndTime;

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