package com.ruoyi.mtms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.mtms.domain.MedicationProblems;
import com.ruoyi.mtms.vo.MedicationProblemsVO;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/9 9:45
 */
public interface MedicationProblemsService extends IService<MedicationProblems> {

    Page<MedicationProblemsVO> selectMedProblemsPage(Integer pageNo, Integer pageSize, Integer assessmentId,
        Integer patientId, Integer isResolved);

}



