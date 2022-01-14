package assignment01;
import java.util.Scanner;

public class ProblemFive {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		sum(scan.nextInt());
		
	}
	
	public static void sum(int n) {
		
      int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum+=i*i*i;
		}
		
		System.out.println(sum);

	}

}
