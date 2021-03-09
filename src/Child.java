import java.nio.channels.NetworkChannel;

public class Child {
	
	String name;
	int roll_no;
	
	char[] arr1= {'A','B'}; //{"Rahul","ram"};
	
	
    public Child(String name, int roll_no) {
		//super();
    	this(10);
    	System.out.println("Inside the Calling Constructor");
    	this.name= name;
		this.roll_no = roll_no;
		
		
				
	}
    public Child(int roll_no)
    {
    	this.roll_no=roll_no;
    	System.out.println("Inside the Caller Constructor"+roll_no);
    	new Child("Roopesh");
    }
    
    public Child(String name)
    {
    	this.name = name;
    	System.out.println(" Second Types of Constructor:"+name);
    }

	public static void main(String[] args) {
		
		System.out.println("INSIDE MAIN METHOD");
		
		Child c1 = new Child("Rupesh",12);
		Child c1= new Child();
		c1.name="rupesh"; 
		c1.roll_no=12;
		
		System.out.println("Value is :"+new Child("Rupesh",12));
		//System.out.println(name+" "+c1.roll_no);
		
		//String user_name="ABC";
		//int roll_no=10;
		
		//show_name(user_name,roll_no);
		
	}
	
//	 void show_name(String s1,int r) {
//		 
//		
//		
//		System.out.println("inside show naME METHOD");
//		stem.out.println("string name is = "+s1);
//		System.out.println("roll no is" + r);
//	}*/
	
}
	
	
