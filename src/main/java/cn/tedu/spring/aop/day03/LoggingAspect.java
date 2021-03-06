package cn.tedu.spring.aop.day03;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 把这个类声明为一个切面:@Component
 * 1、需要把该类放到IOC容器中@Aspect
 * 2、再声明为一个切面
 * 
 * 注意：在xml中配置	<!-- 使 AspectJ 的注解起作用 -->
 *	                <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
 *
 * 1、bean组件切入点：
 *               @Before("bean(userService)||bean(carService)")
 *               @Before("bean(*Service)")
 * 2、类切入点：
 *               @Before("within(cn.tedu.service.userService)")
 *               @Before("within(cn.tedu.service.*Service)") 
 *               
 * 3、方法切入点：
 *               @Before("execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.add(int, int))")
 *               @Before("execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.*(..))")  
 * 
 * 可以使用 @Order 注解指定切面的优先级, 值越小优先级越高
 * 
 * @author HY
 *
 */
@Order(2)
@Component
@Aspect
public class LoggingAspect {
	
	/**
	 * 定义一个方法, 用于声明切入点表达式. 一般地, 该方法中再不需要添入其他的代码. 
	 * 使用 @Pointcut 来声明切入点表达式. 
	 * 后面的其他通知直接使用方法名来引用当前的切入点表达式. 
	 */
	@Pointcut("execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.*(int, int))")
	public void declareJointPointExpression(){}

	/**
	 * 在 com.atguigu.spring.aop.ArithmeticCalculator 接口的每一个实现类的每一个方法开始之前执行一段代码
	 */
	@Before("execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.*(int, int))")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object [] args = joinPoint.getArgs();
		
		System.out.println("[Before] The method " + methodName + " begins with " + Arrays.asList(args));
	}
	
	/**
	 * 2、@After后置通知：
	 * 					声明该方法是一个后置通知：在目标方法开始之后执行（无论是否发生异常）
	 *                  注意:在后置通知中不能访问目标方法执行的结果
	 */
//	@After("execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.add(int, int))")
	@After("execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.*(int, int))")
	public void afterMethod(JoinPoint joinPoint){
		String methondName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("[After] The method "+methondName+" end with "+args);
	}
	
	/**
	 * 3、@AfterReturning返回通知：
	 * 返回通知中可以访问目标方法执行的结果(没有异常的情况下执行)
	 */
//	@AfterReturning(value="execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.add(int, int))",returning="result")
	@AfterReturning(value="execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.*(..))",returning="result")
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		String methondName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("[AfterReturning] The method "+methondName+" end with "+result);
	}
	
	/**
	 * 4、@AfterThrowing异常通知：
	 * 							异常通知(有异常的情况下执行)。
	 */
//	@AfterThrowing(value="execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.add(int, int))",throwing="ex")
	@AfterThrowing(value="execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.*(..))",throwing="ex")
	public void afterThrowingMethod(JoinPoint joinPoint,Exception ex){
		String methondName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("[AfterThrowing] The method "+methondName+" occurs exception :  "+ex);
	}
	
	/**
	 * 5、@Around环绕通知：
	 *                   1、必须有参数ProceedingJoinPoint，可以决定是否执行目标方法。
	 *                   2、必须有返回值 Object
	 *                   3、必须抛出异常 Throwable
	 *                   
	 */
//	@Around(value="execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.add(int, int))")
	@Around("declareJointPointExpression()")
	public Object aroundMethod(ProceedingJoinPoint jp){
		System.out.println("开始进入环绕通知...");
		Object result  = null;
		String methodName = jp.getSignature().getName();
		try {
			//前置通知
			System.out.println("The method "+methodName+" begins with "+Arrays.asList(jp.getArgs()));
			
			// 执行目标方法
			result = jp.proceed();
			
			//返回通知
			System.out.println("The method "+methodName+" end with "+result);
		} catch (Throwable e) {
			
			//异常通知
			System.out.println("The method "+methodName+" occurs exception:  "+e);
			
		}
		//后置通知
		System.out.println("The method "+methodName+" ends ");
		System.out.println("环绕通知结束。");
		return result;
	}
}
