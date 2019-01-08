package cn.tedu.spring.annotation.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.annotation.service.IUserService;


public class Test {
	public static void main(String[] args) {
		// 加载配置
		String file = "annotation/applicationcontext.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);
		
		// 获取Bean对象
		IUserService service = ctx.getBean("userService", IUserService.class);
		System.out.println(service);
		
		// 执行reg
		service.reg();
		
		// 释放资源
		ctx.close();
		System.out.println("资源已经释放！");

	}
}
