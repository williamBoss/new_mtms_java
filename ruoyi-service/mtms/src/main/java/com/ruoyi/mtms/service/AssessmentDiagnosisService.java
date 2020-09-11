package com.ruoyi.mtms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.mtms.domain.AssessmentDiagnosis;
import com.ruoyi.mtms.vo.AssessmentDiagnosisVO;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: AssessmentDiagnosisService
 * @Package com.ruoyi.mtms.service
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

public interface AssessmentDiagnosisService extends IService<AssessmentDiagnosis> {

    /**
     * @param patientId
     * @param assessmentId
     * @return
     */
    List<AssessmentDiagnosisVO> selectAssessmentDiagnosis(Integer patientId, Integer assessmentId);
}

