package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.mtms.domain.Assessment;
import com.ruoyi.mtms.domain.UseMedRecord;
import com.ruoyi.mtms.dto.AssessmentDTO;
import com.ruoyi.mtms.vo.AssessmentVO;
import com.ruoyi.mtms.vo.UseMedRecordVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: AssessmentMapper
 * @Package com.ruoyi.mtms.mapper
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:36
 */

public interface AssessmentMapper extends BaseMapper<Assessment> {

    /**
     * 查询评估记录（翻页）
     *
     * @param page
     * @param assessmentDTO
     * @param diseaseIds
     * @return
     */
    List<AssessmentVO> selectAssessmentPage(Page page, @Param("assessmentDTO") AssessmentDTO assessmentDTO,
        @Param("diseaseIds") String diseaseIds);

    /**
     * 根据患者id查询评估记录
     *
     * @param patientId
     * @return
     */
    List<AssessmentVO> selectAssessmentByPatientId(@Param("patientId") Integer patientId);

    /**
     * 用药计划
     *
     * @param page
     * @param useMedRecord
     * @return
     */
    List<UseMedRecordVO> selectUseMedRecordList(Page page, @Param("useMedRecord") UseMedRecord useMedRecord);

}
