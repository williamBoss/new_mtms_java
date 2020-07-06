package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Title: PatientInfo
 * @Package com.ruoyi.mtms.domain
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @author KING
 * @date 2020/5/27 15:36
 * @version V1.0
 */

/**
 * 患者信息表
 */
@ApiModel(value = "com-ruoyi-mtms-domain-PatientInfo")
@Data
@TableName(value = "mtms_patient_info")
public class PatientInfo {
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
     * 年龄
     */
    @TableField(value = "age")
    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 性别 0.未知 1.男 2.女
     */
    @TableField(value = "gender")
    @ApiModelProperty(value = "性别 0.未知 1.男 2.女")
    private Integer gender;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    @ApiModelProperty(value = "手机号")
    private String phone;

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
     * 接诊日期
     */
    @TableField(value = "consultation_date")
    @ApiModelProperty(value = "接诊日期")
    private Date consultationDate;

    /**
     * 婚姻状况 1.已婚 2.未婚 3.离异
     */
    @TableField(value = "marital_status")
    @ApiModelProperty(value = "婚姻状况 1.已婚 2.未婚 3.离异")
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
    private Date createTime;

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