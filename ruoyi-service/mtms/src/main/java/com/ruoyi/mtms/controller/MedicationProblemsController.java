package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.common.core.domain.DataResult;
import com.ruoyi.common.core.domain.PageResult;
import com.ruoyi.mtms.domain.MedicationProblems;
import com.ruoyi.mtms.service.MedicationProblemsService;
import com.ruoyi.mtms.vo.MedicationProblemsVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * 药物治疗问题
 *
 * @author KING
 */
@Api("药物治疗问题")
@RestController
@RequestMapping("/medication_problem")
public class MedicationProblemsController {

    @Autowired
    private MedicationProblemsService medicationProblemsService;

    @Autowired
    private Mapper dozenMapper;

    @ApiOperation("药物治疗问题列表")
    @GetMapping("/")
    public BaseResult<PageResult<MedicationProblemsVO>> assessmentList(
        @ApiParam(value = "页数") @RequestParam(name = "pageNum") Integer pageNo,
        @ApiParam(value = "每页条数") @RequestParam(name = "pageSize") Integer pageSize,
        MedicationProblemsVO medicationProblemsVO) {
        Page<MedicationProblemsVO> medicationProblemsList = medicationProblemsService
            .selectMedProblemsPage(pageNo, pageSize, medicationProblemsVO.getAssessmentId(),
                medicationProblemsVO.getPatientId());
        return DataResult.result(medicationProblemsList, medicationProblemsList.getRecords());
    }

    @ApiOperation("保存药物治疗问题")
    @PostMapping("/")
    public BaseResult<MedicationProblems> saveMedicationProblems(
        @RequestBody MedicationProblemsVO medicationProblemsVO) {
        MedicationProblems medicationProblems = dozenMapper.map(medicationProblemsVO, MedicationProblems.class);
        medicationProblems.setIndications(Arrays.stream(medicationProblemsVO.getIndicationses()).map(String::valueOf)
            .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        medicationProblems.setEffectiveness(Arrays.stream(medicationProblemsVO.getEffectivenessies()).map(String::valueOf)
            .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        medicationProblems.setSafety(Arrays.stream(medicationProblemsVO.getSafeties()).map(String::valueOf)
            .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        medicationProblems.setCompliance(Arrays.stream(medicationProblemsVO.getCompliances()).map(String::valueOf)
            .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        medicationProblemsService.save(medicationProblems);
        return BaseResult.success();
    }

    @ApiOperation("修改药物治疗问题")
    @PutMapping("/")
    public BaseResult<MedicationProblems> updateMedicationProblems(
        @RequestBody MedicationProblemsVO medicationProblemsVO) {
        MedicationProblems medicationProblems = dozenMapper.map(medicationProblemsVO, MedicationProblems.class);
        medicationProblemsService.updateById(medicationProblems);
        return BaseResult.success();
    }
}
