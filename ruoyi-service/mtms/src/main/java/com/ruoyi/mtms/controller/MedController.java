package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.constant.ResponseConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.BaseResult;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.mtms.domain.MedicineInfo;
import com.ruoyi.mtms.service.MedicineInfoService;
import com.ruoyi.mtms.vo.MedicineInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: DiseaseController
 * @Package com.ruoyi.mtms.controller
 * @Description: 药品(这里用一句话描述这个类的作用)
 * @date 2020/5/26 17:49
 */
@RestController
@RequestMapping("/med")
@Api("药品管理")
@Slf4j
public class MedController extends BaseController {

    @Autowired
    private MedicineInfoService medicineInfoService;

    @Autowired
    private Mapper dozerMapper;

    @GetMapping("/")
    @ApiOperation(value = "药品列表", notes = "查询药品列表")
    public R list(MedicineInfoVO medicineInfoVO, @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        LambdaQueryWrapper<MedicineInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(MedicineInfo::getMedId, MedicineInfo::getMedName, MedicineInfo::getMedSpec,
            MedicineInfo::getMedType, MedicineInfo::getVendor, MedicineInfo::getPackageUnit, MedicineInfo::getUseUnit,
            MedicineInfo::getIndication, MedicineInfo::getUsageStandard, MedicineInfo::getUntowardEffect,
            MedicineInfo::getTaboo, MedicineInfo::getCaution, MedicineInfo::getStorageMethod);
        if (StringUtils.isNotEmpty(medicineInfoVO.getMedName())) {
            queryWrapper.like(MedicineInfo::getMedName, medicineInfoVO.getMedName());
        }
        //设置当前页和页容量
        Page<MedicineInfo> page = new Page<>(pageNo, pageSize);
        Page<MedicineInfo> list = medicineInfoService.page(page, queryWrapper);
        List<MedicineInfoVO> medicineInfoVOList = new ArrayList<>();
        list.getRecords().forEach(item -> {
            medicineInfoVOList.add(dozerMapper.map(item, MedicineInfoVO.class));
        });
        return result(pageNo, list, medicineInfoVOList);
    }

    @PostMapping("/")
    @ApiOperation(value = "新增药品")
    public R add(@RequestBody MedicineInfoVO medicineInfoVO) {
        try {
            MedicineInfo medicineInfo = dozerMapper.map(medicineInfoVO, MedicineInfo.class);
            medicineInfoService.save(medicineInfo);
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "添加成功！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return R.error();
        }
    }

    @GetMapping(value = "/allMed")
    @ApiOperation(value = "获取所有药品")
    public BaseResult<List<MedicineInfoVO>> queryAllMed() {
        List<MedicineInfo> list = medicineInfoService.list();
        List<MedicineInfoVO> medicineInfoVOList = new ArrayList<>();
        list.forEach(item -> {
            medicineInfoVOList.add(dozerMapper.map(item, MedicineInfoVO.class));
        });
        return BaseResult.<List<MedicineInfoVO>>success().data(medicineInfoVOList);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "根据id获取药品")
    public R queryById(@PathVariable Integer id) {
        LambdaQueryWrapper<MedicineInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(MedicineInfo::getDelFlag, 0).eq(MedicineInfo::getMedId, id);
        MedicineInfo medicineInfo = medicineInfoService.getOne(queryWrapper);
        if (medicineInfo == null) {
            return R.error();
        } else {
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "获取成功", medicineInfo);
        }
    }

    @PutMapping(value = "/{id}")
    @ApiOperation(value = "修改药品")
    public R edit(@PathVariable Integer id, @RequestBody MedicineInfoVO medicineInfoVO) {
        try {
            MedicineInfo medicineInfo = dozerMapper.map(medicineInfoVO, MedicineInfo.class);
            medicineInfo.setMedId(id);
            medicineInfoService.updateById(medicineInfo);
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "修改成功！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return R.error();
        }
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "删除药品")
    public R delete(@PathVariable Integer id) {
        medicineInfoService.removeById(id);
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "删除药品成功");
    }

    @DeleteMapping(value = "/deleteBatch/{ids}")
    @ApiOperation(value = "批量删除药品")
    public R deleteBatch(@PathVariable String[] ids) {
        medicineInfoService.removeByIds(Arrays.asList(ids));
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "批量删除药品成功");
    }

}
