package assignment01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ProblemOne {

	public static void main(String[] args) {
		
		int n;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        
        String str = scan.nextLine();
        StringTokenizer strtoken = new StringTokenizer(str, " ");
        
        while (strtoken.hasMoreTokens()) {
            String temp = strtoken.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        scan.close();
        
	}

}
