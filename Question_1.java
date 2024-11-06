package tasks.org;

public class Question_1 {

	//Question 1 Write a Java program that declares four integer variables: a, b, c, and d.
	//Then, write an if statement that checks whether the sum of a and b is greater than the sum of c and d.
	//If the condition is true, the program should output a message indicating that the sum of a and b is greater than the sum of c and d.

	public static void main(String[] args) {
	method1();
	}
	public static void method1() {
		int a,b,c,d,sum1,sum2;
		a=20; b=25; c=30; d=10;
		sum1=a+b;
		sum2=c+d;
		if (sum1>sum2) {
			System.out.println("the sum of a and b is greater than the sum of c and d");
		}
		else {
			System.out.println("the sum of a and b is not greater than the sum of c and d");
		}
	}	
}
