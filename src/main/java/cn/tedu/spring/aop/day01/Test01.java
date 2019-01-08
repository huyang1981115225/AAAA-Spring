package cn.tedu.spring.aop.day01;

public class Test01 {
	public static void main(String[] args) {
		ArithmeticCalculator arithmeticCalculator = null;
		arithmeticCalculator = new ArithmeticCalculatorImpl();
		
		int result = arithmeticCalculator.add(1, 2);
		System.out.println("------->"+ result);
		
		result = arithmeticCalculator.div(4, 1);
		System.out.println("------->"+ result);
	}
}
