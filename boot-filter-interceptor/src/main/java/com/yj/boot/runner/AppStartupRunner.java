package com.yj.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/4
 */
@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args)  {
        log.info("ApplicationRunner参数名称：{}", args.getOptionNames());
        log.info("ApplicationRunner参数名称{}", args.getOptionValues("age"));
        log.info("ApplicationRunner参数名称{}", Arrays.toString(args.getSourceArgs()));
    }
}
