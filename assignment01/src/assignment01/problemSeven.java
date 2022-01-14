package assignment01;
import java.util.Arrays;

public class problemSeven {

		public static void main(String[] args) {
			int[] intarr= {9,3,1,7,5};
			getSorted(intarr);
			
		}

		
		public static void getSorted(int[] intarr) {
			
			int n=intarr.length;
			
			System.out.print("initial array: ");
			for(int array:intarr) {
				System.out.print(" "+array);
			}
			
			System.out.println();
			
			String str = Arrays.toString(intarr);;
			char ch[]=str.toCharArray();
			
			for(int i=0;i<ch.length/2;i++) {
				char next=ch[i];
				ch[i]=ch[ch.length-1-i];
				ch[ch.length-1-i]=next;
			}
			
			str=new String(ch);
			System.out.println("Reversed array is: "+str);
			
			Arrays.sort(intarr);
			System.out.print("sorted array is: ");
			Arrays.sort(intarr);
			System.out.print(Arrays.toString(intarr));
			
		
		}
		
		
	}






