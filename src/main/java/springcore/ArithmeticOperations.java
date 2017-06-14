package springcore;

import java.util.Scanner;

public class ArithmeticOperations {
	int a=0,b=0,sum=0, diff= 0, prod = 0, div =0;
	Scanner in = new Scanner(System.in);
	 public int find_sum(int a, int b) {
	
	System.out.println();
	System.out.println("Addition of Two Numbers");
	System.out.println("\n");
	System.out.print("Enter First Value : ");
	a = in.nextInt();
	System.out.print("Enter Second Value : ");
	b = in.nextInt();
	sum=(a+b);
	System.out.println("\n");
	System.out.print("The sum of " + a + " and " + b + " is " + sum +".");
	System.out.println("\n");
	System.out.println("End of Program");
	return sum;
	 }
	 
	 public int find_diff(int a, int b) {
	System.out.println();
	System.out.println("Difference of Two Numbers");
	System.out.println("\n");
	System.out.print("Enter First Value : ");
	a = in.nextInt();
	System.out.print("Enter Second Value : ");
	b = in.nextInt();
	diff=(a-b);
	System.out.println("\n");
	System.out.print("The diff of " + a + " and " + b + " is " + diff +".");
	System.out.println("\n");
	System.out.println("End of Program");
	return diff;
	 }
	 
	 public int find_prod(int a, int b) {
	
	System.out.println();
	System.out.println("Product of Two Numbers");
	System.out.println("\n");
	System.out.print("Enter First Value : ");
	a = in.nextInt();
	System.out.print("Enter Second Value : ");
	b = in.nextInt();
	prod=(a*b);
	System.out.println("\n");
	System.out.print("The product of " + a + " and " + b + " is " + prod +".");
	System.out.println("\n");
	System.out.println("End of Program");
	return prod;
	 }
	 
	 public int find_div(int a, int b) {

	System.out.println();
	System.out.println("Division of Two Numbers");
	System.out.println("\n");
	System.out.print("Enter First Value : ");
	a = in.nextInt();
	System.out.print("Enter Second Value : ");
	b = in.nextInt();
	div=(a/b);
	System.out.println("\n");
	System.out.print("The Division of " + a + " and " + b + " is " + div +".");
	System.out.println("\n");
	System.out.println("End of Program");
	return div;
	 }
}
