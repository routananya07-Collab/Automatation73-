package Assignments;

public class Assignment40_A extends Assignment40 {
	
	static void msg() {
		System.out.println("Static child");
	}

	 void print() {
		System.out.println("Non-Static child");
	}
	 public static void main(String[]args)
	 {
		 Assignment40_A a= new Assignment40_A();
		 Assignment40.display();
		 a.show();
		 Assignment40_A.msg();
		 a.print();
	 }
}
