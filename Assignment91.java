package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<>();

        // 1. add()
        c.add("RAM");
        c.add("Hari");
        c.add("Madhu");
        c.add("Pinu");

        System.out.println("Collection: " + c);

        // 2. addAll()
        Collection<String> c2 = new ArrayList<>();

        c2.add("Jeny");
        c2.add("Manu");

        c.addAll(c2);

        System.out.println("After addAll(): " + c);

        // 3. contains()
        System.out.println("Contains Jeny: " + c.contains("Jeny"));

        // 4. containsAll()
        System.out.println("Contains all c2: " + c.containsAll(c2));

        // 5. size()
        System.out.println("Size: " + c.size());

        // 6. isEmpty()
        System.out.println("Is Empty: " + c.isEmpty());

        // 7. iterator()
        System.out.println("Using Iterator:");

        Iterator<String> itr = c.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 8. remove()
        c.remove("Hari");

        System.out.println("After remove(Hari): " + c);

        // 9. removeAll()
        c.removeAll(c2);

        System.out.println("After removeAll(c2): " + c);

        // 10. clear()
        c.clear();

        System.out.println("After clear(): " + c);

        // Check isEmpty()
        System.out.println("Is Empty after clear(): " + c.isEmpty());
	}

}
