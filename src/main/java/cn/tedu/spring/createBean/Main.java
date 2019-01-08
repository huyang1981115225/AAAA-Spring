package cn.tedu.spring.createBean;

import java.util.Calendar;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//加载配置文件
		//创建容器对象
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("createBean.xml");
		//日志 
		System.out.println("加载配置完成！\n");
		
		// 方式一、无参构造器
		Address address = ctx.getBean("address", Address.class);
		System.out.println("id = address:\n"+address+"\n");
		
		//方式二、静态工厂方法
		Calendar cal = ctx.getBean("calendar", Calendar.class);
		System.out.println("id = calendar:\n"+cal+"\n");
	
		//方式三、实例工厂方法
		Person person = ctx.getBean("person", Person.class);
		System.out.println("id = user:\n"+person+"\n");
		
		//释放
		ctx.close();
	}
}
