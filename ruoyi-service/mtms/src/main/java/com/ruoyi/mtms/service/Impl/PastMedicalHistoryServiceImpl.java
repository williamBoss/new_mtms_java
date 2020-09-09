package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.mtms.domain.PastMedicalHistory;
import com.ruoyi.mtms.mapper.PastMedicalHistoryMapper;
import com.ruoyi.mtms.service.PastMedicalHistoryService;
import com.ruoyi.mtms.vo.PastMedicalHistoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: PastMedicalHistoryServiceImpl
 * @Package com.ruoyi.mtms.service.Impl
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

@Service
public class PastMedicalHistoryServiceImpl extends ServiceImpl<PastMedicalHistoryMapper, PastMedicalHistory>
    implements PastMedicalHistoryService {

    @Autowired
    private PastMedicalHistoryMapper pastMedicalHistoryMapper;

    @Override
    public List<PastMedicalHistoryVO> selectPastMedicalHistory(Integer patientId, Integer assessmentId) {
        return pastMedicalHistoryMapper.selectPastMedicalHistory(patientId, assessmentId);
    }
}

