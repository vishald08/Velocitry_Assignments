
class Bank{
	double principleAmount;
	int tenure;
	float rateOfInterest;
}

class ICICIBank extends Bank{
	
	void setCalculateInterest(double principleAmount,int tenure,float rateOfInterest) {
		this.principleAmount=principleAmount;
		this.tenure=tenure;
		this.rateOfInterest=rateOfInterest;
		
	}
	
	double getCalculateInterest(){
		double calculateInterest = principleAmount*tenure*rateOfInterest;
		return calculateInterest;
	}
	
}

class SBIBank extends Bank{
	
	double getCalculateInterest(){
		double calculateInterest = principleAmount*tenure*rateOfInterest;
		return calculateInterest;
		
	}
}

class HDFCBank extends Bank{
	
	double getCalculateInterest(){
		double calculateInterest = principleAmount*tenure*rateOfInterest;
		return calculateInterest;
		
	}
	
}
public class Velocity_Assignment_12_1 {
	public static void main(String[] args) {
		
		ICICIBank bank = new ICICIBank();
		bank.setCalculateInterest(10000, 1, 0.0015f);
		System.out.println(bank.getCalculateInterest());
		
	}

}
