package com.zhiyin.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyin.home.model.Dynasty;
import com.zhiyin.home.service.DynastyService;

/**
 * 测试
 * 
 * @author zkl
 *
 */
@Controller
@RequestMapping("/dynasty")
public class DynastyController {
	@Autowired
	private DynastyService dynastyService;
	
	@RequestMapping("/showDynasty")
	public @ResponseBody Dynasty selectByPrimaryKey(@RequestParam(value="id",required=true) Integer id){
		Dynasty dynasty = dynastyService.selectByPrimaryKey(id);
		return dynasty;		
	}
	
}
