package Assignments;

import java.util.Arrays;

public class Assignment69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String a="heart";
           String b="earth";
           
           char [] c1=        a.toCharArray();
           char [] c2=        b.toCharArray();   
           
           Arrays.sort(c1);
           Arrays.sort(c2);  
           if(Arrays.equals(c1, c2))
                   {
                      System.out.println("The 2 GIven Strings are Anagaram");
                   }
                   else 
                      {
                       System.out.println("The 2 GIven Strings are NOT Anagaram");
                      }
           }               
	}
