package assignment01;

import java.util.Scanner;

public class ProblemTwo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		positive(scan.nextLine());

	}
	
	public static void positive(String str) {
		
		for (int i = 0; i <= str.length(); i++) {
			
			 
				if(str.charAt(i)>str.charAt(i+1)) {
				   System.out.println("its not a positive string");
				   break;
				}
				else
					System.out.println("its a positive string");
						
		}
		
		

	}
	
}
