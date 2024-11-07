package tasks.org;

import java.util.Scanner;

public class Question_9 {
//Q9) Write a program to check whether the person is a senior citizen or not.
	public static void main(String[] args) {
method9();
	}
public static void method9() {
int age;
System.out.println("Enter the age");
Scanner s = new Scanner(System.in);
age =s.nextInt();
if (age>=60) {
	System.out.println("The person is a senior citizen");
}
else {
	System.out.println("The person is not a senior citizen");
}
s.close();
}
}
