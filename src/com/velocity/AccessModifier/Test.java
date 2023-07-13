package com.velocity.AccessModifier;

class A{
	
	
	
	void a1() {
		 System.out.println("Hello");
	}
	
}

class B extends A{
	
	
}
public class Test {
	public static void main(String[] args) {
		
		B b = new B();
		b.a1();
		A a = new B();
		
	}

}
