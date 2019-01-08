package cn.tedu.spring.p.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("p.xml");
		Dao dao = ctx.getBean("dao", Dao.class);
		System.out.println(dao);
		
		/**
		 * 通过 ref 属性值指定当前属性指向哪一个 bean
		 * 会把dao注入service
		 */
		Service service = ctx.getBean("service", Service.class);
		service.save();// save by dbcp
		
		/**
		 * 内部 bean, 类似于匿名内部类对象. 不能被外部的 bean 来引用, 也没有必要设置 id 属性
		 */
		Service service2 = ctx.getBean("service2", Service.class);
		System.out.println("演示内部bean ");
		service2.save();// save by c3p0
		
		/**
		 * 设置级联属性(了解)
		 */
		Action action = ctx.getBean("action", Action.class);
		System.out.println("演示级联属性");
		action.execute();
		
		User user = ctx.getBean("user",User.class);
		System.out.println("演示装配集合属性");
		System.out.println(user);
		
		User user2 = ctx.getBean("user2", User.class);
		System.out.println(user2);
		
		User user3 = ctx.getBean("user3", User.class);
		System.out.println(user3);
		
		User user4 = ctx.getBean("user4", User.class);
		System.out.println(user4);
		
		User user5 = ctx.getBean("user5", User.class);
		System.out.println(user5);
		
		User user6 = ctx.getBean("user6", User.class);
		System.out.println(user6);
		ctx.close();
	}
	
}
