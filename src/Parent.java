import java.nio.channels.NetworkChannel;

public class Parent {
	int rollno;
	
//	public Parent(int rollno) {
//		this.rollno =rollno;
//		
//	}
	
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		
		
		
		System.out.println("in  main method");
	//Parent p1= new Parent();
	String name="ABC";
	String address="pune";
		  String z= p1.m1(name, address);
		System.out.println("Concat of two string\n"+z);
		
		
}
	public String m1(String name,String address ) {
		
	
		//System.out.println("in instance method");
		//System.out.println(name);
	//	System.out.println(Address);
		
		return (name+address);
		
	}
	
	
	}

	
	
	
