package com.yj.boot.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/15
 */
@Configuration
@Endpoint(id = "customEndpoint")
public class CustomEndpoint {
    @ReadOperation
    public ShopData getData() {
        return new ShopData("YG.", "江苏南京");
    }

    @Data
    @AllArgsConstructor
    public static class ShopData {
        private String name;
        private String address;
    }
}
