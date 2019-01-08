package cn.tedu.spring.tx;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTransactionTest {

	private ApplicationContext ctx = null;
	private BookShopDao bookShopDao = null;
	private BookShopService bookShopService = null;
	private Cashier cashier = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("tx/applicationContext.xml");
		bookShopDao = ctx.getBean(BookShopDao.class);
		bookShopService = ctx.getBean(BookShopService.class);
		cashier = ctx.getBean(Cashier.class);
	}
	
	/**
	 * 测试事务的传播行为
	 */
	@Test
	public void testTransactionlPropagation(){
		cashier.checkout("AA", Arrays.asList("1001", "1002"));
	}
	
	@Test
	public void testBookShopService(){
		bookShopService.purchase("AA", "1001");
	}
	
	//更新用户的账户余额: 使 username 的 balance - price
	@Test
	public void testBookShopDaoUpdateUserAccount(){
		bookShopDao.updateUserAccount("AA", 20);
	}
	
	//更新数的库存. 使书号对应的库存 - 1
	@Test
	public void testBookShopDaoUpdateBookStock(){
		bookShopDao.updateBookStock("1001");
	}
	
	//根据书号获取书的单价
	@Test
	public void testBookShopDaoFindPriceByIsbn() {
		System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
	}

}
