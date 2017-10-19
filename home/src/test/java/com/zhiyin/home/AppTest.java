package com.zhiyin.home;



/*import org.apache.log4j.Logger;*/
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyin.home.dao.DateDao;
import com.zhiyin.home.dao.DynastyDao;
import com.zhiyin.home.service.DateService;



@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" })  
public class AppTest {
	/*private static final Logger LOGGER = Logger.getLogger(AppTest.class);*/
	@Autowired
	private DateService dService;
	@Autowired
	private DateDao dateMapper;
	
	//private BaseDaoImpl<Date, Integer> baseDao = new BaseDaoImpl<Date, Integer>();
	/*private BaseDao<Date, Integer> baseDao;*/
	@Autowired
	private DynastyDao dynastydao;
	/*@Autowired
	private BaseDao basedao;*/
	@Test
	public void testQueryById2() {
		//Date date = dateMapper.selectAll(1);
		//List<Date> list1 =  dateMapper.selectAll();
		//System.out.println(list1);
		/*dynasty_man d = new dynasty_man();
		d.setCode("0001");
		d.setName("你猜猜");
		d.setCreater("123");
		dynasty_man.insertSelective(d);*/
		
		/*Date date = baseDao.selectOne(1);*/
		/*System.out.println(baseDao.selectAll());*/
		System.out.println(dynastydao.selectByPrimaryKey(2).toString());
	}
}
