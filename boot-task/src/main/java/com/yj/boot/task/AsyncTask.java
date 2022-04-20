package com.yj.boot.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/12
 */
@Component
public class AsyncTask extends AbstractTask {
    @Override
    /**
     *   同步变成异步
     */
    @Async
    public void doTaskOne() throws Exception {
        super.doTaskOne();
    }

    @Override

    @Async
    public void doTaskTwo() throws Exception {
        super.doTaskTwo();
    }

    @Override

    @Async
    public void doTaskThree() throws Exception {
        super.doTaskThree();
    }
}
