package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.common.utils.reflect.ReflectUtils;
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
        queryWrapper.eq(assessmentId != null, Morisky::getAssessmentId, assessmentId);
        queryWrapper.eq(patientId != null, Morisky::getPatId, patientId);
        Morisky info = moriskyService.getOne(queryWrapper);
        return BaseResult.<MoriskyVO>success()
            .data(info != null ? dozerMapper.map(info, MoriskyVO.class) : new MoriskyVO());
    }

    @ApiOperation("保存用药依从性")
    @PostMapping("/save_morisky_info")
    public BaseResult<MoriskyVO> saveMoriskyInfo(@RequestBody MoriskyVO moriskyVO) {
        Morisky morisky = dozerMapper.map(moriskyVO, Morisky.class);
        LambdaQueryWrapper<Morisky> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Morisky::getAssessmentId, moriskyVO.getAssessmentId());
        moriskyService.remove(queryWrapper);
        if (morisky != null) {
            morisky.setMorCountScore(calculationMoriskyScore(morisky));
        }
        moriskyService.save(morisky);
        return BaseResult.success();
    }

    /**
     * 用药依从性计算
     * 1-7题的备选答案为“是”、“否”，答“是”记0分，“否”记1分，其中第5题反向计分，第8题答案，选择从上往下的答案，分别记1分，0.75分，0.5分，0.25分，0分。
     *
     * @param morisky
     * @return
     */
    private String calculationMoriskyScore(Morisky morisky) {
        double score = 0;
        for (int i = 1; i < 9; i++) {
            Integer choose = ReflectUtils.invokeGetter(morisky, "MoriskyQuestion" + i);
            if (choose == null) {
                score += 0;
            } else if (i <= 7 && i != 5) {
                score += choose;
            } else if (i == 5 && choose == 0) {
                score += 1;
            } else if (i == 8) {
                switch (choose) {
                    case 1:
                        score += 1;
                        break;
                    case 2:
                        score += 0.75;
                        break;
                    case 3:
                        score += 0.5;
                        break;
                    case 4:
                        score += 0.25;
                        break;
                    case 5:
                        score += 0;
                        break;
                    default:
                        break;
                }
            }
        }
        return String.valueOf(score);
    }

    @ApiOperation("根据评估id或者患者id Eq5d3l查询")
    @GetMapping("/eq5d3l_info")
    public BaseResult<Eq5d3lVO> getEq5d3lInfo(@ApiParam(value = "评估Id") @RequestParam Integer assessmentId,
        @ApiParam(value = "患者Id") @RequestParam Integer patientId) {
        LambdaQueryWrapper<Eq5d3l> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Eq5d3l::getAssessmentId, assessmentId);
        queryWrapper.eq(Eq5d3l::getPatId, patientId);
        Eq5d3l info = eq5d3lService.getOne(queryWrapper);
        if (info == null) {
            return BaseResult.<Eq5d3lVO>success().data(null);
        }
        return BaseResult.<Eq5d3lVO>success().data(dozerMapper.map(info, Eq5d3lVO.class));
    }

    @ApiOperation("保存Eq5d3l")
    @PostMapping("/save_eq5d3l_info")
    public BaseResult<Eq5d3lVO> saveEq5d3lInfo(@RequestBody Eq5d3lVO eq5d3lVO) {
        Eq5d3l eq5d3l = dozerMapper.map(eq5d3lVO, Eq5d3l.class);
        LambdaQueryWrapper<Eq5d3l> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Eq5d3l::getAssessmentId, eq5d3lVO.getAssessmentId());
        eq5d3lService.remove(queryWrapper);
        if (eq5d3l != null) {
            eq5d3l.setEq5d3lScore(calculationEq5d3lScore(eq5d3l));
        }
        eq5d3lService.save(eq5d3l);
        return BaseResult.success();
    }

    /**
     * 计算eq5d3l
     *
     * @param eq5d3l
     * @return
     */
    private String calculationEq5d3lScore(Eq5d3l eq5d3l) {
        double score = 0;
        Integer actionQ = eq5d3l.getActionQ();
        if (actionQ == null) {
            score += 0;
        } else if (actionQ == 1) {
            score += 0.069;
        } else if (actionQ == 2) {
            score += 0.314;
        }
        Integer lookAfterSelfQ = eq5d3l.getLookAfterSelfQ();
        if (lookAfterSelfQ == null) {
            score += 0;
        } else if (lookAfterSelfQ == 1) {
            score += 0.104;
        } else if (lookAfterSelfQ == 2) {
            score += 0.214;
        }
        Integer dailyActQ = eq5d3l.getDailyActQ();
        if (dailyActQ == null) {
            score += 0;
        } else if (dailyActQ == 1) {
            score += 0.036;
        } else if (dailyActQ == 2) {
            score += 0.094;
        }
        Integer painQ = eq5d3l.getPainQ();
        if (painQ == null) {
            score += 0;
        } else if (painQ == 1) {
            score += 0.123;
        } else if (painQ == 2) {
            score += 0.386;
        }
        Integer anxietyQ = eq5d3l.getAnxietyQ();
        if (anxietyQ == null) {
            score += 0;
        } else if (anxietyQ == 1) {
            score += 0.071;
        } else if (anxietyQ == 2) {
            score += 0.236;
        }
        return String.valueOf(score);
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
        if (eq5d5l != null) {
            eq5d5l.setEq5d5lScore(calculationEq5d5lScore(eq5d5l));
        }
        eq5d5lService.save(eq5d5l);
        return BaseResult.success();
    }

    /**
     * 计算eq5d5l
     *
     * @param eq5d5l
     * @return
     */
    private String calculationEq5d5lScore(Eq5d5l eq5d5l) {
        double score = 0;
        Integer actionQ = eq5d5l.getActionQ();
        if (actionQ == null) {
            score += 0;
        } else if (actionQ == 2) {
            score += 0.066;
        } else if (actionQ == 3) {
            score += 0.158;
        } else if (actionQ == 4) {
            score += 0.287;
        } else if (actionQ == 5) {
            score += 0.345;
        }
        Integer lookAfterSelfQ = eq5d5l.getLookAfterSelfQ();
        if (lookAfterSelfQ == null) {
            score += 0;
        } else if (lookAfterSelfQ == 2) {
            score += 0.048;
        } else if (lookAfterSelfQ == 3) {
            score += 0.116;
        } else if (lookAfterSelfQ == 4) {
            score += 0.210;
        } else if (lookAfterSelfQ == 5) {
            score += 0.253;
        }
        Integer dailyActQ = eq5d5l.getDailyActQ();
        if (dailyActQ == null) {
            score += 0;
        } else if (dailyActQ == 2) {
            score += 0.045;
        } else if (dailyActQ == 3) {
            score += 0.107;
        } else if (dailyActQ == 4) {
            score += 0.194;
        } else if (dailyActQ == 5) {
            score += 0.233;
        }
        Integer painQ = eq5d5l.getPainQ();
        if (painQ == null) {
            score += 0;
        } else if (painQ == 2) {
            score += 0.058;
        } else if (painQ == 3) {
            score += 0.138;
        } else if (painQ == 4) {
            score += 0.252;
        } else if (painQ == 5) {
            score += 0.302;
        }
        Integer anxietyQ = eq5d5l.getAnxietyQ();
        if (anxietyQ == null) {
            score += 0;
        } else if (anxietyQ == 2) {
            score += 0.049;
        } else if (anxietyQ == 3) {
            score += 0.118;
        } else if (anxietyQ == 4) {
            score += 0.215;
        } else if (anxietyQ == 5) {
            score += 0.258;
        }
        return String.valueOf(score);
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
        if (sds != null) {
            sds.setSdsScore(calculationSdsScore(sds));
        }
        sdsService.save(sds);
        return BaseResult.success();
    }

    /**
     * 计算sds
     *
     * @param sds
     * @return
     */
    private String calculationSdsScore(Sds sds) {
        double score = 0;
        for (int i = 1; i < 21; i++) {
            Integer choose = ReflectUtils.invokeGetter(sds, "SdsQ" + i);
            if (choose == null) {
                score += 0;
            } else if (i == 2 || i == 5 || i == 6 || i == 11 || i == 12 || i == 14 || i == 16 || i == 17 || i == 18
                || i == 20) {
                switch (choose) {
                    case 1:
                        score += 4;
                        break;
                    case 2:
                        score += 3;
                        break;
                    case 3:
                        score += 2;
                        break;
                    case 4:
                        score += 1;
                        break;
                    default:
                        break;
                }
            } else {
                switch (choose) {
                    case 1:
                        score += 1;
                        break;
                    case 2:
                        score += 2;
                        break;
                    case 3:
                        score += 3;
                        break;
                    case 4:
                        score += 4;
                        break;
                    default:
                        break;
                }
            }
        }
        score *= 1.25;
        return String.valueOf(Math.floor(score));
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
