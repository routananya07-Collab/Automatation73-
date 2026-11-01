package module1.program;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b=60;
		int c= 30;
		if(a>b&&a>c) {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
		else if(b>a&&b>c) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(a>b) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
	}

}
