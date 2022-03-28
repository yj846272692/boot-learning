package com.yj.orm.mapper;

import com.yj.orm.domain.Teacher;
import com.yj.orm.mapper.TeacherMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @program: boot-learning-new
 * @description:
 * @author: ShenTF
 * @create: 2022-03-28 12:48:08
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void findOneByOne() {
        Teacher teacher = teacherMapper.findOneByOne(1);
        System.out.println(teacher);
    }
}
