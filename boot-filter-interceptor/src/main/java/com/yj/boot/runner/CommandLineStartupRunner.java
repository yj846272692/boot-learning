package com.yj.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/4
 */
@Slf4j
@Component
public class CommandLineStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("CommandLineStartupRunner传入参数：{}", Arrays.toString(args));
    }
}
