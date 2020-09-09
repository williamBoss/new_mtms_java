package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.mtms.domain.Morisky;
import com.ruoyi.mtms.service.MoriskyService;
import com.ruoyi.mtms.vo.MoriskyVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 评估量表
 *
 * @author KING
 */
@Api("评估量表")
@RestController
@RequestMapping("/evaluation_scale")
public class EvaluationScaleController {

    // TODO: 2020/9/9 各评估问卷的列表 保存 保存的时候删除之前的记录（逻辑删除）
    // MoriskyVO

    @Autowired
    private MoriskyService moriskyService;

    @Autowired
    private Mapper dozerMapper;

    @ApiOperation("根据评估id或者患者id用药依从性查询")
    @GetMapping("/morisky_info")
    public BaseResult<MoriskyVO> getMoriskyInfo(@ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<Morisky> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Morisky::getAssessmentId, assessmentId);
        queryWrapper.eq(Morisky::getPatId, patientId);
        Morisky info = moriskyService.getOne(queryWrapper);
        return BaseResult.<MoriskyVO>success().data(dozerMapper.map(info, MoriskyVO.class));
    }

    @ApiOperation("保存用药依从性")
    @PostMapping("/save_morisky_info")
    public BaseResult<MoriskyVO> saveMoriskyInfo(@RequestBody MoriskyVO moriskyVO) {
        return BaseResult.success();
    }

    // Eq5d3lVO
    //     Eq5d5lVO
    // SdsVO
    // ParVO

}
