package cn.tedu.spring.componentScan.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyUser {
	public LazyUser() {
		System.out.println("LazyUser->LazyUser()");
	}
}
