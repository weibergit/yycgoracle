package yycg.base.dao.mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import yycg.base.pojo.po.User;

public class testbase {
	
	UserMapper userMapper;
	ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {
			"spring/applicationContext.xml", "spring/applicationContext-base-dao.xml"

	});
	
	@Test
	//根据主键查询用户信息
	public void testSelectByPrimaryKey() {
		userMapper = (UserMapper) ac.getBean("userMapper");
		//System.out.println(userMapper);
		User user =  userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
}
