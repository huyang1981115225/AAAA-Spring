package cn.tedu.spring.autowire.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.autowire.service.UserService;


public class Test {
	public static void main(String[] args) {
		// 加载配置
		String file = "autowire/applicationcontext2.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);
		
		// 获取Bean对象
		UserService service = ctx.getBean("userservice", UserService.class);
		System.out.println(service);
		
		// 执行reg
		service.reg();
		
		// 释放资源
		ctx.close();

	}
}
