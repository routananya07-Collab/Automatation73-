package Assignments;

public class Assignment72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Vishnu";

        // split()
        String[] result = str.split(" ");

        System.out.println("Using split():");
        
        for (String s : result) {
            System.out.println(s);
        }

        // replace()
        String replaceResult = str.replace("Vishnu", "Ananya");
        System.out.println("Using replace(): " + replaceResult);

        // replaceAll()
   
        System.out.println(str.replaceAll("[A-Z]", "*"));;
	}

}
