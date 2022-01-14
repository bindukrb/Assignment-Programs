package assignment01;
import java.time.*;

public class ProblemThree {

	public static void main(String[] args) {
		
		 LocalDate pdate = LocalDate.of(1998, 07, 23);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("Difference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());

	}

}
