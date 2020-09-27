package com.ruoyi.mtms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 患者VO
 *
 * @author KING
 */
@ApiModel(value = "PatientInfoVO")
@Data
public class PatientInfoVO {

    /**
     * 患者主键id
     */
    @ApiModelProperty(value = "患者主键id")
    private Integer patientId;

    /**
     * 患者姓名
     */
    @ApiModelProperty(value = "患者姓名")
    private String patientName;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 出生日期
     */
    @ApiModelProperty(value = "出生日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "GMT+8")
    private LocalDate birthday;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 性别 0.未知 1.男 2.女
     */
    @ApiModelProperty(value = "性别 0.未知 1.男 2.女")
    private Byte gender;

    /**
     * 患者自定义id
     */
    @ApiModelProperty(value = "患者自定义id")
    private String patientSelfId;

    /**
     * 身高 cm
     */
    @ApiModelProperty(value = "身高 cm")
    private Integer height;

    /**
     * 体重 kg
     */
    @ApiModelProperty(value = "体重 kg")
    private Double weight;

    /**
     * BMI
     */
    @ApiModelProperty(value = "BMI")
    private Double bmi;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCardNum;

    /**
     * 医保类型：①自费 ②医保 ③公费 ④新农合 ⑤其他
     */
    @ApiModelProperty(value = "医保类型：①自费 ②医保 ③公费 ④新农合 ⑤其他")
    private Byte medicareType;

    /**
     * 其他医保类型
     */
    @ApiModelProperty(value = "其他医保类型")
    private String otherMedicareType;

    /**
     * 受教育程度 1.小学及以下 2.初高中 3.大专及本科 4.硕士及以上
     */
    @ApiModelProperty(value = "受教育程度 1.小学及以下 2.初高中 3.大专及本科 4.硕士及以上")
    private Byte educationLevel;

    /**
     * 婚姻状况 1.已婚 2.未婚 3.离异 4.丧偶
     */
    @ApiModelProperty(value = "婚姻状况 1.已婚 2.未婚 3.离异 4.丧偶")
    private Byte maritalStatus;

    /**
     * 家庭住址（市区）
     */
    @ApiModelProperty(value = "家庭住址（市区）")
    private String[] downtownAddressArr;

    /**
     * 家庭地址（详细地址）
     */
    @ApiModelProperty(value = "家庭地址（详细地址）")
    private String homeAddress;

    /**
     * 工作单位
     */
    @ApiModelProperty(value = "工作单位")
    private String company;

    /**
     * 接诊日期
     */
    @ApiModelProperty(value = "接诊日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime consultationDate;

    /**
     * 就诊后一年急诊/输液次数
     */
    @ApiModelProperty(value = "就诊后一年急诊/输液次数")
    private Integer emergencyInfusionNum;

    /**
     * 就诊后一年住院次数
     */
    @ApiModelProperty(value = "就诊后一年住院次数")
    private Integer hospitalizationNum;

    /**
     * 接诊医师
     */
    @ApiModelProperty(value = "接诊医师")
    private String physician;

    /**
     * 接诊医师科室
     */
    @ApiModelProperty(value = "接诊医师科室")
    private String department;

}

