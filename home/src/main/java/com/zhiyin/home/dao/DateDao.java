package com.zhiyin.home.dao;


import java.util.List;

import com.zhiyin.home.model.Date;

/**
 * 测试
 * 
 * @author zkl
 *
 */
public interface DateDao{

	List<Date> selectAll();

	Date selectOne(Integer id);

	Date insert(Date date);

}