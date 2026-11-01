package Assignments;

import java.util.Arrays;

public class Assignment65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int array1[]=new int[7];
        array1[0]=39;
        array1[1]=10;
        array1[2]=20;
        array1[3]=90;
        array1[4]=560;
        array1[5]=78;
        array1[6]=30;
                
        int array2[]=new int[array1.length];
        
        for(int i=0;i<array1.length;i++)
        {
        array2[i]=array1[i];

        }
        System.out.println("Input Array:");
        System.out.println(Arrays.toString(array1));
        System.out.println("Output Array:");
        System.out.println(Arrays.toString(array2));
        
	}

}
