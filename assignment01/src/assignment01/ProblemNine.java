package assignment01;

import java.util.Scanner;

public class ProblemNine {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		new Sum().calculateSum(scan.nextInt());

	}

}

class Sum{
	
	public static void calculateSum(int num) {
		
        int sum=0;
		
		for(int i=1;i<=num;i++) {
			
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);

	}	
		
}
