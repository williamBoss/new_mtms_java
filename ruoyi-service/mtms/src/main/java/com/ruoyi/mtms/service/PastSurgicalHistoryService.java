package com.ruoyi.mtms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.mtms.domain.PastSurgicalHistory;
import com.ruoyi.mtms.vo.PastSurgicalHistoryVO;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: PastSurgicalHistoryService
 * @Package com.ruoyi.mtms.service
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

public interface PastSurgicalHistoryService extends IService<PastSurgicalHistory> {

    public List<PastSurgicalHistoryVO> selectPastSurgicalHistories(Integer patientId, Integer assessmentId);

}

