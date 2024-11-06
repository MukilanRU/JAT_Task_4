package tasks.org;

import java.util.Scanner;

public class Question_4 {
	
	//Q3) Write a java program to get 2 numbers from the user and swap their values without any loss of data.
	//You can make use of additional variable for swapping. 
	//Print the corresponding swapped values of the two numbers as output in the console.
	
	public static void main(String[] args) {
		method4();
	}
	public static void method4() {
		int a,b,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		a=s.nextInt();
		System.out.println("Enter 2nd Number");
		b=s.nextInt();
		
		System.out.println("Before swapping Number 1 : "+a);
		System.out.println("Before swapping Number 2 : "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping Number 1 : "+a);
		System.out.println("After swapping Number 2 : "+b);
	}
}
