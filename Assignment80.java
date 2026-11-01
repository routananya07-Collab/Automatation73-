package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
	System.out.println(a1);
	
	Iterator<Integer> i1= a1.iterator();
	System.out.println("Using Iterator:");
	
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	System.out.println("Using ListIterator:");
	
	ListIterator<Integer> l1 = a1.listIterator();
	while(l1.hasNext())
	{
		System.out.println(l1.next());
	}
	System.out.println("Using ListIterator Backward:");
	
	while(l1.hasPrevious())
	{
		System.out.println(l1.previous());
	}
	}

}
