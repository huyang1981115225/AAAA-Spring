package cn.tedu.spring.scope;

public class SingletonUser {
	// singleton单例模式
	public SingletonUser() {
		System.out.println("SingletonUser->指行构造方法");
	}

	private void init() {
		System.out.println("SingletonUser.init()");
	}

	private void destroy() {
		System.out.println("SingletonUser.destroy()");
	}
}
