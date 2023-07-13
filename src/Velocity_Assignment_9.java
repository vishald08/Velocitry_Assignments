
public class Velocity_Assignment_9 {
	
//	 Assignment Question 1
	static int count; // If you make this variable as a non-static then it create a new local for every new object and then the always 1 not increasing..

	public Velocity_Assignment_9() {
		// TODO Auto-generated constructor stub
		
//		we count in constructor because every time we create new object then constructor is invoke by default....
		count++; // counting the object...
	}
	
	public static void main(String[] args) {
		
		Velocity_Assignment_9 va1 = new Velocity_Assignment_9();
		Velocity_Assignment_9 va2 = new Velocity_Assignment_9();
		Velocity_Assignment_9 va3 = new Velocity_Assignment_9();
		Velocity_Assignment_9 va4 = new Velocity_Assignment_9();
		Velocity_Assignment_9 va5 = new Velocity_Assignment_9();
		System.out.println(va5.count);
		
		
		
		
		
		
		
	}

}
