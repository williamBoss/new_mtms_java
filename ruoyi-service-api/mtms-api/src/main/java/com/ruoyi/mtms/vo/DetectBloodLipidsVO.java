package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
@ApiModel
public class DetectBloodLipidsVO {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
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
     * 检测日期
     */
    @ApiModelProperty(value = "检测日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate detectDate;

    /**
     * 总胆固醇TC(mmol/L)
     */
    @ApiModelProperty(value = "总胆固醇TC(mmol/L)")
    private String tc;

    /**
     * 低密度脂蛋白LDL-C(mmol/L)
     */
    @ApiModelProperty(value = "低密度脂蛋白LDL-C(mmol/L)")
    private String ldl;

    /**
     * 高密度脂蛋白HDL-C（mmol/L）
     */
    @ApiModelProperty(value = "高密度脂蛋白HDL-C（mmol/L）")
    private String hdlC;

    /**
     * 甘油三酯TG(mmol/L)
     */
    @ApiModelProperty(value = "甘油三酯TG(mmol/L)")
    private String tg;

    /**
     * 脂蛋白LP-A
     */
    @ApiModelProperty(value = "脂蛋白LP-A")
    private String lpA;

    /**
     * 血尿酸
     */
    @ApiModelProperty(value = "血尿酸")
    private String bloodUricAcid;

    /**
     * 肌酸激酶CK
     */
    @ApiModelProperty(value = "肌酸激酶CK")
    private String creatineKinase;

}

