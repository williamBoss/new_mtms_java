package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.mtms.domain.MedicationSideEffect;
import com.ruoyi.mtms.mapper.MedicationSideEffectMapper;
import com.ruoyi.mtms.service.MedicationSideEffectService;
import com.ruoyi.mtms.vo.MedicationSideEffectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: MedicationSideEffectServiceImpl
 * @Package com.ruoyi.mtms.service.Impl
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

@Service
public class MedicationSideEffectServiceImpl extends ServiceImpl<MedicationSideEffectMapper, MedicationSideEffect>
    implements MedicationSideEffectService {

    @Autowired
    private MedicationSideEffectMapper medicationSideEffectMapper;

    @Override
    public List<MedicationSideEffectVO> selectAllByPatientId(Integer patientId) {
        return medicationSideEffectMapper.selectAllByPatientId(patientId);
    }
}

