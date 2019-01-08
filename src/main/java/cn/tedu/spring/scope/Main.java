package cn.tedu.spring.scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示Spring的作用域：
	User->指行构造方法
	User.init()
	加载配置文件完成！
	获取user对象：
	cn.tedu.spring.scope.User@f6e879
	cn.tedu.spring.scope.User@f6e879
	获取singleuser对象：
	SingletonUser->指行构造方法
	SingletonUser.init()
	cn.tedu.spring.scope.SingletonUser@1551a94
	cn.tedu.spring.scope.SingletonUser@1551a94
	获取protouser对象：
	PrototypeUser->指行构造方法
	PrototypeUser.init()
	PrototypeUser->指行构造方法
	PrototypeUser.init()
	cn.tedu.spring.scope.PrototypeUser@af6cff
	cn.tedu.spring.scope.PrototypeUser@135b478
	SingletonUser.destroy()
	User.destroy()
	资源已释放！
	
 * 1、在默认情况下，Spring管理的类的对象都是单例的，
 *    并且在加载Spring配置文件的时候就已经创建了bean的对象。
 * 2、可以添加scope属性配置作用域：
 *                              Singleton---构造方法和init都只会执行一次，
 *                              Prototype---构造方法和init执行多次
 * 3、延迟加载的bean当调用getBean()方法时才会创建
 * 4、只有作用域为Singleton的bean，销毁方法才会执行。
 * 
 * @author HY
 *
 */
public class Main {
public static void main(String[] args) {
	//加载配置文件
	String file ="scope.xml";
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);
	//日志
	System.out.println("加载配置文件完成！\n");
	//获取user对象
	System.out.println("获取user对象：");
	User user1 = ctx.getBean("user", User.class);
	User user2 = ctx.getBean("user", User.class);
	System.out.println(user1);
	System.out.println(user2);
	
	//获取singleuser对象
	System.out.println("获取singleuser对象：");
	SingletonUser singuser1 = ctx.getBean("singleuser", SingletonUser.class);
	SingletonUser singuser2 = ctx.getBean("singleuser", SingletonUser.class);
	System.out.println(singuser1);
	System.out.println(singuser2);
	
	//获取protouser对象
	System.out.println("获取protouser对象：");
	PrototypeUser protouser1 = ctx.getBean("protouser", PrototypeUser.class);
	PrototypeUser protouser2 = ctx.getBean("protouser", PrototypeUser.class);
	System.out.println(protouser1);
	System.out.println(protouser2);
	
	//释放资源
	ctx.close();
	//日志
	System.out.println("资源已释放！");
}
}
