package Assignments;

public class Assignment68 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello World! I am Anu";
		int count= 0;
          
          for(int i=0;i<str.length();i++)
          {
        	  char ch= str.charAt(i);
        	  if(Character.isAlphabetic(ch)){
        		  count++;
        	  }
          }
          System.out.println("Number of Alphabets:"+count);
	}

}
