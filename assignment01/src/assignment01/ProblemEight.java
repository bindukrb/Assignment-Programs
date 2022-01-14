package assignment01;

import java.util.Arrays;

public class ProblemEight {

	public static void main(String[] args) {
		
		int[] arr = { 9,7,5,3,1,0,2,4,6,8 };
		secondSmallest(arr);
		
	}
	
	public static void secondSmallest(int[] arr) {
		
        System.out.print("Given array is: ");
		
		System.out.println(Arrays.toString(arr));
        
		System.out.print("sorted array is: ");
		
		Arrays.sort(arr);
		
		System.out.print(Arrays.toString(arr));
		
        System.out.println();
        
        System.out.println("Second Smallest: "+arr[1]);
	}

}
