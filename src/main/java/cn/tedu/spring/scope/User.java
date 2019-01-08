package cn.tedu.spring.scope;

public class User {
	public User() {
		System.out.println("User->指行构造方法");
	}

	private void init() {
		System.out.println("User.init()");
	}

	private void destroy() {
		System.out.println("User.destroy()");
	}
}
