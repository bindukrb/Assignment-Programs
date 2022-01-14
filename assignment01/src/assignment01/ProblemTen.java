package assignment01;

import java.util.Scanner;

public class ProblemTen {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the n value");
	int num=scan.nextInt();
	new Calculate().calculateDifference(num);

	}

}

class Calculate{
	
	public static void calculateDifference(int num) {
		
		int sum=0,sum1=0;
		
		for(int i=1;i<=num;i++) {
			sum+=i*i;
		}
		
		System.out.println("Sum of the squares of n numbers is: "+sum);
		
		for(int j=1;j<=num;j++) {
			sum1+=j;
		}
		
		System.out.println("Sum of n number is:"+sum1);
		
		int diff=sum-sum1;
		
		display(diff);
		
	}
	
	 static void display(int diff) {
		
		System.out.println("the difference is: "+diff);
	}
	
}
