package Assignments;

public class Assignment29 {
	static int a=10;//static global variable
	int b= 20;//Non-static global variable
	
	//static method
	public static void test1() {
		System.out.println("Static variable from static method:"+a);
		Assignment29 a1=new Assignment29();
		System.out.println("Non-Static variable from static method:"+a1.b);
	}
	public void test2()
	{
		System.out.println("Static variable from Non-static method:"+a);
		
		System.out.println("Non-Static variable from Non-static method:"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling static method
		test1();
		//calling object
		
		Assignment29 a1=new Assignment29();
		////calling Non-static method
		a1.test2();
	}

}
