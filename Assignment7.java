package Assignments;

public class Assignment7 {
	Assignment7(int rollno,int sit)
	{
		System.out.println("Parametrzied Constructor");
	}
	static void Student(String name, int age)
	{
		System.out.println("Parametrzied Static Method");
	}
	void show(String sub,double mark)
	{
		System.out.println("Parametrzied Non-Static Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student("Ananya",26);
		Assignment7 a7= new Assignment7(1,1);
		a7.show("Math",97.40);
	}

}
