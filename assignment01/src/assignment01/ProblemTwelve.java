package assignment01;

import java.util.Scanner;

public class ProblemTwelve {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number: ");
		
		if(checkNumber(scan.nextInt())) 
			System.out.println("it is a power of 2");
		else
			System.out.println("it is not a power of 2");

	}
	static boolean checkNumber(int number) {
		boolean flag=true;
		
		 if (number == 0)
	            return false;
	 
	        while (number != 1) {
	            if (number % 2 != 0)
	                return false;
	            number = number / 2;
	        }
	        return true;
		
		
	}

}
