package cn.tedu.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.tedu.spring.annotation.dao.IUserDao;


@Component("userService")
public class UserServiceImpl implements IUserService {
	
  public UserServiceImpl() {
	System.out.println("UserServiceImpl()");
}
	private IUserDao userdao;

	@Autowired
	//Autowired自动装配时会按byType去set注入，这样有可能会找到多个类型符合的，
	//加Qualifier来指定被注入bean的id
	public void setUserdao(@Qualifier("userDaoImpl")IUserDao userdao) {
		this.userdao = userdao;
	}

	public void reg() {
		System.out.println("UserServiceImpl->reg()");
		userdao.insert();
	}

}
