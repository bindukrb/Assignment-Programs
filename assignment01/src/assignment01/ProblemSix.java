package assignment01;

import java.util.Arrays;

public class ProblemSix {

	public static void main(String[] args) {
		
		String[] array= {"One","Two","Three","Four","Five"};
		
		for(int i = 0; i<array.length-1; i++)   
		{  
			for (int j = i+1; j<array.length; j++)   
			{  
				 
				if(array[i].compareTo(array[j])>0)   
				{  
				
					String temp = array[i];  
					array[i] = array[j];  
					array[j] = temp;  
				}  
			}  
		}  
		 
		System.out.println(Arrays.toString(array));  

	}

}
