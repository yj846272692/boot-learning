package com.yj.boot.redis;

import com.yj.boot.redis.model.Address;
import com.yj.boot.redis.model.Person;
import com.yj.boot.redis.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/17
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
public class RedisTest2 {
    @Resource
    private PersonRepository personRepository;

    @Test
    public void testRedisRepository() {
        Person person = Person.builder().id(1).firstName("杨").lastName("晶").address(new Address("中国", "南京")).build();
        personRepository.save(person);
        Optional<Person> op = personRepository.findById(person.getId());
        op.ifPresent(value -> log.info(String.valueOf(value)));
        log.info(String.valueOf(personRepository.count()));
//        personRepository.delete(person);
    }
}

