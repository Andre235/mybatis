package com.example.demo.dao;

import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: geek
 * @Date: 2020/10/31 16:59
 * @Description:
 */
public interface TeacherDao {

    Teacher findTeacherById(@Param("tid") Integer tid);
}
