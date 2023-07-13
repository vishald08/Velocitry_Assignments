import java.util.Iterator;
import java.util.Scanner;

public class Velocity_Assignment_10 {
	
//		Assignment 10
//		Question 1
	void isPrimeNumber() {
		int num=29,count=0;
		int m= num/2;
		if (num==0 || num==1) {
			System.out.println("its not a prime Number");
		}
		else {
			
		for (int i = 2; i <=m; i++) {
			if (num%i==0) {
				System.out.printf("%d : Its a not a prime number", num);
				count=1;
				break;
			}
		  }
		if (count==0) {
			System.out.printf("%d : It is a prime number", num);
		   } 	
		}	
	}
//		Assignment 10 
//		Question 1
	void printPrimeNumber() {
		int num=20;
		int count;
		System.out.printf("The Prime Number Of 0 to %d Is \n",num);
			for (int i = 1; i <=num; i++) {
				count=0;
			for (int j = 2; j <= i/2; j++) {
				if (i%j==0) {
					count++;
					break;
				}
				
			}if (count==0) {
				System.out.println(i);
			}
				
			}
		}
//		This Code Is Easy to Understand for print Is Prime number or not..	
	void primeNumber() {
		Scanner scanner = new Scanner(System.in);
		int count=0,n =scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				count++;
			}
		}

		if (count==2) {
			System.out.printf("%d Is A Prime Number \n",n);
		}
		else {
			System.out.printf("%d Is Not A Prime Number  \n",n);
		}
	scanner.close();	
	}
	
//		Assignment 10 
//		Question 2 --> Fibonacci Series
	void fibonacciSeries(int count) {
		int a=0,b=1;
		int num;
		System.out.printf("The Fibonacci Series Of Given %d Is \n", count);
		System.out.print(a+" "+b);
		for (int i = 0; i <= count; i++) {
		   num=a+b;
			System.out.print(" " + num);
			a=b;
			b=num;
		}
	}
	
//	 	Assignment 10
//		Question 3
		void armStrong(int num) {
			int m=num;
			int n=m;
			int last;
			int arm=0;
			while (n>0) {
					last= n%10;
					arm = (last*last*last)+ arm;
				    n=n/10;	
			}
			if (arm == m) {
			System.out.printf("Yes.. %d Is A ArmStrong Number \n", num);
			}else {
				System.out.printf("No.. %d Is Not A ArmStrong Number \n",num);
			}
		}
//		void printArmStrong(int num) {
//			int m=num;
//			int n=m;
//			int last;
//			int arm=0;
//			for (int i = 1; i <= num; i++) {
//				last= n%10;
//				arm = (last*last*last)+ arm;
//				if (i == arm) {
//					System.out.println(arm);
//					}
//			}
//		}
		
	
		
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Velocity_Assignment_10  va10 = new Velocity_Assignment_10();
	
//	Assignment 10 Question 1
//	va10.isPrimeNumber();
//	va10.printPrimeNumber();
//	va10.primeNumber();

//	 	Assignment 10 Question 3
//		int num = sc.nextInt();
//		va10.armStrong(num);

//	Assignment 10
//	Question 2 --> Fibonacci Series
//		  int count=sc.nextInt();
//		va10.fibonacciSeries(count);
	
   }
}
