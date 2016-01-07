package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.SysuserMapper;
import yycg.base.pojo.po.Sysuser;
import yycg.base.service.UserService;

public class UserServiceImpl implements UserService{

	//注入 mapper
	@Autowired
	private SysuserMapper sysuserMapper;
	
	@Override
	public Sysuser findSysuserById(String id) throws Exception {
		//调用mapper查询用户信息
		return sysuserMapper.selectByPrimaryKey(id);

	}

}
