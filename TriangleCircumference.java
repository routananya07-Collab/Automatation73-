package module1.program;

import java.util.Scanner;

public class TriangleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s1=new Scanner(System.in);
          System.out.println("Please enter A:");
          double A=s1.nextDouble();
          System.out.println("Please enter B:");
          double B=s1.nextDouble();
          System.out.println("Please enter C:");
          double C=s1.nextDouble();
          double circumference= A+B+C;
          System.out.println("Answer is->"+circumference);
          s1.close();
	}

}
