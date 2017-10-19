package com.zhiyin.home.service;


import com.zhiyin.home.model.Dynasty;

/**
 * 测试
 * 
 * @author zkl
 *
 */
public interface DynastyService {

	int deleteByPrimaryKey(Integer id);

    int insert(Dynasty record);

    int insertSelective(Dynasty record);

    Dynasty selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dynasty record);

    int updateByPrimaryKey(Dynasty record);


}