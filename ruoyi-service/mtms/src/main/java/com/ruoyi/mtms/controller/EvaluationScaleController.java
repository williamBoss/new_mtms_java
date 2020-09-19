package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.mtms.domain.*;
import com.ruoyi.mtms.service.*;
import com.ruoyi.mtms.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @Autowired
    private MoriskyService moriskyService;

    @Autowired
    private Eq5d3lService eq5d3lService;

    @Autowired
    private Eq5d5lService eq5d5lService;

    @Autowired
    private SdsService sdsService;

    @Autowired
    private ParService parService;

    @Autowired
    private Sf36Service sf36Service;

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
        Morisky morisky = dozerMapper.map(moriskyVO, Morisky.class);
        LambdaQueryWrapper<Morisky> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Morisky::getAssessmentId, moriskyVO.getAssessmentId());
        moriskyService.remove(queryWrapper);
        morisky.setMorCountScore(calculationMoriskyScore(morisky));
        moriskyService.save(morisky);
        return BaseResult.success();
    }

    private String calculationMoriskyScore(Morisky morisky) {
        return null;
    }

    @ApiOperation("根据评估id或者患者id Eq5d3l查询")
    @GetMapping("/eq5d3l_info")
    public BaseResult<Eq5d3lVO> getEq5d3lInfo(@ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<Eq5d3l> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Eq5d3l::getAssessmentId, assessmentId);
        queryWrapper.eq(Eq5d3l::getPatId, patientId);
        Eq5d3l info = eq5d3lService.getOne(queryWrapper);
        return BaseResult.<Eq5d3lVO>success().data(dozerMapper.map(info, Eq5d3lVO.class));
    }

    @ApiOperation("保存Eq5d3l")
    @PostMapping("/save_eq5d3l_info")
    public BaseResult<Eq5d3lVO> saveEq5d3lInfo(@RequestBody Eq5d3lVO eq5d3lVO) {
        Eq5d3l eq5d3l = dozerMapper.map(eq5d3lVO, Eq5d3l.class);
        LambdaQueryWrapper<Eq5d3l> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Eq5d3l::getAssessmentId, eq5d3lVO.getAssessmentId());
        eq5d3lService.remove(queryWrapper);
        eq5d3lService.save(eq5d3l);
        return BaseResult.success();
    }

    @ApiOperation("根据评估id或者患者id eq5d5l查询")
    @GetMapping("/eq5d5l_info")
    public BaseResult<Eq5d5lVO> getEq5d5lInfo(@ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<Eq5d5l> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Eq5d5l::getAssessmentId, assessmentId);
        queryWrapper.eq(Eq5d5l::getPatId, patientId);
        Eq5d5l info = eq5d5lService.getOne(queryWrapper);
        return BaseResult.<Eq5d5lVO>success().data(dozerMapper.map(info, Eq5d5lVO.class));
    }

    @ApiOperation("保存Eq5d5l")
    @PostMapping("/save_eq5d5l_info")
    public BaseResult<Eq5d5lVO> saveEq5D5LInfo(@RequestBody Eq5d5lVO eq5d5lVO) {
        Eq5d5l eq5d5l = dozerMapper.map(eq5d5lVO, Eq5d5l.class);
        LambdaQueryWrapper<Eq5d5l> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Eq5d5l::getAssessmentId, eq5d5lVO.getAssessmentId());
        eq5d5lService.remove(queryWrapper);
        eq5d5lService.save(eq5d5l);
        return BaseResult.success();
    }

    @ApiOperation("根据评估id或者患者id sds查询")
    @GetMapping("/sds_info")
    public BaseResult<SdsVO> getSdsInfo(@ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<Sds> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Sds::getAssessmentId, assessmentId);
        queryWrapper.eq(Sds::getPatId, patientId);
        Sds info = sdsService.getOne(queryWrapper);
        return BaseResult.<SdsVO>success().data(dozerMapper.map(info, SdsVO.class));
    }

    @ApiOperation("保存Sds")
    @PostMapping("/save_sds_info")
    public BaseResult<SdsVO> saveSdsInfo(@RequestBody SdsVO sdsVO) {
        Sds sds = dozerMapper.map(sdsVO, Sds.class);
        LambdaQueryWrapper<Sds> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Sds::getAssessmentId, sdsVO.getAssessmentId());
        sdsService.remove(queryWrapper);
        sdsService.save(sds);
        return BaseResult.success();
    }

    @ApiOperation("根据评估id或者患者id sf36查询")
    @GetMapping("/sf36_info")
    public BaseResult<Sf36VO> getSf36Info(@ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<Sf36> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Sf36::getAssessmentId, assessmentId);
        queryWrapper.eq(Sf36::getPatId, patientId);
        Sf36 info = sf36Service.getOne(queryWrapper);
        return BaseResult.<Sf36VO>success().data(dozerMapper.map(info, Sf36VO.class));
    }

    @ApiOperation("保存sf36")
    @PostMapping("/save_sf36_info")
    public BaseResult<Sf36VO> saveSf36Info(@RequestBody Sf36VO sf36VO) {
        Sf36 sf36 = dozerMapper.map(sf36VO, Sf36.class);
        LambdaQueryWrapper<Sf36> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Sf36::getAssessmentId, sf36VO.getAssessmentId());
        sf36Service.remove(queryWrapper);
        sf36Service.save(sf36);
        return BaseResult.success();
    }

    @ApiOperation("根据评估id或者患者id 心脑血管查询")
    @GetMapping("/par_info")
    public BaseResult<ParVO> getParInfo(@ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<Par> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Par::getAssessmentId, assessmentId);
        queryWrapper.eq(Par::getPatId, patientId);
        Par info = parService.getOne(queryWrapper);
        return BaseResult.<ParVO>success().data(dozerMapper.map(info, ParVO.class));
    }

    @ApiOperation("保存心脑血管")
    @PostMapping("/save_par_info")
    public BaseResult<SdsVO> saveParInfo(@RequestBody ParVO parVO) {
        Par par = dozerMapper.map(parVO, Par.class);
        LambdaQueryWrapper<Par> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Par::getAssessmentId, parVO.getAssessmentId());
        parService.remove(queryWrapper);
        parService.save(par);
        return BaseResult.success();
    }

}
