package com.ruoyi.mtms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ruoyi.common.constant.ResponseConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.mtms.domain.PatientInfo;
import com.ruoyi.mtms.domain.PatientTreatmentHistory;
import com.ruoyi.mtms.service.PatientInfoService;
import com.ruoyi.mtms.service.PatientTreatmentHistoryService;
import com.ruoyi.mtms.vo.PatientInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: PatientController
 * @Package com.ruoyi.mtms.controller
 * @Description: 患者(这里用一句话描述这个类的作用)
 * @date 2020/6/3 18:17
 */
@RestController
@RequestMapping("/patient")
@Api("患者信息")
@Slf4j
public class PatientController extends BaseController {

    @Autowired
    private PatientInfoService patientInfoService;

    @Autowired
    private PatientTreatmentHistoryService patientTreatmentHistoryService;

    @Autowired
    private Mapper dozerMapper;

    @GetMapping("/id/{patientId}")
    @ApiOperation(value = "获取患者信息", notes = "根据患者id获取患者信息")
    public R getPatientInfoById(@PathVariable Integer patientId) {
        LambdaQueryWrapper<PatientInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(PatientInfo::getPatientId, patientId);
        PatientInfo patientInfo = patientInfoService.getOne(queryWrapper);
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "获取成功", patientInfo);
    }

    @GetMapping("/phone/{phone}")
    @ApiOperation(value = "获取患者信息", notes = "根据手机号获取患者信息")
    public R getPatientInfoByPhone(@PathVariable String phone) {
        LambdaQueryWrapper<PatientInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(PatientInfo::getPhone, phone);
        PatientInfo patientInfo = patientInfoService.getOne(queryWrapper);
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "获取成功", patientInfo);
    }

    @GetMapping("/listByPhone")
    @ApiOperation(value = "获取患者信息list", notes = "根据手机号获取患者信息list")
    public R getPatientListByPhone(String phone) {
        LambdaQueryWrapper<PatientInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(PatientInfo::getPhone, phone);
        List<PatientInfo> list = patientInfoService.list(queryWrapper);
        return R.ok(ResponseConstants.RESPONSE_SUCCESS, "获取成功", list);
    }

    @PostMapping("/")
    @ApiOperation(value = "保存患者信息")
    public R savePatientInfo(@RequestBody PatientInfoVO patientInfoVO) {
        try {
            PatientInfo patientInfo = dozerMapper.map(patientInfoVO, PatientInfo.class);
            patientInfo.setDowntownAddress(StringUtils.join(patientInfoVO.getDowntownAddressArr(), ","));
            patientInfoService.save(patientInfo);
            saveTreatmentHistory(patientInfo);
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "添加成功！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return R.error();
        }
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改患者信息")
    public R updatePatientInfo(@PathVariable Integer id, @RequestBody PatientInfoVO patientInfoVO) {
        try {
            PatientInfo patientInfo = dozerMapper.map(patientInfoVO, PatientInfo.class);
            patientInfo.setDowntownAddress(StringUtils.join(patientInfoVO.getDowntownAddressArr(), ","));
            patientInfo.setPatientId(id);
            patientInfoService.updateById(patientInfo);
            saveTreatmentHistory(patientInfo);
            return R.ok(ResponseConstants.RESPONSE_SUCCESS, "修改成功！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return R.error();
        }
    }

    /**
     * 保存患者接诊历史记录
     *
     * @param patientInfo
     */
    private void saveTreatmentHistory(PatientInfo patientInfo) {
        PatientTreatmentHistory patientTreatmentHistory = new PatientTreatmentHistory();
        patientTreatmentHistory.setConsultationDate(patientInfo.getConsultationDate());
        patientTreatmentHistory.setEmergencyInfusionNum(patientInfo.getEmergencyInfusionNum());
        patientTreatmentHistory.setHospitalizationNum(patientInfo.getHospitalizationNum());
        patientTreatmentHistory.setPhysician(patientInfo.getPhysician());
        patientTreatmentHistory.setDepartment(patientInfo.getDepartment());
        patientTreatmentHistoryService.save(patientTreatmentHistory);
    }

}
