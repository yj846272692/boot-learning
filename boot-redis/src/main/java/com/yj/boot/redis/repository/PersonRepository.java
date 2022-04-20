package com.yj.boot.redis.repository;

import com.yj.boot.redis.model.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/17
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {

}

