package tasks.org;

import java.util.Scanner;

public class Question_2 {
	//Q2)Have a variable store an integer. Create an if statement to find out if it's an even number.
	public static void main(String[] args) {
		method2();
	}
	public static void method2() {
		int a;
		Scanner s = new Scanner(System.in);
				
		System.out.println("Enter the Number");
		
		a=s.nextInt();
		if (a%2==0) {
			System.out.println("it's an even number");	
		}
		else {
			System.out.println("it's not an even number");
		}
		s.close();
	}
}
