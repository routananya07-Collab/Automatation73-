package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(20);
        System.out.println("Original:"+a1);
        
       Collections.sort(a1);
       System.out.println("After Sort:"+a1);
		
       Collections.reverse(a1);
       System.out.println("Reverse :"+a1);
       
       Collections.shuffle(a1);
       System.out.println("Shuffle:"+a1);
              
       System.out.println("Max:"+Collections.max(a1));
          
       System.out.println("Min:"+Collections.min(a1));
       
       Collections.swap(a1, 0, 3);
       System.out.println("After Swap:"+a1);
       
       System.out.println("Binary Search:"+Collections.binarySearch(a1, 40));
          
       System.out.println("Frequency:"+Collections.frequency(a1, 30));

	}

}
