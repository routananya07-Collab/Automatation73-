package Assignments;

public class Assignment99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10000);
			System.out.println("Thread Completed");
		}
		catch(InterruptedException e) {
			System.out.println("Checked Exception Handled");
		}
	}

}
