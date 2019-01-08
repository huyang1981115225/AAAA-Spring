package cn.tedu.spring.aop.day01;

public class Test02 {
	public static void main(String[] args) {
		
		ArithmeticCalculator target =  new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		proxy.add(1, 2);
		proxy.sub(2, 1);
		proxy.mul(5, 1);
		proxy.div(4, 2);
	}
}
