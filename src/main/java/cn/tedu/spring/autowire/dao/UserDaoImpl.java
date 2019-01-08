package cn.tedu.spring.autowire.dao;

public class UserDaoImpl implements IUserDao {
   public UserDaoImpl() {
	   System.err.println("UserDaoImpl()");
   }
	public void insert() {
		System.out.println("UserDaoImpl->insert()");	
	}

}
