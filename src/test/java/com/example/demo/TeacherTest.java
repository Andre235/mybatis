package com.example.demo;

import com.example.demo.dao.TeacherDao;
import com.example.demo.entity.Teacher;
import com.example.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: geek
 * @Date: 2020/10/31 17:03
 * @Description:
 */
@SpringBootTest
public class TeacherTest {

    private SqlSession sqlSession = null;
    private TeacherDao teacherDao = null;

    @BeforeEach
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        teacherDao = sqlSession.getMapper(TeacherDao.class);
    }

    @AfterEach
    public void after(){
        sqlSession.close();
    }

    @Test
    public void findTeacherById(){
        Teacher teacher = teacherDao.findTeacherById(1);
        System.out.println(teacher);
    }

}
