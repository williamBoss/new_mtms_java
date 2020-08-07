package com.ruoyi.common.log.event;

import com.ruoyi.system.domain.SysLogininfor;
import org.springframework.context.ApplicationEvent;

/**
 * 系统日志事件
 */
public class SysLogininforEvent extends ApplicationEvent {

    private static final long serialVersionUID = -9084676463718966036L;

    public SysLogininforEvent(SysLogininfor source) {
        super(source);
    }

}