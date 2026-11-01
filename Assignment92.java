package Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create Map
        Map<Integer, String> m1 = new HashMap<Integer, String>();

        // Add names
        m1.put(1, "RAM");
        m1.put(2, "Hari");
        m1.put(3, "Madhu");
        m1.put(4, "Pinu");
        m1.put(5, "Jeny");
        m1.put(6, "Manu");

        System.out.println("Map: " + m1);

        // 1. Using entrySet()
        System.out.println("Using entrySet():");

        for (Map.Entry<Integer, String> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 2. Using keySet()
        System.out.println("Using keySet():");

        for (Integer key : m1.keySet()) {
            System.out.println(key + " = " + m1.get(key));
        }

        // 3. Using values()
        System.out.println("Using values():");

        for (String value : m1.values()) {
            System.out.println(value);
        }

        // 4. Using Iterator
        System.out.println("Using Iterator:");

        Iterator<Map.Entry<Integer, String>> i1 =
                m1.entrySet().iterator();

        while (i1.hasNext()) {

            Map.Entry<Integer, String> entry = i1.next();

            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
	}

}
