package com.example.demo.dao;

import com.example.demo.entity.StudentEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: geek
 * @Date: 2020/10/31 16:58
 * @Description:
 */
public interface StudentDao {

    List<StudentEntity> findAll();
}
