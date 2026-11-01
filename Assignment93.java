package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create Map
        Map<Integer, String> m1 = new HashMap<Integer, String>();

        // 1. put()
        m1.put(1, "RAM");
        m1.put(2, "Hari");
        m1.put(3, "Madhu");

        System.out.println("After put(): " + m1);

        // Create second Map
        Map<Integer, String> m2 = new HashMap<Integer, String>();

        m2.put(4, "Pinu");
        m2.put(5, "Jeny");
        m2.put(6, "Manu");

        System.out.println("Map m2: " + m2);

        // 2. putAll()
        m1.putAll(m2);

        System.out.println("After putAll(): " + m1);

        // 3. replace()
        m1.replace(2, "HARI");

        System.out.println("After replace(): " + m1);

        // 4. putIfAbsent()
        m1.putIfAbsent(7, "Ravi");

        System.out.println("After putIfAbsent(): " + m1);

        // 5. isEmpty()
        System.out.println("Is Map empty? " + m1.isEmpty());

        // 6. size()
        System.out.println("Size of Map: " + m1.size());

        // 7. remove()
        m1.remove(7);

        System.out.println("After remove(): " + m1);

        // 8. clear()
        m1.clear();

        System.out.println("After clear(): " + m1);

        // Check isEmpty after clear
        System.out.println("Is Map empty after clear? " + m1.isEmpty());
	}

}
