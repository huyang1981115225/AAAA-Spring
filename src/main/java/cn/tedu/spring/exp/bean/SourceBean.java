package cn.tedu.spring.exp.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SourceBean {
	
	private int id;
	private String name;
	private List<String> cities;
	private Map<String, Object> session;
	private Properties dbConfig;
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
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Properties getDbConfig() {
		return dbConfig;
	}
	public void setDbConfig(Properties dbConfig) {
		this.dbConfig = dbConfig;
	}
	@Override
	public String toString() {
		return "SourceBean [\n id=" + id + ",\n name=" + name + ",\n cities=" + cities + ",\n session=" + session + ",\n dbConfig="
				+ dbConfig + "]";
	}
	
}
