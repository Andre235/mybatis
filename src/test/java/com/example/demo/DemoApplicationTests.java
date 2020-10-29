package com.example.demo;

import com.example.demo.dao.DeptDao;
import com.example.demo.entity.DeptEntity;
import com.example.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    private SqlSession sqlSession = null;
    private DeptDao mapper = null;

    @BeforeEach
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(DeptDao.class);
    }

    @AfterEach
    public void after(){
        sqlSession.close();
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

    @Test
    public void createDeptByMapTest(){
        Map<String, Object> map = new HashMap<>(2);
        map.put("key",10);
        map.put("deptName","项目主管部门");
        Integer result = mapper.createDeptByMap(map);
        sqlSession.commit();
        if(result > 0){
            System.out.println("插入数据成功");
        }
    }

    @Test
    public void getListByDeptNameLike(){
        Map<String, Object> map = new HashMap<>(2);
        map.put("name","'%端%' or 1 = 1");
        List<DeptEntity> list = mapper.getListByDeptNameLike(map);
        list.forEach(System.out::println);
    }
}
