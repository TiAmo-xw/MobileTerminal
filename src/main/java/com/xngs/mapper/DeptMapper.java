package com.xngs.mapper;

import com.xngs.pojo.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Short deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Short deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}