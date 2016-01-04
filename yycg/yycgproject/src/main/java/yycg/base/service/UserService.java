package yycg.base.service;

import java.util.List;

import yycg.base.pojo.po.User;

public interface UserService {
	
	
		// 根据用户账号查询用户信息
		public User findUserByUserid(int userId) throws Exception;

}
