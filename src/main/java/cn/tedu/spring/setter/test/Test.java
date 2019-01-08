package cn.tedu.spring.setter.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.setter.bean.User;
import cn.tedu.spring.setter.dao.IUserDao;
import cn.tedu.spring.setter.dao.UserDaoImpl2;
import cn.tedu.spring.setter.service.UserService;
/**
 * 依赖注入的方式------set方法注入（属性注入）
 * @author HY
 *
 */
public class Test {

	public static void main(String[] args) {
		//读取Spring配置文件
		String file = "setter.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);
		/**
		 * 演示属性注入setter方法 value
		 */
		User u = ctx.getBean("user",User.class);
		System.out.println(u);
		
		//创建用户数据
		User user =new User();
		user.setUsername("Alex");
		user.setPassword("a123456");
		IUserDao dao  =ctx.getBean("userDao",UserDaoImpl2.class);
		System.out.println(dao);
		
		//创建Service
		UserService service = ctx.getBean("userService", UserService.class);
		System.out.println(service);
		
		//执行注册
		service.reg(user);
		//释放资源
		ctx.close();
		//日志
		System.out.println("资源已释放！");

	}

}
