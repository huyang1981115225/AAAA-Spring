package cn.tedu.spring.annotation2.dao;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements IUserDao {

	public void insert() {
		System.out.println("UserDaoImpl->insert()");
	}

}
