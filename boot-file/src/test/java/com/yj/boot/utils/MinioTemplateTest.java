package com.yj.boot.utils;

import io.minio.ObjectWriteResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class MinioTemplateTest {
    @Resource
    private MinioTemplate minioTemplate;


    //创建bucket
    @Test
    void testCreateBucket() throws Exception {
        minioTemplate.makeBucket("yj-test");
    }

    //上传文件对象
    @Test
    void testPutObject() throws Exception {
        ObjectWriteResponse response = minioTemplate.putObject("yj-test","img/my.jpg","E:\\风景\\1.jpg"
                );
        System.out.println(response.object());
    }

    //删除文件对象
    @Test
    void testDeleteObject() throws Exception {
        minioTemplate.removeObject("yj-test","img/my.jpg");
    }

}