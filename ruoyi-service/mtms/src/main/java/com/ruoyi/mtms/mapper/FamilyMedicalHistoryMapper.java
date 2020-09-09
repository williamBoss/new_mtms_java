package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.mtms.domain.FamilyMedicalHistory;
import com.ruoyi.mtms.vo.FamilyMedicalHistoryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/9 20:50
 */
public interface FamilyMedicalHistoryMapper extends BaseMapper<FamilyMedicalHistory> {

    /**
     * 获取家族史
     *
     * @param patientId
     * @param assessmentId
     * @return
     */
    List<FamilyMedicalHistoryVO> selectFamilyMedicalHistory(@Param("patientId") Integer patientId,
        @Param("assessmentId") Integer assessmentId);

}