package cn.tedu.spring.componentScan.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonUser {
	public SingletonUser() {
		System.out.println("SingletonUser->SingletonUser()");
	}
}
