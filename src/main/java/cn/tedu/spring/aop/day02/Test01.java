package cn.tedu.spring.aop.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {

		// 1、创建Spring的IOC容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/day02/applicationContext-aop.xml");
		// 2、从IOC容器中获取bean的实例
		ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
		// 3、使用bean
		int result = arithmeticCalculator.add(3, 6);
		System.out.println("result:  " + result);
		
		result = arithmeticCalculator.div(12, 6);
		System.out.println("result:  " + result);
	}
}
