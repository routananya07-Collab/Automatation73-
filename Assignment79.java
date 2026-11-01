package Assignments;

import java.util.ArrayList;

public class Assignment79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
	System.out.println(a1);
	
	a1.add(3, 35);
	System.out.println(a1);
	
	ArrayList<Integer> a2= new ArrayList<Integer>();
	a2.add(60);
	a2.add(70);
	a2.add(80);
	a2.add(90);
	a2.add(100);
	System.out.println(a2);
	
	a1.addAll(a2);
	System.out.println(a1);
	
	System.out.println(a1.contains(30));
	
	System.out.println(a1.containsAll(a2));
	
	System.out.println(a1.remove(1));
	
	a1.remove(Integer.valueOf(30));
	System.out.println(a1);
	
	a1.removeAll(a2);
	System.out.println(a1);
	
	System.out.println(a1.equals(a2));
	
	System.out.println(a1.isEmpty());
	
	a1.clear();
	System.out.println(a1);
	
	System.out.println(a1.isEmpty());
	
	System.out.println(a2.isEmpty());
	}

}
