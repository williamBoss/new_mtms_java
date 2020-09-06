package com.ruoyi.mtms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.mtms.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* ${TODO}
* @author KING
* @date 2020/9/5 16:32
* @version V1.0
*/

/**
 * 肾功能检测检验
 */
@ApiModel(value = "com-ruoyi-mtms-domain-DetectKidneyFunction")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mtms_detect_kidney_function")
public class DetectKidneyFunction extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_ASSESSMENT_ID = "assessment_id";
    public static final String COL_PATIENT_ID = "patient_id";
    public static final String COL_DETECT_DATE = "detect_date";
    public static final String COL_SERUM_CREATININE = "serum_creatinine";
    public static final String COL_TWENTY_FOUR_HOUR_URINE_PROTEIN = "twenty_four_hour_urine_protein";
    public static final String COL_GLOMERULAR_FILTRATION_RATE = "glomerular_filtration_rate";
    public static final String COL_CREATININE_CLEARANCE_RATE = "creatinine_clearance_rate";
    public static final String COL_CREATINE_KINASE = "creatine_kinase";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_CREATE_BY = "create_by";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_UPDATE_BY = "update_by";
    public static final String COL_UPDATE_TIME = "update_time";
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 评估id
     */
    @TableField(value = "assessment_id")
    @ApiModelProperty(value = "评估id")
    private Integer assessmentId;

    /**
     * 患者id
     */
    @TableField(value = "patient_id")
    @ApiModelProperty(value = "患者id")
    private Integer patientId;

    /**
     * 检测日期
     */
    @TableField(value = "detect_date")
    @ApiModelProperty(value = "检测日期")
    private LocalDateTime detectDate;

    /**
     * 血肌酐Cr（umol/L）
     */
    @TableField(value = "serum_creatinine")
    @ApiModelProperty(value = "血肌酐Cr（umol/L）")
    private String serumCreatinine;

    /**
     * 24h尿蛋白（mg）
     */
    @TableField(value = "twenty_four_hour_urine_protein")
    @ApiModelProperty(value = "24h尿蛋白（mg）")
    private String twentyFourHourUrineProtein;

    /**
     * 肾小球滤过率（GFR）
     */
    @TableField(value = "glomerular_filtration_rate")
    @ApiModelProperty(value = "肾小球滤过率（GFR）")
    private String glomerularFiltrationRate;

    /**
     * 肌酐清除率（ml/min）
     */
    @TableField(value = "creatinine_clearance_rate")
    @ApiModelProperty(value = "肌酐清除率（ml/min）")
    private String creatinineClearanceRate;

    /**
     * 肌酸激酶CK
     */
    @TableField(value = "creatine_kinase")
    @ApiModelProperty(value = "肌酸激酶CK")
    private String creatineKinase;
}