package com.example.demo;

import com.example.demo.dao.DeptDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.entity.StudentEntity;
import com.example.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: geek
 * @Date: 2020/10/31 17:03
 * @Description:
 */
@SpringBootTest
public class StudentTest {

    private SqlSession sqlSession = null;
    private StudentDao studentDao = null;

    @BeforeEach
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        studentDao = sqlSession.getMapper(StudentDao.class);
    }

    @AfterEach
    public void after(){
        sqlSession.close();
    }

    @Test
    public void findByIdTest(){
        List<StudentEntity> studentList = studentDao.findAll();
        studentList.forEach(System.out::println);
    }
}
