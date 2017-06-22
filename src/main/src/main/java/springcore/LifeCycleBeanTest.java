package springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleBeanTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		LifeCycleBean obj = (LifeCycleBean) context.getBean("initdes");
	      obj.getMessage();
	      context.registerShutdownHook();

	}

}
