package com.ruoyi.mtms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.mtms.domain.MedicationSideEffect;
import com.ruoyi.mtms.vo.MedicationSideEffectVO;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: MedicationSideEffectService
 * @Package com.ruoyi.mtms.service
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

public interface MedicationSideEffectService extends IService<MedicationSideEffect> {

    List<MedicationSideEffectVO> selectAllByPatientId(Integer patientId);

}

