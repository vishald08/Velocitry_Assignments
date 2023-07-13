import java.util.Iterator;
import java.util.Scanner;

public class Velocity_Assignment_7 {
	
//	Assignment 7
// 	Question 2 Method Create for getNumberCube
 public int getNumberCube(int num) {
	 System.out.printf("The Cube of %d Is " ,num);
	 int cube = num*num*num;
		return cube;
	}
		
//		Assignment 7 
//		Question 3 Create A method for Factor 
		public void factor(int factor) {
			System.out.printf("The Factor Of %d Is: \n", factor);
		 for(int i=1;i<=factor;i++) {
			 if (factor%i==0) {
			 System.out.println(i+" ");
				
			}
		  }
		}
		
//		Assignment 7
//		Question 4 Create a Method to reverse order
		public void reversed(int num) {
			int reversed=0;
			System.out.printf("The Reverse Number Of %d Is \n", num);
			while (num!=0) {
				int digit =num%10;
				reversed= reversed * 10+ digit;
				num/=10;
				
			}
			System.out.println(reversed);
			
		}
		
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1 object create for all question 
		Velocity_Assignment_7 objAssignment_7 = new Velocity_Assignment_7();

		
//		Assignment 7
//		Question 2
//		System.out.println("Enter The Number");
//		int n =scanner.nextInt();
//		System.out.println(objAssignment_7.getNumberCube(n));
		
//		Assignment 7 
//		Question 3
//		System.out.println("Enter the number");
//		int num = scanner.nextInt();
//		objAssignment_7.factor(num);
		
//		Assignment 7
//		Question 4
//		System.out.println("Enter The Number ");
//		int num = scanner.nextInt();
//		objAssignment_7.reversed(num);
		
		
		
		
	}
}
