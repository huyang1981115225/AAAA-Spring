package cn.tedu.spring.annotation.dao;

import org.springframework.stereotype.Component;

@Component("userDaoImpl")
public class UserDaoImpl implements IUserDao {

	public void insert() {
		System.out.println("UserDaoImpl->insert()");
	}

}
