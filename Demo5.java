package module1.program;
class Parent {
	void display() {
	System.out.println("Parent");
	}
}
class child extends Parent
{
	void show()
	{
		System.out.println("Child");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c= new child();
		c.display();
		c.show();
	}

}
