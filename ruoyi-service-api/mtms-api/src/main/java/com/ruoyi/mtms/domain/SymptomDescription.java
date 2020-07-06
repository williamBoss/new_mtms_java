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
* @Title: SymptomDescription
* @Package com.ruoyi.mtms.domain
* @Description: ${TODO}(这里用一句话描述这个类的作用)
* @author KING
* @date 2020/5/27 15:36
* @version V1.0
*/

/**
    * 当前症状描述与评估关系表
    */
@ApiModel(value="com-ruoyi-mtms-domain-SymptomDescription")
@Data
@TableName(value = "mtms_symptom_description")
public class SymptomDescription {
    /**
     * 症状描述id
     */
    @TableId(value = "symptom_description_id", type = IdType.AUTO)
    @ApiModelProperty(value="症状描述id")
    private Integer symptomDescriptionId;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value="评估id")
    private Integer assessmentId;

    /**
     * 体质上：1.无 2.体重减轻 3.体重增加 4.盗汗 5.疲劳 6.其他
     */
    @TableField(value = "physique")
    @ApiModelProperty(value="体质上：1.无 2.体重减轻 3.体重增加 4.盗汗 5.疲劳 6.其他")
    private String physique;

    /**
     * 体质上 其他 具体描述
     */
    @TableField(value = "physique_other_desc")
    @ApiModelProperty(value="体质上 其他 具体描述")
    private String physiqueOtherDesc;

    /**
     * 五官：1.无 2.视力问题 3.重影 4.青光眼 5.白内障 6.听力障碍 7.耳鸣 8.耳痛 9.眩晕 10.鼻塞 11.流涕 12.鼻血 13.感染 14.吞咽困难 15.声音嘶哑 16.喉咙痛 17.牙龈出血 18.其他
     */
    @TableField(value = "facial_features")
    @ApiModelProperty(value="五官：1.无 2.视力问题 3.重影 4.青光眼 5.白内障 6.听力障碍 7.耳鸣 8.耳痛 9.眩晕 10.鼻塞 11.流涕 12.鼻血 13.感染 14.吞咽困难 15.声音嘶哑 16.喉咙痛 17.牙龈出血 18.其他")
    private String facialFeatures;

    /**
     * 五官 其他 具体描述
     */
    @TableField(value = "facial_features_other_desc")
    @ApiModelProperty(value="五官 其他 具体描述")
    private String facialFeaturesOtherDesc;

    /**
     * 内分泌：1.无 2.腺体肿胀 3.甲状腺问题 4.糖尿病 5.其他
     */
    @TableField(value = "endocrine")
    @ApiModelProperty(value="内分泌：1.无 2.腺体肿胀 3.甲状腺问题 4.糖尿病 5.其他")
    private String endocrine;

    /**
     * 内分泌 其他 具体描述
     */
    @TableField(value = "endocrine_other_desc")
    @ApiModelProperty(value="内分泌 其他 具体描述")
    private String endocrineOtherDesc;

    /**
     * 呼吸系统：1.无 2.咳嗽 3.呼吸急促 4.咯痰 5.哮喘 6.吸烟 7.其他
     */
    @TableField(value = "respiratory_system")
    @ApiModelProperty(value="呼吸系统：1.无 2.咳嗽 3.呼吸急促 4.咯痰 5.哮喘 6.吸烟 7.其他")
    private String respiratorySystem;

    /**
     * 其他 具体描述
     */
    @TableField(value = "respiratory_system_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String respiratorySystemOtherDesc;

    /**
     * 心血管：1.无 2.心痛 3.高血压 4.心律失常 5.心悸 6.腿部水肿 7.平躺时呼吸困难 8.其他
     */
    @TableField(value = "cardiovascular")
    @ApiModelProperty(value="心血管：1.无 2.心痛 3.高血压 4.心律失常 5.心悸 6.腿部水肿 7.平躺时呼吸困难 8.其他")
    private String cardiovascular;

    /**
     * 其他 具体描述
     */
    @TableField(value = "cardiovascular_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String cardiovascularOtherDesc;

    /**
     * 消化系统：1.无 2.便秘 3.胃食管返流 4.烧心 5.胃肠溃疡 6.肝炎 7.恶心/呕吐 8.其他
     */
    @TableField(value = "digestive_system")
    @ApiModelProperty(value="消化系统：1.无 2.便秘 3.胃食管返流 4.烧心 5.胃肠溃疡 6.肝炎 7.恶心/呕吐 8.其他")
    private String digestiveSystem;

    /**
     * 其他 具体描述
     */
    @TableField(value = "digestive_system_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String digestiveSystemOtherDesc;

    /**
     * 泌尿生殖系统: 1.无 2.尿频 3.尿痛 4.血尿 5.尿失禁 6.其他
     */
    @TableField(value = "urogenital_system")
    @ApiModelProperty(value="泌尿生殖系统: 1.无 2.尿频 3.尿痛 4.血尿 5.尿失禁 6.其他")
    private String urogenitalSystem;

    /**
     * 其他 具体描述
     */
    @TableField(value = "urogenital_system_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String urogenitalSystemOtherDesc;

    /**
     * 肌肉骨骼系统: 1.无 2.关节痛 3.肌无力 4.腿部无力 5.肌肉抽筋 6.其他
     */
    @TableField(value = "musculoskeletal_system")
    @ApiModelProperty(value="肌肉骨骼系统: 1.无 2.关节痛 3.肌无力 4.腿部无力 5.肌肉抽筋 6.其他")
    private String musculoskeletalSystem;

    /**
     * 其他 具体描述
     */
    @TableField(value = "musculoskeletal_system_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String musculoskeletalSystemOtherDesc;

    /**
     * 神经系统: 1.无 2.头痛 3.偏头痛 4.癫痫 5.麻木 6.震颤 7.晕厥 8.其他
     */
    @TableField(value = "nervous_system")
    @ApiModelProperty(value="神经系统: 1.无 2.头痛 3.偏头痛 4.癫痫 5.麻木 6.震颤 7.晕厥 8.其他")
    private String nervousSystem;

    /**
     * 其他 具体描述
     */
    @TableField(value = "nervous_system_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String nervousSystemOtherDesc;

    /**
     * 血液淋巴系统: 1.无 2.出血 3.血栓 4.腺体肿胀 5.其他
     */
    @TableField(value = "hemolymph_system")
    @ApiModelProperty(value="血液淋巴系统: 1.无 2.出血 3.血栓 4.腺体肿胀 5.其他")
    private String hemolymphSystem;

    /**
     * 其他 具体描述
     */
    @TableField(value = "hemolymph_system_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String hemolymphSystemOtherDesc;

    /**
     * 免疫系统: 1.无 2.过敏 3.皮疹 4.感染 5.其他
     */
    @TableField(value = "immune_system")
    @ApiModelProperty(value="免疫系统: 1.无 2.过敏 3.皮疹 4.感染 5.其他")
    private String immuneSystem;

    /**
     * 其他 具体描述
     */
    @TableField(value = "immune_system_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String immuneSystemOtherDesc;

    /**
     * 心理: 1.无 2.抑郁 3.哭闹 4.焦虑 5.嗜睡 6.睡眠障碍 7.其他
     */
    @TableField(value = "psychological")
    @ApiModelProperty(value="心理: 1.无 2.抑郁 3.哭闹 4.焦虑 5.嗜睡 6.睡眠障碍 7.其他")
    private String psychological;

    /**
     * 其他 具体描述
     */
    @TableField(value = "psychological_other_desc")
    @ApiModelProperty(value="其他 具体描述")
    private String psychologicalOtherDesc;

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

    public static final String COL_SYMPTOM_DESCRIPTION_ID = "symptom_description_id";

    public static final String COL_ASSESSMENT_ID = "assessment_id";

    public static final String COL_PHYSIQUE = "physique";

    public static final String COL_PHYSIQUE_OTHER_DESC = "physique_other_desc";

    public static final String COL_FACIAL_FEATURES = "facial_features";

    public static final String COL_FACIAL_FEATURES_OTHER_DESC = "facial_features_other_desc";

    public static final String COL_ENDOCRINE = "endocrine";

    public static final String COL_ENDOCRINE_OTHER_DESC = "endocrine_other_desc";

    public static final String COL_RESPIRATORY_SYSTEM = "respiratory_system";

    public static final String COL_RESPIRATORY_SYSTEM_OTHER_DESC = "respiratory_system_other_desc";

    public static final String COL_CARDIOVASCULAR = "cardiovascular";

    public static final String COL_CARDIOVASCULAR_OTHER_DESC = "cardiovascular_other_desc";

    public static final String COL_DIGESTIVE_SYSTEM = "digestive_system";

    public static final String COL_DIGESTIVE_SYSTEM_OTHER_DESC = "digestive_system_other_desc";

    public static final String COL_UROGENITAL_SYSTEM = "urogenital_system";

    public static final String COL_UROGENITAL_SYSTEM_OTHER_DESC = "urogenital_system_other_desc";

    public static final String COL_MUSCULOSKELETAL_SYSTEM = "musculoskeletal_system";

    public static final String COL_MUSCULOSKELETAL_SYSTEM_OTHER_DESC = "musculoskeletal_system_other_desc";

    public static final String COL_NERVOUS_SYSTEM = "nervous_system";

    public static final String COL_NERVOUS_SYSTEM_OTHER_DESC = "nervous_system_other_desc";

    public static final String COL_HEMOLYMPH_SYSTEM = "hemolymph_system";

    public static final String COL_HEMOLYMPH_SYSTEM_OTHER_DESC = "hemolymph_system_other_desc";

    public static final String COL_IMMUNE_SYSTEM = "immune_system";

    public static final String COL_IMMUNE_SYSTEM_OTHER_DESC = "immune_system_other_desc";

    public static final String COL_PSYCHOLOGICAL = "psychological";

    public static final String COL_PSYCHOLOGICAL_OTHER_DESC = "psychological_other_desc";

    public static final String COL_DEL_FLAG = "del_flag";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_TIME = "update_time";
}