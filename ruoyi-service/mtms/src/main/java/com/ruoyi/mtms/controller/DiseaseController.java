package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.constant.ResponseConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.mtms.domain.Disease;
import com.ruoyi.mtms.service.DiseaseService;
import com.ruoyi.mtms.vo.DiseaseVO;
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
 * @Description: 病种(这里用一句话描述这个类的作用)
 * @date 2020/5/26 17:49
 */
@RestController
@RequestMapping("/disease")
@Api("病种管理")
@Slf4j
public class DiseaseController extends BaseController {

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private Mapper dozerMapper;

    @GetMapping("/")
    @ApiOperation(value = "病种列表", notes = "查询病种列表")
    public R list(DiseaseVO disease, @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNo,
        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        LambdaQueryWrapper<Disease> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(Disease::getDiseaseId, Disease::getDiseaseName, Disease::getDiseaseKey);
        if (StringUtils.isNotEmpty(disease.getDiseaseName())) {
            queryWrapper.like(Disease::getDiseaseName, disease.getDiseaseName());
        }
        if (StringUtils.isNotEmpty(disease.getDiseaseKey())) {
            queryWrapper.like(Disease::getDiseaseKey, disease.getDiseaseKey());
        }
        queryWrapper.eq(Disease::getDelFlag, 0);
        //设置当前页和页容量
        Page<Disease> page = new Page<>(pageNo, pageSize);
        Page<Disease> list = diseaseService.page(page, queryWrapper);
        List<DiseaseVO> diseaseVOList = new ArrayList<>();
        list.getRecords().forEach(item -> {
            diseaseVOList.add(dozerMapper.map(item, DiseaseVO.class));
        });
        return result(pageNo, list, diseaseVOList);
    }

    @PostMapping("/")
    @ApiOperation(value = "新增病种")
    public R add(@RequestBody DiseaseVO diseaseVO) {
        try {
            Disease disease = dozerMapper.map(diseaseVO, Disease.class);
            diseaseService.save(disease);
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "添加成功！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return R.error();
        }
    }

    @GetMapping(value = "/allDisease")
    @ApiOperation(value = "获取所有病种")
    public R queryAllDisease() {
        List<Disease> list = diseaseService.list();
        List<DiseaseVO> diseaseVOList = new ArrayList<>();
        list.forEach(item -> {
            diseaseVOList.add(dozerMapper.map(item, DiseaseVO.class));
        });
        return R.data(diseaseVOList);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "根据id获取病种")
    public R queryById(@PathVariable Integer id) {
        LambdaQueryWrapper<Disease> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Disease::getDelFlag, 0).eq(Disease::getDiseaseId, id);
        Disease disease = diseaseService.getOne(queryWrapper);
        if (disease == null) {
            return R.error();
        } else {
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "获取成功", disease);
        }
    }

    @PutMapping(value = "/{id}")
    @ApiOperation(value = "修改病种")
    public R edit(@PathVariable Integer id, @RequestBody DiseaseVO diseaseVO) {
        try {
            Disease disease = dozerMapper.map(diseaseVO, Disease.class);
            disease.setDiseaseId(id);
            diseaseService.updateById(disease);
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "修改成功！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return R.error();
        }
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "删除病种")
    public R delete(@PathVariable Integer id) {
        diseaseService.removeById(id);
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "删除病种成功");
    }

    @DeleteMapping(value = "/deleteBatch/{ids}")
    @ApiOperation(value = "批量删除病种")
    public R deleteBatch(@PathVariable String[] ids) {
        diseaseService.removeByIds(Arrays.asList(ids));
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "批量删除病种成功");
    }

}
