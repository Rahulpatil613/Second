package Homework.java;

public class Student {
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		m2();
		
		
	
		}
	void m1() {
		
		System.out.println("in instance m1");
		int a=10;
		System.out.println("the value of a is "+a);
	}

static void m2() {
		
		System.out.println("in Static m2");
		
		Student s1=new Student();
		s1.m1();
	}
	
	
	
}
