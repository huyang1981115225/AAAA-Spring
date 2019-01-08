package cn.tedu.spring.aop.day02;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 把这个类声明为一个切面:@Component
 * 1、需要把该类放到IOC容器中@Aspect
 * 2、再声明为一个切面
 * 
 * 注意：在aop.xml中配置	<!-- 使 AspectJ 的注解起作用 -->
 *	                <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
 * 
 * @author HY
 *
 */
@Component
@Aspect
public class LoggingAspect {
	/**
	 * 1、@Before前置通知
	 */
	// 声明该方法是一个前置通知：在目标方法开始之前执行
//	@Before("execution(public int cn.tedu.spring.aop.day02.ArithmeticCalculator.add(int, int))")
	@Before("execution(public int cn.tedu.spring.aop.day02.ArithmeticCalculator.*(int, int))")
	public void beforeMethod(JoinPoint joinPoint){
		String methondName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("The method "+methondName+" begins with "+args);
	}
	
	/**
	 * 1、@After后置通知
	 * @param joinPoint
	 */
	// 声明该方法是一个后置通知：在目标方法开始之后执行（无论是否发生异常）
	// 注意:在后置通知中不能访问目标方法执行的结果。
//	@After("execution(public int cn.tedu.spring.aop.day02.ArithmeticCalculator.add(int, int))")
	@After("execution(public int cn.tedu.spring.aop.day02.ArithmeticCalculator.*(int, int))")
	public void afterMethod(JoinPoint joinPoint){
		String methondName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("The method "+methondName+" end with "+args);
	}
}
