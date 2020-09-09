package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.mtms.domain.MedicationProblems;
import com.ruoyi.mtms.mapper.MedicationProblemsMapper;
import com.ruoyi.mtms.service.MedicationProblemsService;
import com.ruoyi.mtms.vo.MedicationProblemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/9 9:45
 */
@Service
public class MedicationProblemsServiceImpl extends ServiceImpl<MedicationProblemsMapper, MedicationProblems>
    implements MedicationProblemsService {

    @Autowired
    private MedicationProblemsMapper medicationProblemsMapper;

    @Override
    public Page<MedicationProblemsVO> selectMedProblemsPage(Integer pageNo, Integer pageSize, Integer assessmentId,
        Integer patientId) {
        Page<MedicationProblemsVO> page = new Page<>(pageNo, pageSize);
        List<MedicationProblemsVO> medicationProblemsList =
            medicationProblemsMapper.selectMedProblemsPage(page, assessmentId, patientId);
        page.setRecords(medicationProblemsList);
        return page;
    }
}

