package Assignments;

public class Assignment6 {
	Assignment6()
	{
		System.out.println("Non-Parametrzied Constructor");
	}
	static void Student()
	{
		System.out.println("Non-Parametrzied Static Method");
	}
	void Name()
	{
		System.out.println("Non-Parametrzied Non-Static Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student();
		Assignment6 a6= new Assignment6();
		a6.Name();
		
	}

}
