package com.ruoyi.mtms.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.dozermapper.core.Mapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.common.core.domain.DataResult;
import com.ruoyi.common.core.domain.PageResult;
import com.ruoyi.common.core.domain.Result;
import com.ruoyi.mtms.domain.*;
import com.ruoyi.mtms.service.*;
import com.ruoyi.mtms.vo.*;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 检测检验
 *
 * @author KING
 * @version V1.0
 * @date 2020/9/5 15:34
 */
@Slf4j
@Api("检测检验")
@RestController()
@RequestMapping("/detect")
public class DetectController extends BaseController {

    @Autowired
    private DetectBloodPressureService detectBloodPressureService;

    @Autowired
    private DetectHeartRateService detectHeartRateService;

    @Autowired
    private DetectBloodLipidsService detectBloodLipidsService;

    @Autowired
    private DetectBloodSugarService detectBloodSugarService;

    @Autowired
    private DetectBloodUricAcidService detectBloodUricAcidService;

    @Autowired
    private DetectElectrolyteService detectElectrolyteService;

    @Autowired
    private DetectHomocysteineService detectHomocysteineService;

    @Autowired
    private DetectKidneyFunctionService detectKidneyFunctionService;

    @Autowired
    private DetectLiverFunctionService detectLiverFunctionService;

    @Autowired
    private DetectOtherService detectOtherService;

    @Autowired
    private Mapper dozenMapper;

    @ApiOperation("查询血压检测检验")
    @GetMapping("/getDetectBloodPressureList")
    public BaseResult<PageResult<DetectBloodPressure>> getDetectBloodPressure(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectBloodPressure> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectBloodPressure> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectBloodPressure::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectBloodPressure::getDetectDate);
        Page<DetectBloodPressure> list = detectBloodPressureService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存血压检验检测")
    @PostMapping("/saveDetectBloodPressure")
    public Result saveDetectBloodPressure(@RequestBody DetectBloodPressureVO detectBloodPressureVO) {
        DetectBloodPressure detectBloodPressure = dozenMapper.map(detectBloodPressureVO, DetectBloodPressure.class);
        try {
            detectBloodPressureService.save(detectBloodPressure);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error();
    }

    @ApiOperation("修改血压检测检验")
    @PutMapping("/updateDetectBloodPressure")
    public Result updateDetectBloodPressure(@RequestBody DetectBloodPressureVO detectBloodPressureVO) {
        DetectBloodPressure detectBloodPressure = dozenMapper.map(detectBloodPressureVO, DetectBloodPressure.class);
        try {
            detectBloodPressureService.updateById(detectBloodPressure);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error();
    }

    @ApiOperation("查询心率检测检验")
    @GetMapping("/getDetectHeartRateList")
    public BaseResult<PageResult<DetectHeartRate>> getDetectHeartRate(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectHeartRate> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectHeartRate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectHeartRate::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectHeartRate::getDetectDate);
        Page<DetectHeartRate> list = detectHeartRateService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存心率检验检测")
    @PostMapping("/saveDetectHeartRate")
    public Result saveDetectHeartRate(@RequestBody DetectHeartRateVO detectHeartRateVO) {
        DetectHeartRate detectHeartRate = dozenMapper.map(detectHeartRateVO, DetectHeartRate.class);
        try {
            detectHeartRateService.save(detectHeartRate);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error();
    }

    @ApiOperation("修改心率检测检验")
    @PutMapping("/updateDetectHeartRate")
    public Result updateDetectHeartRate(@RequestBody DetectHeartRateVO detectHeartRateVO) {
        DetectHeartRate detectHeartRate = dozenMapper.map(detectHeartRateVO, DetectHeartRate.class);
        try {
            detectHeartRateService.updateById(detectHeartRate);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error();
    }

    @ApiOperation("查询血脂检测检验")
    @GetMapping("/getDetectBloodLipidsList")
    public BaseResult<PageResult<DetectBloodLipids>> getDetectBloodLipids(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectBloodLipids> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectBloodLipids> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectBloodLipids::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectBloodLipids::getDetectDate);
        Page<DetectBloodLipids> list = detectBloodLipidsService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存血脂检验检测")
    @PostMapping("/saveDetectBloodLipids")
    public Result saveDetectBloodLipids(@RequestBody DetectBloodLipidsVO detectBloodLipidsVO) {
        DetectBloodLipids detectBloodLipids = dozenMapper.map(detectBloodLipidsVO, DetectBloodLipids.class);
        try {
            detectBloodLipidsService.save(detectBloodLipids);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改血脂检测检验")
    @PutMapping("/updateDetectBloodLipids")
    public Result updateDetectBloodLipids(@RequestBody DetectBloodLipidsVO detectBloodLipidsVO) {
        DetectBloodLipids detectBloodLipids = dozenMapper.map(detectBloodLipidsVO, DetectBloodLipids.class);
        try {
            detectBloodLipidsService.updateById(detectBloodLipids);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error();
    }

    @ApiOperation("查询血糖检测检验")
    @GetMapping("/getDetectBloodSugarList")
    public BaseResult<PageResult<DetectBloodSugar>> getDetectBloodSugar(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectBloodSugar> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectBloodSugar> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectBloodSugar::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectBloodSugar::getDetectDate);
        Page<DetectBloodSugar> list = detectBloodSugarService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存血糖检验检测")
    @PostMapping("/saveDetectBloodSugar")
    public Result saveDetectBloodSugar(@RequestBody DetectBloodSugarVO detectBloodSugarVO) {
        DetectBloodSugar detectBloodSugar = dozenMapper.map(detectBloodSugarVO, DetectBloodSugar.class);
        try {
            detectBloodSugarService.save(detectBloodSugar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改血糖检测检验")
    @PutMapping("/updateDetectBloodSugar")
    public Result updateDetectBloodSugar(@RequestBody DetectBloodSugarVO detectBloodSugarVO) {
        DetectBloodSugar detectBloodSugar = dozenMapper.map(detectBloodSugarVO, DetectBloodSugar.class);
        try {
            detectBloodSugarService.updateById(detectBloodSugar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("查询同型半胱氨酸检测检验")
    @GetMapping("/getDetectHomocysteineList")
    public BaseResult<PageResult<DetectHomocysteine>> getDetectHomocysteine(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectHomocysteine> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectHomocysteine> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectHomocysteine::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectHomocysteine::getDetectDate);
        Page<DetectHomocysteine> list = detectHomocysteineService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存同型半胱氨酸检验检测")
    @PostMapping("/saveDetectHomocysteine")
    public Result saveDetectHomocysteine(@RequestBody DetectHomocysteineVO detectHomocysteineVO) {
        DetectHomocysteine detectHomocysteine = dozenMapper.map(detectHomocysteineVO, DetectHomocysteine.class);
        try {
            detectHomocysteineService.save(detectHomocysteine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改同型半胱氨酸检测检验")
    @PutMapping("/updateDetectHomocysteine")
    public Result updateDetectHomocysteine(@RequestBody DetectHomocysteineVO detectHomocysteineVO) {
        DetectHomocysteine detectHomocysteine = dozenMapper.map(detectHomocysteineVO, DetectHomocysteine.class);
        try {
            detectHomocysteineService.updateById(detectHomocysteine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("查询血尿酸检测检验")
    @GetMapping("/getDetectBloodUricAcidList")
    public BaseResult<PageResult<DetectBloodUricAcid>> getDetectBloodUricAcid(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectBloodUricAcid> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectBloodUricAcid> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectBloodUricAcid::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectBloodUricAcid::getDetectDate);
        Page<DetectBloodUricAcid> list = detectBloodUricAcidService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存血尿酸检验检测")
    @PostMapping("/saveDetectBloodUricAcid")
    public Result saveDetectBloodUricAcid(@RequestBody DetectBloodUricAcidVO detectBloodUricAcidVO) {
        DetectBloodUricAcid detectBloodUricAcid = dozenMapper.map(detectBloodUricAcidVO, DetectBloodUricAcid.class);
        try {
            detectBloodUricAcidService.save(detectBloodUricAcid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改血尿酸检测检验")
    @PutMapping("/updateDetectBloodUricAcid")
    public Result updateDetectBloodUricAcid(@RequestBody DetectBloodUricAcidVO detectBloodUricAcidVO) {
        DetectBloodUricAcid detectBloodUricAcid = dozenMapper.map(detectBloodUricAcidVO, DetectBloodUricAcid.class);
        try {
            detectBloodUricAcidService.updateById(detectBloodUricAcid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("查询肝功能检测检验")
    @GetMapping("/getDetectLiverFunctionList")
    public BaseResult<PageResult<DetectLiverFunction>> getDetectLiverFunction(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectLiverFunction> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectLiverFunction> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectLiverFunction::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectLiverFunction::getDetectDate);
        Page<DetectLiverFunction> list = detectLiverFunctionService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存肝功能检验检测")
    @PostMapping("/saveDetectLiverFunction")
    public Result saveDetectLiverFunction(@RequestBody DetectLiverFunctionVO detectLiverFunctionVO) {
        DetectLiverFunction detectLiverFunction = dozenMapper.map(detectLiverFunctionVO, DetectLiverFunction.class);
        try {
            detectLiverFunctionService.save(detectLiverFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改肝功能检测检验")
    @PutMapping("/updateDetectLiverFunction")
    public Result updateDetectLiverFunction(@RequestBody DetectLiverFunctionVO detectLiverFunctionVO) {
        DetectLiverFunction detectLiverFunction = dozenMapper.map(detectLiverFunctionVO, DetectLiverFunction.class);
        try {
            detectLiverFunctionService.updateById(detectLiverFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("查询肾功能检测检验")
    @GetMapping("/getDetectKidneyFunctionList")
    public BaseResult<PageResult<DetectKidneyFunction>> getDetectKidneyFunction(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectKidneyFunction> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectKidneyFunction> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectKidneyFunction::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectKidneyFunction::getDetectDate);
        Page<DetectKidneyFunction> list = detectKidneyFunctionService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存肾功能检验检测")
    @PostMapping("/saveDetectKidneyFunction")
    public Result saveDetectKidneyFunction(@RequestBody DetectKidneyFunctionVO detectKidneyFunctionVO) {
        DetectKidneyFunction detectKidneyFunction = dozenMapper.map(detectKidneyFunctionVO, DetectKidneyFunction.class);
        try {
            detectKidneyFunctionService.save(detectKidneyFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改肾功能检测检验")
    @PutMapping("/updateDetectKidneyFunction")
    public Result updateDetectKidneyFunction(@RequestBody DetectKidneyFunctionVO detectKidneyFunctionVO) {
        DetectKidneyFunction detectKidneyFunction = dozenMapper.map(detectKidneyFunctionVO, DetectKidneyFunction.class);
        try {
            detectKidneyFunctionService.updateById(detectKidneyFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("查询电解质检测检验")
    @GetMapping("/getDetectElectrolyteList")
    public BaseResult<PageResult<DetectElectrolyte>> getDetectElectrolyte(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectElectrolyte> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectElectrolyte> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectElectrolyte::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectElectrolyte::getDetectDate);
        Page<DetectElectrolyte> list = detectElectrolyteService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存电解质检验检测")
    @PostMapping("/saveDetectElectrolyte")
    public Result saveDetectElectrolyte(@RequestBody DetectElectrolyteVO detectElectrolyteVO) {
        DetectElectrolyte detectElectrolyte = dozenMapper.map(detectElectrolyteVO, DetectElectrolyte.class);
        try {
            detectElectrolyteService.save(detectElectrolyte);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改电解质检测检验")
    @PutMapping("/updateDetectElectrolyte")
    public Result updateDetectElectrolyte(@RequestBody DetectElectrolyteVO detectElectrolyteVO) {
        DetectElectrolyte detectElectrolyte = dozenMapper.map(detectElectrolyteVO, DetectElectrolyte.class);
        try {
            detectElectrolyteService.updateById(detectElectrolyte);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("查询其他检测检验")
    @GetMapping("/getDetectOtherList")
    public BaseResult<PageResult<DetectOther>> getDetectOther(
        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        //设置当前页和页容量
        Page<DetectOther> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<DetectOther> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DetectOther::getPatientId, patientId);
        queryWrapper.orderByDesc(DetectOther::getDetectDate);
        Page<DetectOther> list = detectOtherService.page(page, queryWrapper);
        return DataResult.result(page, list.getRecords());
    }

    @ApiOperation("保存其他检验检测")
    @PostMapping("/saveDetectOther")
    public Result saveDetectOther(@RequestBody DetectOtherVO detectOtherVO) {
        DetectOther detectOther = dozenMapper.map(detectOtherVO, DetectOther.class);
        try {
            detectOtherService.save(detectOther);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("修改其他检测检验")
    @PutMapping("/updateDetectOther")
    public Result updateDetectOther(@RequestBody DetectOtherVO detectOtherVO) {
        DetectOther detectOther = dozenMapper.map(detectOtherVO, DetectOther.class);
        try {
            detectOtherService.updateById(detectOther);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ok();
    }

    @ApiOperation("获取总曲线图")
    @ApiImplicitParams({@ApiImplicitParam(name = "startDate", value = "开始时间", dataType = "String", paramType = "query"),
        @ApiImplicitParam(name = "endDate", value = "结束时间", dataType = "String", paramType = "query")})
    @GetMapping("/getAllGraph")
    public Result getAllGraph(String startDate, String endDate,
        @ApiParam(value = "患者id") @RequestParam Integer patientId) {
        Map<String, Object> data = new HashMap<>();
        List<DetectBloodPressure> detectBloodPressureList =
            detectBloodPressureService.list((Wrapper<DetectBloodPressure>)getQueryDate(startDate, endDate, patientId));
        List<DetectHeartRate> detectHeartRateList =
            detectHeartRateService.list((Wrapper<DetectHeartRate>)getQueryDate(startDate, endDate, patientId));
        data.put("detectBloodPressureList", detectBloodPressureList);
        data.put("detectHeartRateList", detectHeartRateList);
        return Result.ok().data(data);
    }

    /**
     * 总曲线图的筛选
     *
     * @param startDate
     * @param endDate
     * @return
     */
    private QueryWrapper<?> getQueryDate(String startDate, String endDate, Integer patientId) {
        return new QueryWrapper<>().eq("patient_id", patientId).apply(StrUtil.isNotBlank(startDate),
            "date_format (detect_date,'%Y-%m-%d') >= date_format('" + startDate + "','%Y-%m-%d')")
            .apply(StrUtil.isNotBlank(endDate),
                "date_format (detect_date,'%Y-%m-%d') <= date_format('" + endDate + "','%Y-%m-%d')");
    }

}

