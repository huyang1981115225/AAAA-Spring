package cn.tedu.spring.simpleValue.test;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.simpleValue.bean.SampleBean;

public class Test {

	public static void main(String[] args) {
		// 加载配置
		String file = "simpleValue/applicationcontext2.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(file);

		// 获取bean对象
		SampleBean sampleBean = ctx.getBean("sampleBean", SampleBean.class);
		Date date = ctx.getBean("date1", Date.class);
		System.out.println(date);

		// 测试数据：name
		System.out.println("SampleBean name=" + sampleBean.getName());

		// 测试数据：tag
		System.out.println("SampleBean name=" + sampleBean.getTag());

		// 测试数据：id
		System.out.println("SampleBean name=" + sampleBean.getId());

		// 测试数据：date
		System.out.println("SampleBean name=" + sampleBean.getDate());

		// 测试数据：list
		System.out.println("SampleBean name=" + sampleBean.getListData());
		System.out.println("SampleBean name=" + sampleBean.getListData().getClass());

		// 测试数据：unorderedData
		System.out.println("SampleBean name=" + sampleBean.getUnorderedData());
		System.out.println("SampleBean name=" + sampleBean.getUnorderedData().getClass());

		// 测试数据：mapData
		System.out.println("SampleBean name=" + sampleBean.getMapData());
		System.out.println("SampleBean name=" + sampleBean.getMapData().getClass());

		// 测试数据：properties2
		System.out.println("SampleBean name=" + sampleBean.getProperties2());
		System.out.println("SampleBean name=" + sampleBean.getProperties2().getClass());

		List<?>users = ctx.getBean("users", List.class);
		System.out.println("users:\n\t"+users);
		
		Set<?>cities = ctx.getBean("cities", Set.class);
		System.out.println("users:\n\t"+cities);
		
		Map<?, ?>session = ctx.getBean("session", Map.class);
		System.out.println("session:\n\t"+session);
				// 释放资源
		ctx.close();
		System.out.println("资源释放");

	}

}
