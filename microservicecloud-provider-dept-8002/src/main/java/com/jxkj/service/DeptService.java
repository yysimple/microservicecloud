package com.jxkj.service;

import com.jxkj.entity.Dept;

import java.util.List;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public interface DeptService {

    /**
     * 功能描述: 添加一个部门
     *
     * @param dept
     * @return boolean
     * @Author wcx
     **/
    boolean addDept(Dept dept);

    /**
     * 功能描述: 通过部门编号查找到一个部门
     *
     * @param deptNo
     * @return com.jxkj.entity.Dept
     * @Author wcx
     **/
    Dept findById(Long deptNo);

    /**
     * 功能描述: 查找所有的部门
     *
     * @param
     * @return java.util.List<com.jxkj.entity.Dept>
     * @Author wcx
     **/
    List<Dept> findAll();
}
