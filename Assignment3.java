package Assignments;

public class Assignment3 {
	 static void add()
	 {
		 System.out.println("Static Method");
		 sub();
	 }
	 static void sub() 
	 {
		System.out.println("Inside Static Method"); 
	 }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method:");
		add();
	}

}
