package cn.tedu.spring.constructor.service;

import cn.tedu.spring.constructor.bean.User;
import cn.tedu.spring.constructor.dao.IUserDao;

public class UserService {
	private IUserDao dao;

	public UserService(IUserDao dao) {
		System.out.println("UserService()");
		this.dao = dao;
	}

	public void reg(User user) {
		System.out.println("UserService.reg()->" + user);
		dao.insert(user);
	}

}
