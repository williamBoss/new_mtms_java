package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "SymptomDescriptionVO")
public class SymptomDescriptionVO {
    /**
     * 症状描述id
     */
    @ApiModelProperty(value = "症状描述id")
    private Integer symptomDescriptionId;

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
     * 体质上：1.无 2.体重减轻 3.体重增加 4.盗汗 5.疲劳 6.其他
     */
    @ApiModelProperty(value = "体质上：1.无 2.体重减轻 3.体重增加 4.盗汗 5.疲劳 6.其他")
    private String physique;

    @ApiModelProperty(value = "体质上：1.无 2.体重减轻 3.体重增加 4.盗汗 5.疲劳 6.其他")
    private String[] physiques;

    /**
     * 体质上 其他 具体描述
     */
    @ApiModelProperty(value = "体质上 其他 具体描述")
    private String physiqueOtherDesc;

    /**
     * 五官：1.无 2.视力问题 3.重影 4.青光眼 5.白内障 6.听力障碍 7.耳鸣 8.耳痛 9.眩晕 10.鼻塞 11.流涕 12.鼻血 13.感染 14.吞咽困难 15.声音嘶哑 16.喉咙痛 17.牙龈出血 18.其他
     */
    @ApiModelProperty(value = "五官：1.无 2.视力问题 3.重影 4.青光眼 5.白内障 6.听力障碍 7.耳鸣 8.耳痛 9.眩晕 10.鼻塞 11.流涕 12.鼻血 13.感染 14.吞咽困难 15.声音嘶哑 16.喉咙痛 17.牙龈出血 18.其他")
    private String facialFeatures;

    @ApiModelProperty(value = "五官：1.无 2.视力问题 3.重影 4.青光眼 5.白内障 6.听力障碍 7.耳鸣 8.耳痛 9.眩晕 10.鼻塞 11.流涕 12.鼻血 13.感染 14.吞咽困难 15.声音嘶哑 16.喉咙痛 17.牙龈出血 18.其他")
    private String[] facialFeaturess;

    /**
     * 五官 其他 具体描述
     */
    @ApiModelProperty(value = "五官 其他 具体描述")
    private String facialFeaturesOtherDesc;

    /**
     * 内分泌：1.无 2.腺体肿胀 3.甲状腺问题 4.糖尿病 5.其他
     */
    @ApiModelProperty(value = "内分泌：1.无 2.腺体肿胀 3.甲状腺问题 4.糖尿病 5.其他")
    private String endocrine;

    @ApiModelProperty(value = "内分泌：1.无 2.腺体肿胀 3.甲状腺问题 4.糖尿病 5.其他")
    private String[] endocrines;

    /**
     * 内分泌 其他 具体描述
     */
    @ApiModelProperty(value = "内分泌 其他 具体描述")
    private String endocrineOtherDesc;

    /**
     * 呼吸系统：1.无 2.咳嗽 3.呼吸急促 4.咯痰 5.哮喘 6.吸烟 7.其他
     */
    @ApiModelProperty(value = "呼吸系统：1.无 2.咳嗽 3.呼吸急促 4.咯痰 5.哮喘 6.吸烟 7.其他")
    private String respiratorySystem;

    @ApiModelProperty(value = "呼吸系统：1.无 2.咳嗽 3.呼吸急促 4.咯痰 5.哮喘 6.吸烟 7.其他")
    private String[] respiratorySystems;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String respiratorySystemOtherDesc;

    /**
     * 心血管：1.无 2.心痛 3.高血压 4.心律失常 5.心悸 6.腿部水肿 7.平躺时呼吸困难 8.其他
     */
    @ApiModelProperty(value = "心血管：1.无 2.心痛 3.高血压 4.心律失常 5.心悸 6.腿部水肿 7.平躺时呼吸困难 8.其他")
    private String cardiovascular;

    @ApiModelProperty(value = "心血管：1.无 2.心痛 3.高血压 4.心律失常 5.心悸 6.腿部水肿 7.平躺时呼吸困难 8.其他")
    private String[] cardiovasculars;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String cardiovascularOtherDesc;

    /**
     * 消化系统：1.无 2.便秘 3.胃食管返流 4.烧心 5.胃肠溃疡 6.肝炎 7.恶心/呕吐 8.其他
     */
    @ApiModelProperty(value = "消化系统：1.无 2.便秘 3.胃食管返流 4.烧心 5.胃肠溃疡 6.肝炎 7.恶心/呕吐 8.其他")
    private String digestiveSystem;

    @ApiModelProperty(value = "消化系统：1.无 2.便秘 3.胃食管返流 4.烧心 5.胃肠溃疡 6.肝炎 7.恶心/呕吐 8.其他")
    private String[] digestiveSystems;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String digestiveSystemOtherDesc;

    /**
     * 泌尿生殖系统: 1.无 2.尿频 3.尿痛 4.血尿 5.尿失禁 6.其他
     */
    @ApiModelProperty(value = "泌尿生殖系统: 1.无 2.尿频 3.尿痛 4.血尿 5.尿失禁 6.其他")
    private String urogenitalSystem;

    @ApiModelProperty(value = "泌尿生殖系统: 1.无 2.尿频 3.尿痛 4.血尿 5.尿失禁 6.其他")
    private String[] urogenitalSystems;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String urogenitalSystemOtherDesc;

    /**
     * 肌肉骨骼系统: 1.无 2.关节痛 3.肌无力 4.腿部无力 5.肌肉抽筋 6.其他
     */
    @ApiModelProperty(value = "肌肉骨骼系统: 1.无 2.关节痛 3.肌无力 4.腿部无力 5.肌肉抽筋 6.其他")
    private String musculoskeletalSystem;

    @ApiModelProperty(value = "肌肉骨骼系统: 1.无 2.关节痛 3.肌无力 4.腿部无力 5.肌肉抽筋 6.其他")
    private String[] musculoskeletalSystems;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String musculoskeletalSystemOtherDesc;

    /**
     * 神经系统: 1.无 2.头痛 3.偏头痛 4.癫痫 5.麻木 6.震颤 7.晕厥 8.其他
     */
    @ApiModelProperty(value = "神经系统: 1.无 2.头痛 3.偏头痛 4.癫痫 5.麻木 6.震颤 7.晕厥 8.其他")
    private String nervousSystem;

    @ApiModelProperty(value = "神经系统: 1.无 2.头痛 3.偏头痛 4.癫痫 5.麻木 6.震颤 7.晕厥 8.其他")
    private String[] nervousSystems;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String nervousSystemOtherDesc;

    /**
     * 血液淋巴系统: 1.无 2.出血 3.血栓 4.腺体肿胀 5.其他
     */
    @ApiModelProperty(value = "血液淋巴系统: 1.无 2.出血 3.血栓 4.腺体肿胀 5.其他")
    private String hemolymphSystem;

    @ApiModelProperty(value = "血液淋巴系统: 1.无 2.出血 3.血栓 4.腺体肿胀 5.其他")
    private String[] hemolymphSystems;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String hemolymphSystemOtherDesc;

    /**
     * 免疫系统: 1.无 2.过敏 3.皮疹 4.感染 5.其他
     */
    @ApiModelProperty(value = "免疫系统: 1.无 2.过敏 3.皮疹 4.感染 5.其他")
    private String immuneSystem;

    @ApiModelProperty(value = "免疫系统: 1.无 2.过敏 3.皮疹 4.感染 5.其他")
    private String[] immuneSystems;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String immuneSystemOtherDesc;

    /**
     * 心理: 1.无 2.抑郁 3.哭闹 4.焦虑 5.嗜睡 6.睡眠障碍 7.其他
     */
    @ApiModelProperty(value = "心理: 1.无 2.抑郁 3.哭闹 4.焦虑 5.嗜睡 6.睡眠障碍 7.其他")
    private String psychological;

    @ApiModelProperty(value = "心理: 1.无 2.抑郁 3.哭闹 4.焦虑 5.嗜睡 6.睡眠障碍 7.其他")
    private String[] psychologicals;

    /**
     * 其他 具体描述
     */
    @ApiModelProperty(value = "其他 具体描述")
    private String psychologicalOtherDesc;

}

