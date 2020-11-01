package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: geek
 * @Date: 2020/10/31 22:33
 * @Description:
 */
@Data
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private List<Student> studentList;
}
