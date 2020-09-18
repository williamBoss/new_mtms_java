package com.ruoyi.mtms.service.Impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.mtms.domain.MedicationProblems;
import com.ruoyi.mtms.mapper.MedicationProblemsMapper;
import com.ruoyi.mtms.service.MedicationProblemsService;
import com.ruoyi.mtms.vo.MedicationProblemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * ${TODO}
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/9 9:45
 */
@Service
public class MedicationProblemsServiceImpl extends ServiceImpl<MedicationProblemsMapper, MedicationProblems>
    implements MedicationProblemsService {

    @Autowired
    private MedicationProblemsMapper medicationProblemsMapper;

    @Autowired
    private Mapper dozerMapper;

    @Override
    public Page<MedicationProblemsVO> selectMedProblemsPage(Integer pageNo, Integer pageSize, Integer assessmentId,
        Integer patientId, Integer isResolved) {
        Page<MedicationProblemsVO> page = new Page<>(pageNo, pageSize);
        List<MedicationProblems> medicationProblemsList =
            medicationProblemsMapper.selectMedProblemsPage(page, assessmentId, patientId, isResolved);
        List<MedicationProblemsVO> list = new ArrayList<>();
        medicationProblemsList.forEach(v -> {
            MedicationProblemsVO info = dozerMapper.map(v, MedicationProblemsVO.class);
            info.setIndicationses(
                Stream.of(StringUtils.isBlank(v.getIndications()) ? new String[] {"0"} : v.getIndications().split(","))
                    .map(Integer::valueOf).toArray(Integer[]::new));
            info.setEffectivenessies(Stream
                .of(StringUtils.isBlank(v.getEffectiveness()) ? new String[] {"0"} : v.getEffectiveness().split(","))
                .map(Integer::valueOf).toArray(Integer[]::new));
            info.setSafeties(
                Stream.of(StringUtils.isBlank(v.getSafety()) ? new String[] {"0"} : v.getSafety().split(","))
                    .map(Integer::valueOf).toArray(Integer[]::new));
            info.setCompliances(
                Stream.of(StringUtils.isBlank(v.getCompliance()) ? new String[] {"0"} : v.getCompliance().split(","))
                    .map(Integer::valueOf).toArray(Integer[]::new));
            list.add(info);
        });
        page.setRecords(list);
        return page;
    }

}



