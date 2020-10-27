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
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        List<DeptEntity> list = mapper.list();
        list.forEach(System.out::println);
        sqlSession.close();
    }
}
