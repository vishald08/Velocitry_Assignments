import java.util.Iterator;

import javax.sound.midi.Soundbank;

public class VelocityPraveenSirAssignment {
	int a;
	int salary;
public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary>0) {
			this.salary = salary;
		}
		else {
			salary=0;
		}
		
	}
	
public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
public static void main(String[] args) {
	
	int num=20;
	int count;
	
	for (int i = 1; i <=num; i++) {
		count=0;
		for (int j = 2; j <= i/2; j++) {
			if (i%j==0) {
//				System.out.println();
				count++;
				break;
			}
		}if (count==0) {
			System.out.println(i);
		}
	}
	
	  int n=17;
	  int count1=0;
	  
	  for (int i = 1; i <=n; i++) {
		if (n%i==0) {
			count1++;
		}
	}
	  if (count1==2) {
		System.out.println("Prime");
	}else {
		System.out.println("Not prime");
	}
	
	VelocityPraveenSirAssignment v = new VelocityPraveenSirAssignment();
	
	v.setSalary( 600);
	
	System.out.println(v.getSalary());
	
	
}
}
