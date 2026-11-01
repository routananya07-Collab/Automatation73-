package module1.program;

public class DemoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int original=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(original==rev) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

}
