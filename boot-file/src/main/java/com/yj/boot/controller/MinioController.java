package com.yj.boot.controller;

import com.yj.boot.utils.MinioTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/14
 */
@RestController
public class MinioController {
    @Resource
    private MinioTemplate minIoTemplate;

    @PostMapping("/create/bucket")
    String create(String bucketName) {
        try {
            minIoTemplate.makeBucket(bucketName);
        } catch (Exception e) {
            return "创建失败";
        }
        return "创建成功";
    }

    @PostMapping("/put/object")
    String putObject(MultipartFile uploadFile, @RequestParam String bucketName) {
        String originalFilename = uploadFile.getOriginalFilename();
        try {
            minIoTemplate.putObject(bucketName, originalFilename, uploadFile.getInputStream());
            System.out.println("bucketName:" + bucketName + " " + "文件名：" + originalFilename);
        } catch (Exception e) {
            System.out.println(e);
            return "创建失败";
        }

        return "http://120.78.125.171:9000/" + bucketName + "/" + originalFilename;

    }
}
