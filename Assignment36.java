package Assignments;

import java.util.Scanner;

public class Assignment36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
        System.out.println("Please enter the Length of Rectangle:");
        double L=s1.nextDouble();
        System.out.println("Please enter the Breadth of Rectangle:");
        double B=s1.nextDouble();
        double area=L*B;
        System.out.println("Area of Rectangle is->"+area);
        double circumference=2*(L+B);
        System.out.println("circumference of Rectangle is-->"+circumference);
        s1.close();
	}

}
