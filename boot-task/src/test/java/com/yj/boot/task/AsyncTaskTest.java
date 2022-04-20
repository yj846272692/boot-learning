package com.yj.boot.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * 异步任务测试
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AsyncTaskTest {

    @Resource
    private AsyncTask asyncTask;

    @Test
    public void testAsyncTasks() throws Exception {
        asyncTask.doTaskOne();
        asyncTask.doTaskTwo();
        asyncTask.doTaskThree();
        System.out.println("Other Task···");
    }
}