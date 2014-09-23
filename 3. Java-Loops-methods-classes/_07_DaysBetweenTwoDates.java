// Write a program to calculate the difference between two dates in number of days. The dates are entered at two 
// consecutive lines in format day-month-year. Days are in range [1…31]. Months are in range [1…12]. Years are in 
// range [1900…2100].

import java.time.*;
import java.util.*;

public class _07_DaysBetweenTwoDates {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the first date in format dd-MM-yyyy:");
		String[] firstDate = in.nextLine().split("-");
		System.out.println("Insert the second date in format dd-MM-yyyy:");
		String[] secondDate = in.nextLine().split("-");
		LocalDateTime firstDatef = LocalDateTime.of(Integer.parseInt(firstDate[2]), Integer.parseInt(firstDate[1]), Integer.parseInt(firstDate[0]), 00, 00);
        LocalDateTime secondDatef = LocalDateTime.of(Integer.parseInt(secondDate[2]), Integer.parseInt(secondDate[1]), Integer.parseInt(secondDate[0]), 00, 00);
        Duration daysBetween = Duration.between(firstDatef, secondDatef);
        System.out.println("Days between the dates: " + daysBetween.toDays());
	}
}