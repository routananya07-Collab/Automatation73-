package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1= new ArrayList<Integer>();
		//add() method
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println("add method "+a1);
		
		a1.add(2, 25);
		System.out.println("add at given Index "+a1);
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		//add() method
		a2.add(50);
		a2.add(60);
		a2.add(70);
		a2.add(80);
		System.out.println(a2);
		//addall
		a1.addAll(a2);
		System.out.println("after addall "+a1);
		
		//get index
		System.out.println("element at index 2:"+a1.get(2));
		
		//remove()
		a1.remove(2);
		System.out.println("after remove "+a1);
		
		//contains()
		System.out.println("contains 40 "+a1.contains(40));
		
		//Indexof
		System.out.println("Index of 30 "+a1.indexOf(30));
		
		//size of
		System.out.println("Size of a1 "+ a1.size());
		
		//is Empty
		System.out.println("is a1 empty "+a1.isEmpty()) ;
		
		//Iterator
		System.out.println("using Iterator");
		Iterator<Integer> i1 = a1.iterator();
		while (i1.hasNext()) {
		System.out.println(i1.next());
		}
		System.out.println("using ListIterator Forward");
		ListIterator<Integer> li1 = a1.listIterator();
		while (li1.hasNext()) {
		System.out.println(li1.next());
		}
		
		System.out.println("using ListIterator Backward");
		while (li1.hasPrevious()) {
		System.out.println(li1.previous());
		}
		
		//Clear
		a1.clear();
		System.out.println("after clear "+a1);
		
		//isEmpty
		System.out.println("is a1 empty after clear" + a1.isEmpty());
	}

	
}
