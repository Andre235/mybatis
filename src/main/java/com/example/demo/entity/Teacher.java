package com.example.demo.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: geek
 * @Date: 2020/10/31 22:33
 * @Description:
 */
@Data
public class Teacher {
    private Integer id;
    private String name;
    private List<Student> studentList;
}
