package com.zhiyin.home.dao;

import com.zhiyin.home.model.Dynasty;

public interface DynastyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Dynasty record);

    int insertSelective(Dynasty record);

    Dynasty selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dynasty record);

    int updateByPrimaryKey(Dynasty record);
}