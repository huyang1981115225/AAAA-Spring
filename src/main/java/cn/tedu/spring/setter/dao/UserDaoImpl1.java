package cn.tedu.spring.setter.dao;

import cn.tedu.spring.setter.bean.User;

public class UserDaoImpl1 implements IUserDao {
	
public void insert(User user) {
	System.out.println("UserDaoImpl1.insert()->"+user);
}
}
