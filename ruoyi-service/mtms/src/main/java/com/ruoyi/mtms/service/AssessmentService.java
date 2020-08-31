package com.ruoyi.mtms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.mtms.domain.Assessment;
import com.ruoyi.mtms.vo.AssessmentVO;
import com.ruoyi.mtms.vo.UseMedRecordVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: AssessmentService
 * @Package com.ruoyi.mtms.service
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/27 15:34
 */

public interface AssessmentService extends IService<Assessment> {

    /**
     * 评估列表
     *
     * @param pageNo
     * @param pageSize
     * @param assessmentVO
     * @param diseaseIds
     * @return
     */
    Page<AssessmentVO> assessmentList(Integer pageNo, Integer pageSize, AssessmentVO assessmentVO, String diseaseIds);

    /**
     * 根据患者id查询评估记录
     *
     * @param patientId
     * @return
     */
    List<AssessmentVO> selectAssessmentByPatientId(@Param("patientId") Integer patientId);

    /**
     * 用药记录列表
     *
     * @param pageNo
     * @param pageSize
     * @param useMedRecordVO
     * @return
     */
    Page<UseMedRecordVO> useMedRecordList(Integer pageNo, Integer pageSize, UseMedRecordVO useMedRecordVO);
}

