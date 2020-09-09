package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.mtms.domain.MedicationProblems;
import com.ruoyi.mtms.vo.MedicationProblemsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/9 9:47
 */
public interface MedicationProblemsMapper extends BaseMapper<MedicationProblems> {

    /**
     * 根据患者id 查询药物治疗问题列表
     *
     * @param assessmentId
     * @param patientId
     * @return
     */
    List<MedicationProblemsVO> selectMedProblemsPage(Page page, @Param("assessmentId") Integer assessmentId,
        @Param("patientId") Integer patientId);

}