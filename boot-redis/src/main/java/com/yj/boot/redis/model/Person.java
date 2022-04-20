package com.yj.boot.redis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("person")
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 4113825891734996582L;

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private Address address;

}