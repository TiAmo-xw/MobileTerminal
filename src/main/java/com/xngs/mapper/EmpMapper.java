package com.xngs.mapper;

import com.xngs.pojo.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(Short empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Short empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}