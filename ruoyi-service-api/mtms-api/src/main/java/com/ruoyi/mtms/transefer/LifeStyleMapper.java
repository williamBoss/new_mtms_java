package com.ruoyi.mtms.transefer;

import com.ruoyi.mtms.domain.Lifestyle;
import com.ruoyi.mtms.vo.LifestyleVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author KING
 * @version V1.0
 * @date 2020/8/30 22:42
 */
@Mapper
@Component
public interface LifeStyleMapper {

    Lifestyle lifeStyleVOToLifestyle(LifestyleVO lifestyleVO);

}
