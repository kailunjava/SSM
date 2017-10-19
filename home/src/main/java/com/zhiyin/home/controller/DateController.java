package com.zhiyin.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyin.home.model.Date;
import com.zhiyin.home.service.DateService;

/**
 * 测试
 * 
 * @author zkl
 *
 */
@Controller
@RequestMapping("/date")
public class DateController {
	@Autowired
	private DateService dateService;

	@RequestMapping("/showDates")
	public @ResponseBody Object showUserInfo() {
		List<Date> dateList = dateService.getDates();

		return dateList;
	}

	@RequestMapping("/showDate")
	public @ResponseBody Object showDate() {
		Date date = dateService.getDate(2);

		return date;
	}
}
