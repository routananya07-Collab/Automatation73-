package module1.program;
interface Animal{
	void sound();
}
class Dog implements Animal{
	public void sound()
	{
		System.out.println("Dog barks");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.sound();
	}

}
