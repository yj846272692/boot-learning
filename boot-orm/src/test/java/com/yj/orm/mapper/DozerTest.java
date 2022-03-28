package com.yj.orm.mapper;


import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.yj.orm.dozer.TestA;
import com.yj.orm.dozer.TestB;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @program: boot-learning-new
 * @description:
 * @author: ShenTF
 * @create: 2022-03-28 11:04:47
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
public class DozerTest {
    @Test
    void dozerTest3() {
        Mapper mapper = DozerBeanMapperBuilder.create().withMappingFiles("dozer/dozer-mapping.xml").build();
        TestA testA = new TestA("Stf","2022-03-28 11:08:15");
        log.info(String.valueOf(mapper.map(testA, TestB.class)));
    }
}
