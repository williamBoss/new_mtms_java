package com.ruoyi.mtms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.mtms.domain.PastMedicalHistory;
import com.ruoyi.mtms.vo.PastMedicalHistoryVO;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: PastMedicalHistoryService
 * @Package com.ruoyi.mtms.service
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

public interface PastMedicalHistoryService extends IService<PastMedicalHistory> {

    /**
     * 既往病史
     *
     * @param patientId
     * @param assessmentId
     * @return
     */
    List<PastMedicalHistoryVO> selectPastMedicalHistory(Integer patientId, Integer assessmentId);

}

