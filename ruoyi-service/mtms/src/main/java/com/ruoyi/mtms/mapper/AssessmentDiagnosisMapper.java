package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.ruoyi.mtms.domain.AssessmentDiagnosis;
import com.ruoyi.mtms.vo.AssessmentDiagnosisVO;
import com.ruoyi.mtms.vo.DiseaseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/11 9:37
 */
public interface AssessmentDiagnosisMapper extends BaseMapper<AssessmentDiagnosis> {
    /**
     * 根据评估id获取诊断病种名称
     *
     * @param assessmentId
     * @param wrapper
     * @return
     */
    List<DiseaseVO> getDiseaseNameById(@Param("assessmentId") Integer assessmentId,
        @Param(Constants.WRAPPER) Wrapper wrapper);

    /**
     * 获取诊断记录
     *
     * @param patientId
     * @param assessmentId
     * @return
     */
    List<AssessmentDiagnosisVO> selectAssessmentDiagnosis(@Param("patientId") Integer patientId,
        @Param("assessmentId") Integer assessmentId);

}