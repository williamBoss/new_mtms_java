package com.ruoyi.mtms.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class ExistingSymptomsVO extends ExistSymptomsVO {

    @ApiModelProperty(value = "现有症状诊断列表")
    private List<AssessmentDiagnosisVO> assessmentDiagnosisList;

}
