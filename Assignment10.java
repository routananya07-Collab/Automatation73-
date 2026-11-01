package Assignments;

public class Assignment10 {
	
	//static method 1
	static void add()
	{
		System.out.println("Method Overloading:");
	}
	//static method 2
    static void add(int a,int b) {
	int c= a+b;
	System.out.println(c);
}
  //non-static method 1
    void add(double a,int b)
    {
    	double c= a+b;
    	System.out.println(c);
    }
  //non-static method 2
    void add(int a,double b) 
    {
    	double c = a+b;
    	System.out.println(c);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(10,20);
		Assignment10 a1 = new Assignment10();
		a1.add(1.2, 9);
	    a1.add(20,8.5);
	}

}
