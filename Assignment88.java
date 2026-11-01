package Assignments;

public class Assignment88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment88_Parent p=new Assignment88_Child();
		
		//Explicit Downcasting
		Assignment88_Child c = (Assignment88_Child)p;
		c.display();
		c.show();
	}

}
