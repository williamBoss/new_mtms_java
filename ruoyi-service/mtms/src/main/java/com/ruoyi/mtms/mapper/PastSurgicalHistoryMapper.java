package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.mtms.domain.PastSurgicalHistory;
import com.ruoyi.mtms.vo.PastSurgicalHistoryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/10 20:56
 */
public interface PastSurgicalHistoryMapper extends BaseMapper<PastSurgicalHistory> {

    /**
     * 获取既往手术史记录
     *
     * @param patientId
     * @param assessmentId
     * @return
     */
    List<PastSurgicalHistoryVO> selectPastSurgicalHistories(@Param("patientId") Integer patientId,
        @Param("assessmentId") Integer assessmentId);

}