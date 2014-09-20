// Write a program that finds the smallest of three numbers.

import java.util.Scanner;

public class _04_SmallestOfThreeNumbers {
	
	public static void main(String[] args) {
		
		double a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the first number:");
		a = in.nextFloat();
		System.out.println("Insert the second number:");
		b = in.nextFloat();
		System.out.println("Insert the third number:");
		c = in.nextFloat();
		System.out.println(Math.min(a, Math.min(b, c)));
	}

}
