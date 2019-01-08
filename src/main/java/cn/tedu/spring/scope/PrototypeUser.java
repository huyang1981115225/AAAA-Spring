package cn.tedu.spring.scope;

public class PrototypeUser {
	// prototype原型模式
	public PrototypeUser() {
		System.out.println("PrototypeUser->指行构造方法");
	}

	private void init() {
		System.out.println("PrototypeUser.init()");
	}

	private void destroy() {
		System.out.println("PrototypeUser.destroy()");
	}
}
