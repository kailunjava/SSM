package com.zhiyin.home.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhiyin.home.dao.DynastyDao;
import com.zhiyin.home.model.Dynasty;
import com.zhiyin.home.service.DynastyService;

/**
 * 测试
 * 
 * @author zkl
 *
 */
@Service("DynastyService")
@Transactional
public class DynastyServiceImpl implements DynastyService {
	@Autowired
	private DynastyDao dynastyDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dynastyDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Dynasty record) {
		// TODO Auto-generated method stub
		return dynastyDao.insert(record);
	}

	@Override
	public int insertSelective(Dynasty record) {
		// TODO Auto-generated method stub
		return dynastyDao.insertSelective(record);
	}

	@Override
	public Dynasty selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dynastyDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Dynasty record) {
		// TODO Auto-generated method stub
		return dynastyDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Dynasty record) {
		// TODO Auto-generated method stub
		return dynastyDao.updateByPrimaryKey(record);
	}

}