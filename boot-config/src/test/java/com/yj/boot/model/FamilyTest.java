package com.yj.boot.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;




/**
 * JUnit5 测试
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FamilyTest {

    @Autowired
    private Family family;

    @Test
    void printFamily() {
        System.out.println(family);
    }
}