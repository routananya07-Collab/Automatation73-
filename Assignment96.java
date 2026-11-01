package Assignments;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
