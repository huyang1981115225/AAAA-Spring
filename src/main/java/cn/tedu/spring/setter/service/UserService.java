package cn.tedu.spring.setter.service;

import cn.tedu.spring.setter.bean.User;
import cn.tedu.spring.setter.dao.IUserDao;

public class UserService {
	private IUserDao dao ;
	
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	public void reg(User user) {
		System.out.println("UserService.reg()->"+user);
		dao.insert(user);
	}
}
