package com.example.demo.dao;

import com.example.demo.entity.DeptEntity;

import java.util.List;

/**
 * @Author: geek
 * @Date: 2020/10/27 22:27
 * @Description:
 */
public interface DeptDao {

    /**
     * @return 查找所有的部门
     */
    List<DeptEntity> list();

    /**
     * @param id 部门id
     * @return 部门
     */
    DeptEntity getById(Integer id);

    /**
     * 插入部门数据
     * @param deptEntity 部门信息
     */
    void addDept(DeptEntity deptEntity);

    /**
     * 更新
     * @param deptEntity 部门
     */
    void update(DeptEntity deptEntity);

    /**
     * 删除
     * @param id 部门id
     */
    void deleteById(Integer id);
}
