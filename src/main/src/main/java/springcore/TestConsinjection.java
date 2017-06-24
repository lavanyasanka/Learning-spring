package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsinjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Vet vet = (Vet)context.getBean("vetdoc");
		//vet.checkAnimal();
		vet.check();
		
/*		Cat cat = (Cat)context.getBean("kitty");
		cat.showAnimal();*/

	}

}
