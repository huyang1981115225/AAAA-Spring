package cn.tedu.spring.constructor.dao;

import cn.tedu.spring.constructor.bean.User;

public class UserDaoImpl implements IUserDao {

	public void insert(User user) {
		System.out.println("UserDaoImpl.insert()->" + user);

	}

}
