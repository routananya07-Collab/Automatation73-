package Assignments;

public class Assignment87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment87_Child c=new Assignment87_Child();
		
		//Explicit Upcasting
		Assignment87_Parent p= (Assignment87_Parent)c;
		p.Display();
	}

}
