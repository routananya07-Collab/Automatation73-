package Assignments;

import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s1=new Scanner(System.in);
           System.out.println("Please enter the Radius:");
           double r=s1.nextDouble();
           double area=Math.PI*r*r;
           System.out.println("Area is->"+area);
           double circumference=Math.PI*2*r;
           System.out.println("circumference is-->"+circumference);
           s1.close();
	}

}
