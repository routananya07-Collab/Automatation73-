package module1.program;

public class StringExample {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String str="GroTechMinds";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("String"+str);
		System.out.println("Reverse String"+ rev);
		
	}

}
