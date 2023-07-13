
public class Velocity_Assingment_4 {
static int addTwoNumber(int a,int b) {
	int result = a+b;
	System.out.printf("The Addition Of %d & %d Number Is : ",a,b);
	return result;
}

static int substractTwoNumber(int a,int b) {
	int result = a-b;
	System.out.printf("The Substraction Of %d & %d Number Is : ",a,b);
	return result;
}

static int multiplicationTwoNumber(int a,int b) {
	int result = a*b;
	System.out.printf("The Multiplication Of %d & %d Number Is : ",a,b);
	return result;
}

static int divisionTwoNumber(int a,int b) {
	int result = a/b;
	System.out.printf("The Division Of %d & %d Number Is : ",a,b);
	return result;
}

static int averageOfMarks(int a,int b,int c, int d,int e) {
	int average = (a+b+c+d+e)/5;
	System.out.printf("The Average Of This %d,%d,%d,%d,%d Five Subjects Marks Is : ",a,b,c,d,e );
	return average;
}


	public static void main(String[] args) {
	
		Velocity_Assingment_4 va = new Velocity_Assingment_4();
		
//	  print Question 1
		System.out.println(va.addTwoNumber(5,4));
		
//	  print Question 2
		System.out.println(va.substractTwoNumber(7,2));
		
//	  print Question 3
		System.out.println(va.multiplicationTwoNumber(5,4));
		
//	  print Question 4
		System.out.println(va.divisionTwoNumber(23, 4));
		
//	  print Question 5
		System.out.println(va.averageOfMarks(67, 70, 84,60,53));
		
	
  }
}
