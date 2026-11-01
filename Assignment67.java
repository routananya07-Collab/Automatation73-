package Assignments;

public class Assignment67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double [] a1=new double[4];
        a1[0]=92;
        a1[1]=80;
        a1[2]=10;
        a1[3]=19;
 
        double sum=0;       
        for(int i=0;i<a1.length;i++)
        {
        sum=sum+a1[i];
        }
        System.out.println(sum);
        double avergae=sum/a1.length;        
        System.out.println("Average of all the numbers:"+avergae);
	}
}
