package cn.tedu.spring.autowire.service;

import cn.tedu.spring.autowire.dao.IUserDao;

public class UserService {
	private int id;
	private String name;
	private String city;
	private String role;
	private IUserDao userdao;
	

	public UserService() {
		System.err.println("UserService()");
	}

	public void reg() {
		System.out.println("UserService->reg()");
		userdao.insert();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public IUserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(IUserDao userdao1) {
		this.userdao = userdao1;
	}

	@Override
	public String toString() {
		return "UserService [\n id=" + id + ",\n name=" + name + ",\n city=" + city + ",\n role=" + role + "]";
	}
	
	
}
