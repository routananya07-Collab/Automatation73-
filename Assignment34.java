package Assignments;

import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s1=new Scanner(System.in);
          System.out.println("Please enter A:");
          double A=s1.nextDouble();
          System.out.println("Please enter B:");
          double B=s1.nextDouble();
          System.out.println("Please enter C:");
          double h=s1.nextDouble();
          System.out.println("Please enter h20:");
          double C=s1.nextDouble();
          double area = 0.5*B*h;
          System.out.println("Area of Triangle is->"+area);
          double circumference= A+B+C;
          System.out.println("circumference of Triangle is->"+circumference);
          s1.close();
	}

}
