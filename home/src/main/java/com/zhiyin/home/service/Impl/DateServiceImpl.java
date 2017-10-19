package com.zhiyin.home.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhiyin.home.dao.DateDao;
import com.zhiyin.home.model.Date;
import com.zhiyin.home.service.DateService;

/**
 * 测试
 * 
 * @author zkl
 *
 */
@Service("DateService")
@Transactional
public class DateServiceImpl implements DateService {
	@Autowired
	private DateDao dateMapper;

	public List<Date> getDates() {
		List<Date> dateList = dateMapper.selectAll();
		return dateList;
	}

	@Override
	public Date getDate(Integer id) {
		// TODO Auto-generated method stub
		return dateMapper.selectOne(id);
	}

}