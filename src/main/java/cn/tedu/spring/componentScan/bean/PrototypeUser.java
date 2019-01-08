package cn.tedu.spring.componentScan.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeUser {
	public PrototypeUser() {
		System.out.println("PrototypeUser->PrototypeUser()");
	}
}
