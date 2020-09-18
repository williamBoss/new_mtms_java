package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.mtms.domain.EvaluationReportProblem;
import com.ruoyi.mtms.service.EvaluationReportProblemService;
import com.ruoyi.mtms.vo.EvaluationReportProblemVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Api("评估报告")
@RestController
@RequestMapping
public class EvaluationReportController extends BaseController {

    @Autowired
    private EvaluationReportProblemService evaluationReportProblemService;

    @Autowired
    private Mapper dozerMapper;

    @ApiOperation("获取评估报告-发现问题")
    @GetMapping("/evaluation_report_problem_list")
    public BaseResult<List<EvaluationReportProblemVO>> getEvaluationReportProblemList(
        @ApiParam(value = "评估Id") @RequestParam(required = false) Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam(required = false) Integer patientId) {
        LambdaQueryWrapper<EvaluationReportProblem> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(assessmentId != null, EvaluationReportProblem::getAssessmentId, assessmentId);
        queryWrapper.eq(patientId != null, EvaluationReportProblem::getPatientId, patientId);
        queryWrapper.orderByAsc(EvaluationReportProblem::getSort);
        List<EvaluationReportProblemVO> list = new ArrayList<>();
        evaluationReportProblemService.list(queryWrapper).forEach(item -> {
            list.add(dozerMapper.map(item, EvaluationReportProblemVO.class));
        });
        return BaseResult.<List<EvaluationReportProblemVO>>success().data(list);
    }

    @ApiOperation("保存评估报告-发现问题")
    @PostMapping("/save_evaluation_report_problem")
    public BaseResult<EvaluationReportProblemVO> saveEvaluationReportProblem(
        @RequestBody EvaluationReportProblemVO evaluationReportProblemVO) {
        EvaluationReportProblem evaluationReportProblem =
            dozerMapper.map(evaluationReportProblemVO, EvaluationReportProblem.class);
        evaluationReportProblemService.save(evaluationReportProblem);
        return BaseResult.success();
    }

    @ApiOperation("修改评估报告-发现问题")
    @PutMapping("/update_evaluation_report_problem")
    public BaseResult<EvaluationReportProblemVO> updateEvaluationReportProblem(
        @RequestBody EvaluationReportProblemVO evaluationReportProblemVO) {
        EvaluationReportProblem evaluationReportProblem =
            dozerMapper.map(evaluationReportProblemVO, EvaluationReportProblem.class);
        evaluationReportProblemService.updateById(evaluationReportProblem);
        return BaseResult.success();
    }

}
