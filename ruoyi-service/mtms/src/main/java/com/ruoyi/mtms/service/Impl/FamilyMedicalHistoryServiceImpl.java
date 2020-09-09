package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.mtms.domain.FamilyMedicalHistory;
import com.ruoyi.mtms.mapper.FamilyMedicalHistoryMapper;
import com.ruoyi.mtms.service.FamilyMedicalHistoryService;
import com.ruoyi.mtms.vo.FamilyMedicalHistoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: FamilyMedicalHistoryServiceImpl
 * @Package com.ruoyi.mtms.service.Impl
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

@Service
public class FamilyMedicalHistoryServiceImpl extends ServiceImpl<FamilyMedicalHistoryMapper, FamilyMedicalHistory>
    implements FamilyMedicalHistoryService {

    @Autowired
    private FamilyMedicalHistoryMapper familyMedicalHistoryMapper;

    @Override
    public List<FamilyMedicalHistoryVO> selectFamilyMedicalHistory(Integer patientId, Integer assessmentId) {
        return familyMedicalHistoryMapper.selectFamilyMedicalHistory(patientId, assessmentId);
    }
}

