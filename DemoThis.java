package module1.program;

public class DemoThis {
int id;
String name;
DemoThis(int id,String name)
{
	this.id = id;
	this.name=name;
}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThis d= new DemoThis(10,"Anu");
		d.display();
	}

}
