package Assignments;

public class Assignment51_1 extends Assignment51 {
	
	int a =20;
	void show()
	{
		System.out.println("Child class a ="+a);
		System.out.println("Child class a ="+super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment51_1 A = new Assignment51_1();
		A.show();
	}

}
