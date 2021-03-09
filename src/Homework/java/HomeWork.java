package Homework.java;

public class HomeWork {
	
	public static void main(String[] args) {
		
		
		System.out.println("In main method");
		//HomeWork h1= new HomeWork();
		m1();
	}
	
	static void m1() {
		
		
		System.out.println(" inside static m1");
		m2();
	}
	 static void m2() {
		
		
		System.out.println("inside static m2");
		HomeWork h1=new HomeWork();
		h1.m3();
	}
	
   void m3() {
		
		
		System.out.println("inside instance m3");
		
		m4();
		
	}
	
   void m4() {
	
	
	System.out.println("inside instance m4");
	
	
}
	

}
