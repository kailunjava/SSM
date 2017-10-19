package com.zhiyin.home;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyin.home.model.Date;
import com.zhiyin.home.service.DateService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class RedisTest
{
    private static final Logger logger = LoggerFactory.getLogger(RedisTest.class);    

    @Autowired
    private  DateService service;

    /*
     * 二级缓存测试
     */
    @Test
    public void testCache2() {
        List<Date> list = service.getDates();
        logger.info(list.get(1).getName());

        List<Date> list2 = service.getDates();
        logger.info(list2.get(1).getName());

        List<Date> list3 = service.getDates();
        logger.info(list3.get(1).getName());
    }   

}

