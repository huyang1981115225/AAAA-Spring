package cn.tedu.spring.constructor.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.constructor.bean.User;
import cn.tedu.spring.constructor.service.UserService;
/**
 * 依赖注入的方式------构造器注入
 * @author HY
 *
 */
public class Test {

	public static void main(String[] args) {
		//加载配置
		String file = "constructor.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);
		//创建User数据
		User user =new User();
		user.setUsername("Billy");
		user.setPassword("a123456");
		
		//获取UserService对象
		UserService service = ctx.getBean("userService",UserService.class);
		service.reg(user);
		
		//释放资源
		ctx.close();
		System.out.println("资源已经释放");

	}

}
