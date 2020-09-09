package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.mtms.domain.Assessment;
import com.ruoyi.mtms.domain.UseMedRecord;
import com.ruoyi.mtms.dto.AssessmentDTO;
import com.ruoyi.mtms.mapper.AssessmentDiagnosisMapper;
import com.ruoyi.mtms.mapper.AssessmentMapper;
import com.ruoyi.mtms.mapper.DiseaseMapper;
import com.ruoyi.mtms.mapper.PatientInfoMapper;
import com.ruoyi.mtms.service.AssessmentService;
import com.ruoyi.mtms.vo.AssessmentVO;
import com.ruoyi.mtms.vo.UseMedRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: AssessmentServiceImpl
 * @Package com.ruoyi.mtms.service.Impl
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:34
 */

@Service
public class AssessmentServiceImpl extends ServiceImpl<AssessmentMapper, Assessment> implements AssessmentService {

    @Autowired
    private AssessmentMapper assessmentMapper;

    @Autowired
    private PatientInfoMapper patientInfoMapper;

    @Autowired
    private AssessmentDiagnosisMapper diagnosisMapper;

    @Autowired
    private DiseaseMapper diseaseMapper;

    @Autowired
    private Mapper dozerBeanMapper;

    @Override
    public Page<AssessmentVO> assessmentList(Integer pageNo, Integer pageSize, AssessmentVO assessmentVO,
        String diseaseIds) {
        AssessmentDTO assessmentDTO = dozerBeanMapper.map(assessmentVO, AssessmentDTO.class);
        Page<AssessmentVO> page = new Page<>(pageNo, pageSize);
        List<AssessmentVO> assessmentVOList = assessmentMapper.selectAssessmentPage(page, assessmentDTO, diseaseIds);
        page.setRecords(assessmentVOList);
        return page;
    }

    @Override
    public List<AssessmentVO> selectAssessmentByPatientId(Integer patientId) {
        return assessmentMapper.selectAssessmentByPatientId(patientId);
    }

    @Override
    public Page<UseMedRecordVO> useMedRecordList(Integer pageNo, Integer pageSize, UseMedRecordVO useMedRecordVO) {
        UseMedRecord useMedRecord = dozerBeanMapper.map(useMedRecordVO, UseMedRecord.class);
        Page<UseMedRecordVO> page = new Page<>(pageNo, pageSize);
        List<UseMedRecordVO> useMedRecordVOList = assessmentMapper.selectUseMedRecordList(page, useMedRecord);
        page.setRecords(useMedRecordVOList);
        return page;
    }

}


