package tasks.org;

import java.util.Scanner;

public class Question_10 {
	//Q10) Write a program to Count Number of Digits in an Integer.
	public static void main(String[] args) {
		method10();
	}
	public static void method10() {
		int num,orgNum;
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		orgNum=num;
		int count=0;
		if (num==0) {
			count=1;
		}
		else {
			count=0;
		}
		while (num>0) {
			num=num/10;
			count++;
		}
		System.out.println("The Number of digit in the number "+orgNum +" is " +count);
		s.close();
	}
}
