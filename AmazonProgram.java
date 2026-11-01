package module1.program;

public class AmazonProgram {

		AmazonProgram()
		{
			this(9.66);
			System.out.println("Cons 1");
		}
		AmazonProgram(double a)
		{
			this("MKT");
			System.out.println("Cons 2");
		}
		AmazonProgram(String a)
		{
			this(10,26);
			System.out.println("Cons 3");
		}
		AmazonProgram(int a,int b)
		{
			System.out.println("Cons 4");
		}
		AmazonProgram(int a,double b)
		{
			this();
			System.out.println("Cons 5");
		}
		public static void main(String[] args) 
		{
			new AmazonProgram(10,98.98);
		}
	}
	

