package Assignments;

public class Assignment59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Automation";
		String output=" ";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
	}

}
