package cn.tedu.spring.componentScan.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//如果想自己设置id可以这么写@Component（“...”）
@Component
public class User {
	public User() {
		System.out.println("User->User()");
	}

	@PostConstruct
	public void init() {
		System.out.println("User.init()");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("User.destroy()");
	}
}
