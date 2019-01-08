package cn.tedu.spring.componentScan.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.componentScan.bean.LazyUser;
import cn.tedu.spring.componentScan.bean.PrototypeUser;
import cn.tedu.spring.componentScan.bean.SingletonUser;
import cn.tedu.spring.componentScan.bean.User;


public class Test {

	public static void main(String[] args) {
		
		String file = "componentScan/applicationcontext.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);
		User user = ctx.getBean("user", User.class);
		System.out.println("user  "+user);
		System.out.println();
		
		SingletonUser singletonUser1 = ctx.getBean("singletonUser", SingletonUser.class);
		SingletonUser singletonUser2 = ctx.getBean("singletonUser", SingletonUser.class);
		System.out.println("singletonUser1  "+singletonUser1);
		System.out.println("singletonUser2  "+singletonUser2);
		System.out.println();
		
		PrototypeUser prototypeUser1 = ctx.getBean("prototypeUser", PrototypeUser.class);
		PrototypeUser prototypeUser2 = ctx.getBean("prototypeUser", PrototypeUser.class);
		System.out.println("prototypeUser1  "+prototypeUser1);
		System.out.println("prototypeUser2  "+prototypeUser2);
		System.out.println();
		
		LazyUser lazyUser1 = ctx.getBean("lazyUser", LazyUser.class);
		LazyUser lazyUser2 = ctx.getBean("lazyUser", LazyUser.class);
		System.out.println("lazyUser1  "+lazyUser1);
		System.out.println("lazyUser2  "+lazyUser2);
		System.out.println();
		
		ctx.close();
	}
}
