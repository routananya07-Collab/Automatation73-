package Assignments;

public class Assignment8 {
	 void add(int a, int b) {
		System.out.println("Non-Static method overloading 1:"+(a+b));
	}
	 void add(int a, int b, int c) {
		System.out.println("Non-Static method overloading 2:"+(a+b+c));
	}
	 void add(int a, int b, int c,int d) {
		System.out.println("Non-Static method overloading 3:"+(a+b+c+d));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment8 a1= new Assignment8();
		a1.add(10,20);
		a1.add(10,20,30);
		a1.add(10,20,30,40);
	}

}
