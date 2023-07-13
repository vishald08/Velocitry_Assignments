import java.util.Scanner;

class EmployeeInformation{
	private String firstName ;
	private String lastName ;
	private long mobileNumber;
	private String city;
	static String country= "India";
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}

public class Velocity_Assignment_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeInformation ei = new EmployeeInformation();
		for (int i = 1; i <= 4; i++) {
			
			ei.setFirstName("Vicky");
			ei.setLastName("Deshmukh");
			ei.setMobileNumber(9131902688l);
			ei.setCity("Sarni");
			
		}
		
		
		
		
	}

}
