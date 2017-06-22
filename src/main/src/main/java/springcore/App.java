package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		int a = 0 , b = 0;
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.printHello();
		
		ArithmeticOperations arithobj = (ArithmeticOperations)context.getBean("arith");
	
	
		arithobj.find_sum(a, b);
    	arithobj.find_diff(a , b);
		arithobj.find_prod(a, b);
		arithobj.find_div(a, b);
		
	
	}

}
