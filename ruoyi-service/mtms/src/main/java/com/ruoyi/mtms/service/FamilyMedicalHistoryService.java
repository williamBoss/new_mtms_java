package com.ruoyi.mtms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.mtms.domain.FamilyMedicalHistory;
import com.ruoyi.mtms.vo.FamilyMedicalHistoryVO;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: FamilyMedicalHistoryService
 * @Package com.ruoyi.mtms.service
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

public interface FamilyMedicalHistoryService extends IService<FamilyMedicalHistory> {

    /**
     * 获取家族史
     *
     * @param patientId
     * @param assessmentId
     * @return
     */
    List<FamilyMedicalHistoryVO> selectFamilyMedicalHistory(Integer patientId, Integer assessmentId);

}

