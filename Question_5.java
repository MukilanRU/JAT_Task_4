package tasks.org;

public class Question_5 {
	//Q5) Write a program to check if a number is prime or not.

	public static void main(String[] args) {
		method5();
	}
	public static void method5() {
		int a=2;
		boolean isprime=true;
		if (a<=1) {
			isprime=false;
		}
		else {
			for (int i = 2; i <= a/2; i++) {
				if (a%i==0) {
					isprime = false;
				}
			}	
		}

		if (isprime) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}

}

