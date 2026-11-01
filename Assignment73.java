package Assignments;

import java.util.Arrays;

public class Assignment73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="My name is Vishnu";
        String [] s1=        a.split(" ", 4);
System.out.println(Arrays.toString(s1));
System.out.println(a.replace("Vishnu", "Ananya"));

System.out.println(a.replaceAll("[A-Z]", ""));

System.out.println(a.matches("(.*)name(.*)"));

	}

}
