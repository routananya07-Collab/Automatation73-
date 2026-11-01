package module1.program;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s1=new Scanner(System.in);
          System.out.println("Please enter the base:");
          double base=s1.nextDouble();
          System.out.println("Please enter the height:");
          double height=s1.nextDouble();
          double area=0.5*base*height;
          System.out.println("Answer is->"+area);
          s1.close();
	}
}
