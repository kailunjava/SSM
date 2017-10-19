package com.zhiyin.home.service;

import java.util.List;

import com.zhiyin.home.model.Date;

/**
 * 测试
 * 
 * @author zkl
 *
 */
public interface DateService {

	List<Date> getDates();

	Date getDate(Integer id);


}