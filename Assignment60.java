package Assignments;

public class Assignment60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="MADAM";
		String output="";
		for(int i=input.length()-1;i>=0;i--) 
		{
			char c1 =input.charAt(i);
			output=output+c1;
		}
		System.out.println("This is my output:"+output);
		System.out.println("This is my input:"+input);
		
		  if(input.equals(output))
          {
                  System.out.println("Yes, it is a Palindrome");        
          }
          else
          {
                  System.out.println("No, it is not a palindrome");
          }
          
	}

}
