package com.velocity.AccessModifier;
 
public class AccessModifier {
	private int a= 10;
	protected int b=20;
	int c= 30;
	public int d= 40;
	
	public AccessModifier() {
		// TODO Auto-generated constructor stub
		System.out.println("hh");
	}
	public void yoo() {
		System.out.println(a+b+c+d);
		System.out.printf("%d %d %d %d ",a,b,c,d);
	}
	
	public void meth1() {
		int a = 10;
		int b =20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	
//		AccessModifier oc = new AccessModifier();
//		System.out.println(oc.a);
//		System.out.println(oc.b);
//		System.out.println(oc.c);
//		System.out.println(oc.d);
//		oc.meth1();
			
		
		int a=4;
		
	    for (int i = 1; i <=a ; i++) {
	    	
	    	for (int j = 1; j <= i; j++) {
	    		System.out.print(" ");	
			}
	    	
	    	System.out.print("*");	
		}
		
	}
}
