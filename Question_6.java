package tasks.org;

import java.util.Scanner;

public class Question_6 {

	//Q6)Write a program to print the factorial of a given number.

	public static void main(String[] args) {
		method6();

	}
	public static void method6() {

		int num, fact;
		fact=1;
		System.out.println("Enter the Number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		if(num>=0) {
			
			for (int i =1; i <=num; i++) {
				fact=fact*i;
			}	
		}
		System.out.println("The Factorial of the "+num+ " is "+fact );
	s.close();
	}
}
