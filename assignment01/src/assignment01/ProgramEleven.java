package assignment01;

import java.util.Scanner;

public class ProgramEleven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		
		checkNumber(scan.nextInt());

	}
	static void checkNumber(int num) {
	
		boolean flag=false;
		
		int currentNum = num % 10;
	       num = num/10;

	       while(num>0){
	           
	           if(currentNum <= num % 10){
	               flag = true;
	               break;
	           }
	           

	           currentNum = num % 10;
	           num = num/10;
	       }

		
		if(!flag) {
			System.out.println("the numbers are in the increasing order");
		}
		else
			System.out.println("sorry, the numbers are not in the increasing order");
		

	}

}
