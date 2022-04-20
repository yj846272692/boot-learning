package com.yj.boot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/12
 */
@Component
public class ScheduledJobs {
//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayJob() {
//        System.out.println("fixedDelay 开始：" + new Date());
//        try {
//            Thread.sleep(10 * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("fixedDelay 结束：" + new Date());
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void fixedRateJob() {
//        System.out.println("fixedDelay 开始：" + new Date());
//        try {
//            Thread.sleep(1 * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("fixedDelay 结束：" + new Date());
//    }
//
//    @Scheduled(cron = "0/10 * * * * ? ")
//    public void cronJob() {
//        System.out.println("==================== ...>>cron:" + new Date());
//    }
}
