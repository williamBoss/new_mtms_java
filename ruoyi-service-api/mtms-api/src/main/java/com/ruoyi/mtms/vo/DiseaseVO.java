package com.ruoyi.mtms.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 病种表
 *
 * @author KING
 */
@Data
@TableName(value = "mtms_disease")
public class DiseaseVO {

    /**
     * 病种id
     */
    @TableId(value = "disease_id", type = IdType.AUTO)
    private Integer diseaseId;

    /**
     * 病种名称
     */
    @TableField(value = "disease_name")
    private String diseaseName;

    /**
     * 病种编码
     */
    @TableField(value = "disease_key")
    private String diseaseKey;

}