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

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
* ${TODO}
* @author KING
* @date 2020/9/6 19:52
* @version V1.0
*/

/**
 * 患者信息表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-PatientInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_patient_info")
public class PatientInfo extends BaseEntity {
    /**
     * 患者主键id
     */
    @TableId(value = "patient_id", type = IdType.AUTO)
    @ApiModelProperty(value = "患者主键id")
    private Integer patientId;

    /**
     * 患者姓名
     */
    @TableField(value = "patient_name")
    @ApiModelProperty(value = "患者姓名")
    private String patientName;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 出生日期
     */
    @TableField(value = "birthday")
    @ApiModelProperty(value = "出生日期")
    private LocalDate birthday;

    /**
     * 性别 0.未知 1.男 2.女
     */
    @TableField(value = "gender")
    @ApiModelProperty(value = "性别 0.未知 1.男 2.女")
    private Integer gender;

    /**
     * 患者自定义id
     */
    @TableField(value = "patient_self_id")
    @ApiModelProperty(value = "患者自定义id")
    private String patientSelfId;

    /**
     * 身高 cm
     */
    @TableField(value = "height")
    @ApiModelProperty(value = "身高 cm")
    private Integer height;

    /**
     * 体重 kg
     */
    @TableField(value = "weight")
    @ApiModelProperty(value = "体重 kg")
    private Double weight;

    /**
     * BMI
     */
    @TableField(value = "BMI")
    @ApiModelProperty(value = "BMI")
    private Double bmi;

    /**
     * 身份证号
     */
    @TableField(value = "id_card_num")
    @ApiModelProperty(value = "身份证号")
    private String idCardNum;

    /**
     * 医保类型：①自费 ②医保 ③公费 ④新农合 ⑤其他
     */
    @TableField(value = "medicare_type")
    @ApiModelProperty(value = "医保类型：①自费 ②医保 ③公费 ④新农合 ⑤其他")
    private Integer medicareType;

    /**
     * 其他医保类型
     */
    @TableField(value = "other_medicare_type")
    @ApiModelProperty(value = "其他医保类型")
    private String otherMedicareType;

    /**
     * 受教育程度 1.小学及以下 2.初高中 3.大专及本科 4.硕士及以上
     */
    @TableField(value = "education_level")
    @ApiModelProperty(value = "受教育程度 1.小学及以下 2.初高中 3.大专及本科 4.硕士及以上")
    private Integer educationLevel;

    /**
     * 婚姻状况 1.已婚 2.未婚 3.离异 4.丧偶
     */
    @TableField(value = "marital_status")
    @ApiModelProperty(value = "婚姻状况 1.已婚 2.未婚 3.离异 4.丧偶")
    private Integer maritalStatus;

    /**
     * 家庭住址（市区）
     */
    @TableField(value = "downtown_address")
    @ApiModelProperty(value = "家庭住址（市区）")
    private String downtownAddress;

    /**
     * 家庭地址（详细地址）
     */
    @TableField(value = "home_address")
    @ApiModelProperty(value = "家庭地址（详细地址）")
    private String homeAddress;

    /**
     * 工作单位
     */
    @TableField(value = "company")
    @ApiModelProperty(value = "工作单位")
    private String company;

    /**
     * 接诊日期
     */
    @TableField(value = "consultation_date")
    @ApiModelProperty(value = "接诊日期")
    private LocalDateTime consultationDate;

    /**
     * 就诊后一年急诊/输液次数
     */
    @TableField(value = "emergency_infusion_num")
    @ApiModelProperty(value = "就诊后一年急诊/输液次数")
    private Integer emergencyInfusionNum;

    /**
     * 就诊后一年住院次数
     */
    @TableField(value = "hospitalization_num")
    @ApiModelProperty(value = "就诊后一年住院次数")
    private Integer hospitalizationNum;

    /**
     * 接诊医师
     */
    @TableField(value = "physician")
    @ApiModelProperty(value = "接诊医师")
    private String physician;

    /**
     * 接诊医师科室
     */
    @TableField(value = "department")
    @ApiModelProperty(value = "接诊医师科室")
    private String department;
}