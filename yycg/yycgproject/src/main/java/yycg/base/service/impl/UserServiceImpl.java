package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.UserMapper;
import yycg.base.pojo.po.User;
import yycg.base.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User findUserByUserid(int userId) throws Exception {
		return userMapper.selectByPrimaryKey(userId);	
	}

}
