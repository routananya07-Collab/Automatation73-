package Assignments;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> S1 = new HashSet<>();
		S1.add(10);
		S1.add(20);
		S1.add(30);
		System.out.println(S1);
		
		HashSet<Integer> S2 = new HashSet<>();
		S2.add(40);
		S2.add(50);
		S2.add(60);
		System.out.println(S2);
		
		S1.addAll(S2);
		System.out.println(S1);
		
		System.out.println(S1.contains(20));
		
		System.out.println(S1.containsAll(S2));
		
		System.out.println(S1.size());
		
		System.out.println(S1.isEmpty());
		
		System.out.println("Using Iterator");
		Iterator<Integer> itr = S1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		S1.remove(40);
		System.out.println(S1);
		
		S1.removeAll(S2);
		System.out.println(S1);
		
		S1.clear();
		System.out.println(S1);
		
		System.out.println(S1.isEmpty());
	}

}
