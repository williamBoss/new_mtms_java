package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.mtms.domain.AssessmentDiagnosis;
import com.ruoyi.mtms.mapper.AssessmentDiagnosisMapper;
import com.ruoyi.mtms.service.AssessmentDiagnosisService;
import com.ruoyi.mtms.vo.AssessmentDiagnosisVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: AssessmentDiagnosisServiceImpl
 * @Package com.ruoyi.mtms.service.Impl
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

@Service
public class AssessmentDiagnosisServiceImpl extends ServiceImpl<AssessmentDiagnosisMapper, AssessmentDiagnosis>
    implements AssessmentDiagnosisService {

    @Autowired
    private AssessmentDiagnosisMapper diagnosisMapper;

    @Override
    public List<AssessmentDiagnosisVO> selectAssessmentDiagnosis(Integer patientId, Integer assessmentId) {
        return diagnosisMapper.selectAssessmentDiagnosis(patientId, assessmentId);
    }
}

