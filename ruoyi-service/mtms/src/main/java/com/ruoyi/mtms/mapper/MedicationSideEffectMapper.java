package com.ruoyi.mtms.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.mtms.domain.MedicationSideEffect;
import com.ruoyi.mtms.vo.MedicationSideEffectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/18 22:55
 */
public interface MedicationSideEffectMapper extends BaseMapper<MedicationSideEffect> {

    List<MedicationSideEffectVO> selectAllByPatientId(@Param("patientId")Integer patientId);



}