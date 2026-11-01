package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
			System.out.println("Please Enter the size of the Array:");
		int rollno[]=new int[s1.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please Enter the Value of the Array at Index:"+i);
			rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	
		
	}

}
