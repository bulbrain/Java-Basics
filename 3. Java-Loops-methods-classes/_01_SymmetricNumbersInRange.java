// Write a program to generate and print all symmetric numbers in given range [start…end] (0 ≤ start ≤ end ≤ 999).
// A number is symmetric if its digits are symmetric toward its middle.

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = a; i <= b; i++) {
			if (i < 10) {
			int mem = i % 10;
			if (mem == i) 
				System.out.print(i + " ");
			}
			else if (i < 100) {
			int mem2 = i % 10;
			if (mem2 == i / 10) 
				System.out.print(i + " ");
			}
			else {
			int mem3 = i % 10;
			if (mem3 == i / 100) 
				System.out.print(i + " ");
			}
		}
}
}
				
