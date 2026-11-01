package Assignments;

public class Assignment11 {

	Assignment11(int a)
	{
		System.out.println("ConstructorAssignment 11");
	}
	Assignment11(double a){
		System.out.println("Constructor Overloading");
	}
	Assignment11(String a){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Assignment11(120);
		new Assignment11(12.56);
		new Assignment11("Java");
	}
	

}
