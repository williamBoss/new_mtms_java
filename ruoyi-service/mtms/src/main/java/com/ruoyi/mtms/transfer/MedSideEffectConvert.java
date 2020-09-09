package com.ruoyi.mtms.transfer;

import com.ruoyi.mtms.domain.MedicationSideEffect;
import com.ruoyi.mtms.vo.MedicationSideEffectVO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * 用药不良信息转换
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/4 14:55
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MedSideEffectConvert {

    /**
     * List<MedicationSideEffectVO> -> List<MedicationSideEffect>
     *
     * @param medicationSideEffects
     * @return
     */
    List<MedicationSideEffectVO> medicationSideEffectVOS2MedicationSideEffects(
        List<MedicationSideEffect> medicationSideEffects);

}
