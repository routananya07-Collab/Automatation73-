package Assignments;

public class Assignment9 {
	static void add(int a, int b) {
		System.out.println("Static method overloading 1:"+(a+b));
	}
	static void add(int a, int b, int c) {
		System.out.println("Static method overloading 2:"+(a+b+c));
	}
	static void add(int a, int b, int c,int d) {
		System.out.println("Static method overloading 3:"+(a+b+c+d));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}

}
