package com.yj.orm.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yj.orm.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.stubbing.Stubber;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
@ExtendWith({SpringExtension.class})
@Slf4j
class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;


    @Test
    void findManyByOne() {
        Student student = studentMapper.findManyByOne(1001);
        log.info("学生信息：" + student.getStudentId() + " " + student.getStudentName() + " " + student.getHometown() + " " + student.getBirthday());
        log.info("学生所在信息：" + student.getClazz().getClazzId() + "   " + student.getClazz().getClazzName());
    }


    @Test
    void getStudent() {
        Student student = studentMapper.getStudent(1001);
        log.info(String.valueOf(student));
    }


    @Test
    void insert() {
        Student student = new Student();
        student.setBirthday(new Date());
        student.setClazzId(1);
        student.setHometown("测试");
        student.setStudentName("测试");
        studentMapper.insert(student);
    }

    @Test
    void batchInsert() {
        long begin = System.currentTimeMillis();
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Student student = new Student();
            student.setClazzId(1);
            student.setStudentName("测试学生" + i);
            student.setHometown("江苏南京");
            student.setBirthday(new Date());
            students.add(student);
        }
        int count = studentMapper.batchInsert(students);
        log.info(String.valueOf(count));
        long end = System.currentTimeMillis();
        long period = end - begin;
        System.out.println(period);


    }

    @Test
    void batchDelete() {
        List<Integer> ids = Arrays.asList(3027, 3028, 3029);
        int rows = studentMapper.batchDelete(ids);
        log.info(rows + "行数据被删除");
    }

    @Test
    void batchUpdate() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            Student student = new Student();
            student.setStudentId(3020 + i);
            student.setStudentName("新名字"+ i);
            students.add(student);
        }
        int n =  studentMapper.batchUpdate(students);
        log.info(String.valueOf(n));
    }

    @Test
    void  findBy(){
        Student student = new Student();
        student.setHometown("州");
        List<Student> students = studentMapper.findStudentBy(student);
        log.info(String.valueOf(students.size()));
        students.forEach(student1 -> log.info(String.valueOf(student1)));
    }

    @Test
    void testPage(){
        PageHelper.startPage(1,2);
        List<Student> students = studentMapper.findStudentBy(new Student());
        PageInfo<Student> page = PageInfo.of(students);
        log.info(String.valueOf(page));
    }
}