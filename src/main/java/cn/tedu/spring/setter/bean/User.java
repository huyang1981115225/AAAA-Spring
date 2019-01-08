package cn.tedu.spring.setter.bean;

import java.io.Serializable;

public class User implements Serializable {
	//*****************JAVA BEAN************
	//1、实现Serializeable接口并生成UID
	//2、所有属性是私有的
	//3、为所有属性（除了static final）提桓公set/get方法
	//4、保证存在公有的、无参构造方法（可以不写）
	//**************************************

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String message;
	
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", message=" + message + "]";
	}
	
}
