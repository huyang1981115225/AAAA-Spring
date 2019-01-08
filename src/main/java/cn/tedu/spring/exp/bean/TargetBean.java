package cn.tedu.spring.exp.bean;



public class TargetBean {
	
	//值来自于SourceBean的id
	private int id;
	//值来自于SourceBean的name
	private String name;
	//值来自于SourceBean的cities中的index=0的元素
	private String city;
	//值来自于SourceBean的session中的key=role的元素
	private String role;
	//值来自于SourceBean的dbConfig中的driver的值
	private String driver;
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
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "TargetBean [\n id=" + id + ",\n name=" + name + ",\n city=" + city + ",\n role=" + role + ",\n driver=" + driver
				+ "]";
	}

}
