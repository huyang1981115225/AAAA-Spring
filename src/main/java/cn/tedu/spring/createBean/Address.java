package cn.tedu.spring.createBean;

public class Address {
	private String city;
	
	private String street;

	/**
	 * 利用无参构造器创建bean时，如果有有参构造器，必须加上无参构造器，否则会报错
	 */
	public Address() {
		super();
	}

	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
}
