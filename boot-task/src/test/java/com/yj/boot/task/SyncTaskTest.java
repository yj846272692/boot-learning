package com.yj.boot.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;


/**
 * 同步任务测试
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class SyncTaskTest {
    @Resource
    private SyncTask syncTask;


    @Test
    public void testSyncTasks() throws Exception {
        syncTask.doTaskOne();
        syncTask.doTaskTwo();
        syncTask.doTaskThree();

    }

}