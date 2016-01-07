package yycg.base.service;

import yycg.base.pojo.po.Sysuser;

public interface UserService {
	
	//根据用户id查询用户信息
	public Sysuser findSysuserById(String id) throws Exception;
}
