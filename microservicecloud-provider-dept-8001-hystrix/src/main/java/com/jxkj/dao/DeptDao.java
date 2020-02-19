package com.jxkj.dao;

import com.jxkj.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 14:48
 * @description
 */
@Mapper
public interface DeptDao {
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