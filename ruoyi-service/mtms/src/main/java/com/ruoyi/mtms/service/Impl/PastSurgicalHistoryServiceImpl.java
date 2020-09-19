package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.mtms.domain.PastSurgicalHistory;
import com.ruoyi.mtms.mapper.PastSurgicalHistoryMapper;
import com.ruoyi.mtms.service.PastSurgicalHistoryService;
import com.ruoyi.mtms.vo.PastSurgicalHistoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: PastSurgicalHistoryServiceImpl
 * @Package com.ruoyi.mtms.service.Impl
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

@Service
public class PastSurgicalHistoryServiceImpl extends ServiceImpl<PastSurgicalHistoryMapper, PastSurgicalHistory>
    implements PastSurgicalHistoryService {

    @Autowired
    private PastSurgicalHistoryMapper pastSurgicalHistoryMapper;

    @Override
    public List<PastSurgicalHistoryVO> selectPastSurgicalHistories(Integer patientId, Integer assessmentId) {
        return pastSurgicalHistoryMapper.selectPastSurgicalHistories(patientId, assessmentId);
    }
}

