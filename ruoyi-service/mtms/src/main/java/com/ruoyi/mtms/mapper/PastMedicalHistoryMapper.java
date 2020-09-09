package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.mtms.domain.PastMedicalHistory;
import com.ruoyi.mtms.vo.PastMedicalHistoryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/9 21:19
 */
public interface PastMedicalHistoryMapper extends BaseMapper<PastMedicalHistory> {

    /**
     * 既往病史
     *
     * @param patientId
     * @param assessmentId
     * @return
     */
    List<PastMedicalHistoryVO> selectPastMedicalHistory(@Param("patientId") Integer patientId,
        @Param("assessmentId") Integer assessmentId);
}