package com.yj.boot;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import org.springframework.stereotype.Component;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/11
 */
@Component
public class SuperfluousLogFilter extends Filter<ILoggingEvent> {

    @Override
    public FilterReply decide(ILoggingEvent event) {
        System.out.println("eventLoggerName:" + event.getLoggerName());
        if (getPackName(event.getLoggerName()).startsWith("org.springblade.modules")) {
            return FilterReply.ACCEPT;
        } else {
            return FilterReply.DENY;
        }
    }

    public String getPackName(String className) {
        return className.substring(0, className.lastIndexOf("."));
    }
}