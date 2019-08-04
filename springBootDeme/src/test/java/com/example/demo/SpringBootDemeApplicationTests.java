package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemeApplicationTests {

    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Test
    public void contextLoads() {
        int id  = 1;
        String a = "1";

        Object o = redisTemplate.opsForValue().get(a);
        if(o == null){
            Student student = studentService.selectByPrimaryKey(id);
            redisTemplate.opsForValue().set(a,student);
            System.out.println(student.toString());
        }

        System.out.println((Student)o);
        Student s = (Student) o;
        System.out.println(s.getId());
        System.out.println(s.getName());



    }

}
