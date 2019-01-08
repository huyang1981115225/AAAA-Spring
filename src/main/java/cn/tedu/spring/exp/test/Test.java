package cn.tedu.spring.exp.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.exp.bean.SourceBean;
import cn.tedu.spring.exp.bean.TargetBean;

/**
 * 使用Spring表达式可以在注入值时，引入另一个bean的属性值或另一个bean的集合中的某一个元素
 * 
 * 使用条件：某个beanA已经注入值，另一个beanB的某些值来自于beanA.
 * 
 * 基本格式： #{ }
 * 
 * @author HY
 *
 */
public class Test {

	public static void main(String[] args) {
		// 读取配置文件
		String file = "exp/applicationcontext.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);
		// 获取SourceBean对象
		SourceBean sourceBean = ctx.getBean("source", SourceBean.class);
		// 测试输出并观察日志
		System.out.println(sourceBean);

		// 获取TargetBean对象
		TargetBean targetBean = ctx.getBean("target", TargetBean.class);
		// 测试输出并观察日志
		System.out.println(targetBean);
		// 释放资源
		ctx.close();
		System.out.println("资源已经释放");

	}

}
