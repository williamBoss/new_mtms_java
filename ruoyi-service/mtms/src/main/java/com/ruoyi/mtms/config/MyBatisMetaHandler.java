package com.ruoyi.mtms.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.utils.ServletUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author KING
 * @version V1.0
 * @Title: MetaHandler
 * @Package com.ruoyi.mtms.config
 * @Description: mybatis自动填充(这里用一句话描述这个类的作用)
 * @date 2020/5/30 13:26
 */
@Component
public class MyBatisMetaHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.fillStrategy(metaObject, "delFlag", false);
        this.fillStrategy(metaObject, "createTime", LocalDateTime.now());
        String userId = ServletUtils.getRequest().getHeader(Constants.CURRENT_ID);
        this.fillStrategy(metaObject, "createBy", userId);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.fillStrategy(metaObject, "updateTime", LocalDateTime.now());
        String userId = ServletUtils.getRequest().getHeader(Constants.CURRENT_ID);
        this.fillStrategy(metaObject, "updateBy", userId);
    }

}
