package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpCollection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmpCollections emp = (EmpCollections)context.getBean("empcol");
		emp.diplayemp();
		emp.findemp(12);

	}

}
