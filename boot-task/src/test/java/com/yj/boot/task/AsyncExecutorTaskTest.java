package com.yj.boot.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static java.lang.Thread.sleep;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class AsyncExecutorTaskTest {
    @Resource
    private AsyncExecutorTask asyncExecutorTask;

    @Test
    public void testAsyncExecutorTask() throws Exception {
        asyncExecutorTask.doTaskOneCallback();
        asyncExecutorTask.doTaskTwoCallback();
        asyncExecutorTask.doTaskThreeCallback();
        sleep(30 * 1000L);
    }

}