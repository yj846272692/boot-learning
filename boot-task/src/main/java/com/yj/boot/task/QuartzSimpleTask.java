package com.yj.boot.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/12
 */
public class QuartzSimpleTask extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
//        System.out.println("quartz简单的定时任务执行时间：" + new Date());
    }
}
