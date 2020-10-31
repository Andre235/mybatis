package com.example.demo.entity;

import lombok.Data;

/**
 * @Author: geek
 * @Date: 2020/10/31 16:59
 * @Description:
 */
@Data
public class StudentEntity {
    private Integer id;
    private String name;
    private TeacherEntity teacher;
}
