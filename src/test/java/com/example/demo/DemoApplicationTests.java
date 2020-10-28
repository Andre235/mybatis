package com.example.demo;

import com.example.demo.dao.DeptDao;
import com.example.demo.entity.DeptEntity;
import com.example.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void getAllTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        List<DeptEntity> list = mapper.list();
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void getByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);
        DeptEntity entity = deptDao.getById(1);
        System.out.println(entity);
        sqlSession.close();
    }

    @Test
    public void addDeptTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        List<DeptEntity> list = mapper.list();
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void updateTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        List<DeptEntity> list = mapper.list();
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void deleteByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        List<DeptEntity> list = mapper.list();
        list.forEach(System.out::println);
        sqlSession.close();
    }


}
