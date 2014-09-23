// Write a method to convert from degrees to radians. Write a method to convert from radians to degrees. You are 
// given a number n and n queries for conversion. Each conversion query will consist of a number + space + measure.
// Measures are "deg" and "rad". Convert all radians to degrees and all degrees to radians. Print the results as n
// lines, each holding a number + space + measure. Format all numbers with 6 digit after the decimal point.

import java.util.Scanner;

public class _05_AngleConverter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of convertions:");
		int n = in.nextInt();
		String[] nums = new String[n];
		String[] measure = new String[n];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter the radians/degrees to convert:");
			nums[i] = in.next();
			measure[i] = in.next();
		}
		for (int i = 0; i < nums.length; i++) {
			if (measure[i].equals("deg")) {
				System.out.printf("%.6f rad%n",
						DegreesConverter(Double.parseDouble(nums[i])));
			} else {
				System.out.printf("%.6f deg%n",
						RadiansConverter(Double.parseDouble(nums[i])));
			}
		}
	}

	public static double DegreesConverter(double degrees) {
		double result = degrees * 0.0174532925;
		return result;
	}

	public static double RadiansConverter(double radians) {
		double result = radians / 0.0174532925;
		return result;
	}

}