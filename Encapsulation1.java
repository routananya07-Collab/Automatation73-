package module1.program;
class Student{
	private int age= 20;
	public int getAge() {
		return age;
	}



public void setAge(int age) {
	this.age=age;
	}
}
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setAge(29);
		System.out.println(s.getAge());
	}

}
