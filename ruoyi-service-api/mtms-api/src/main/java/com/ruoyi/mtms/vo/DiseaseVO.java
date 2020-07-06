package com.ruoyi.mtms.vo;

import com.baomidou.mybatisplus.annotation.*;
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

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableLogic
    @TableField(value = "del_flag")
    private Boolean delFlag;

}