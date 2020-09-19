package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.common.core.domain.DataResult;
import com.ruoyi.common.core.domain.PageResult;
import com.ruoyi.mtms.domain.MedicationProblems;
import com.ruoyi.mtms.domain.MedicationProblemsDict;
import com.ruoyi.mtms.service.MedicationProblemsDictService;
import com.ruoyi.mtms.service.MedicationProblemsService;
import com.ruoyi.mtms.vo.MedicationProblemsDictVO;
import com.ruoyi.mtms.vo.MedicationProblemsVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    private MedicationProblemsDictService medicationProblemsDictService;

    @Autowired
    private Mapper dozenMapper;

    @ApiOperation("药物治疗问题列表")
    @GetMapping("/")
    public BaseResult<PageResult<MedicationProblemsVO>> assessmentList(
        @ApiParam(value = "页数") @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @ApiParam(value = "每页条数") @RequestParam(name = "pageSize", defaultValue = "100000") Integer pageSize,
        MedicationProblemsVO medicationProblemsVO) {
        Page<MedicationProblemsVO> medicationProblemsList = medicationProblemsService
            .selectMedProblemsPage(pageNo, pageSize, medicationProblemsVO.getAssessmentId(),
                medicationProblemsVO.getPatientId(), medicationProblemsVO.getIsResolved());
        return DataResult.result(medicationProblemsList, medicationProblemsList.getRecords());
    }

    @ApiOperation("保存药物治疗问题")
    @PostMapping("/")
    public BaseResult<MedicationProblemsVO> saveMedicationProblems(
        @RequestBody MedicationProblemsVO medicationProblemsVO) {
        MedicationProblems medicationProblems = setMedProblemId(medicationProblemsVO);
        medicationProblemsService.save(medicationProblems);
        return BaseResult.success();
    }

    @ApiOperation("修改药物治疗问题")
    @PutMapping("/")
    public BaseResult<MedicationProblemsVO> updateMedicationProblems(
        @RequestBody MedicationProblemsVO medicationProblemsVO) {
        setMedProblemId(medicationProblemsVO);
        MedicationProblems medicationProblems = setMedProblemId(medicationProblemsVO);
        medicationProblemsService.updateById(medicationProblems);
        return BaseResult.success();
    }

    private MedicationProblems setMedProblemId(@RequestBody MedicationProblemsVO medicationProblemsVO) {
        MedicationProblems medicationProblems = dozenMapper.map(medicationProblemsVO, MedicationProblems.class);
        medicationProblems.setIndications(Arrays.stream(medicationProblemsVO.getIndicationses()).map(String::valueOf)
            .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        medicationProblems.setEffectiveness(
            Arrays.stream(medicationProblemsVO.getEffectivenessies()).map(String::valueOf)
                .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        medicationProblems.setSafety(Arrays.stream(medicationProblemsVO.getSafeties()).map(String::valueOf)
            .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        medicationProblems.setCompliance(Arrays.stream(medicationProblemsVO.getCompliances()).map(String::valueOf)
            .reduce((currentValue, item) -> currentValue.concat(",").concat(item)).orElse(""));
        return medicationProblems;
    }

    @ApiOperation("获取药物治疗问题字典")
    @GetMapping("/medication_problems_dict")
    public BaseResult<List<MedicationProblemsDictVO>> getMedicationProblemsDict(
        @ApiParam(value = "问题类型 1.适应症 2.有效性 3.安全性 4.依从性 ") @RequestParam(name = "problemType") Integer problemType) {
        List<MedicationProblemsDictVO> list = getMedProblemDict(problemType, 0);
        list.forEach(item -> {
            List<MedicationProblemsDictVO> childList = getMedProblemDict(problemType, item.getId());
            childList.forEach(childItem -> {
                childItem.setChildList(getMedProblemDict(problemType, childItem.getId()));
            });
            item.setChildList(childList);
        });
        return BaseResult.<List<MedicationProblemsDictVO>>success().data(list);
    }

    /**
     * 获取药物治疗问题字典信息
     *
     * @param problemType 问题类型
     * @param parentId    父级id
     * @return
     */
    private List<MedicationProblemsDictVO> getMedProblemDict(Integer problemType, Integer parentId) {
        LambdaQueryWrapper<MedicationProblemsDict> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(MedicationProblemsDict::getId, MedicationProblemsDict::getProblemType,
            MedicationProblemsDict::getMedicationProblems);
        queryWrapper.eq(MedicationProblemsDict::getProblemType, problemType);
        queryWrapper.eq(MedicationProblemsDict::getParentId, parentId);
        List<MedicationProblemsDictVO> list = new ArrayList<>();
        medicationProblemsDictService.list(queryWrapper).forEach(item -> {
            list.add(dozenMapper.map(item, MedicationProblemsDictVO.class));
        });
        return list;
    }

}
