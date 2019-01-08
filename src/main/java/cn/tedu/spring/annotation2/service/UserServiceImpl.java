package cn.tedu.spring.annotation2.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.tedu.spring.annotation2.dao.IUserDao;


@Component("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource(name="userDao")
	private IUserDao userdao;

	public void reg() {
		System.out.println("UserServiceImpl->reg()");
		userdao.insert();
	}

}
