package Assignments;

import java.util.Scanner;

public class Assignment35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s1=new Scanner(System.in);
         System.out.println("Please enter the side of square:");
         double a=s1.nextDouble();
         double area=a*a;
         System.out.println("Area of square is->"+area);
         double circumference=4*a;
         System.out.println("circumference of Suare is-->"+circumference);
         s1.close();
	}

}
