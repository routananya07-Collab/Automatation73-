package Assignments;

import java.util.Arrays;

public class Assignment64 {

		 public static void main(String[] args) 
	        {
	                char [] Sction1=new char[4];
	                Sction1[0]='A';
	                Sction1[1]='B';
	                Sction1[2]='C';
	                Sction1[3]='D';
	                
	                System.out.println(Arrays.toString(Sction1));	               

	                char [] Sction2=new char[4];
	                Sction2[0]='A';
	                Sction2[1]='B';
	                Sction2[2]='E';
	                Sction2[3]='D';
	                
	                System.out.println(Arrays.toString(Sction2));
	                
	        if(Arrays.equals(Sction1, Sction2))
	               

	        {
	                System.out.println("The 2 arrays are equal");
	        }
	        else
	        {
	                System.out.println("The 2 arrays are not equal");
	        }
	}

}
