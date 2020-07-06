package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.ruoyi.mtms.domain.AssessmentDiagnosis;
import com.ruoyi.mtms.vo.DiseaseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: AssessmentDiagnosisMapper
 * @Package com.ruoyi.mtms.mapper
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
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

}