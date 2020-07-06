package com.ruoyi.mtms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.mtms.domain.Disease;
import com.ruoyi.mtms.vo.DiseaseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author KING
 * @version V1.0
 * @Title: DiseaseMapper
 * @Package com.ruoyi.mtms.mapper
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 2020/5/26 11:06
 */
public interface DiseaseMapper extends BaseMapper<Disease> {

    /**
     * 根据评估id查询病种诊断名称
     *
     * @param assessmentId
     * @return
     */
    List<DiseaseVO> getDiseaseVoList(@Param("assessmentId") Integer assessmentId);

}