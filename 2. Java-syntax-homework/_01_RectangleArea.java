// Write a program that enters the sides of a rectangle (two integers a and b) and 
// calculates and prints the rectangle's area.

import java.util.Scanner;

public class _01_RectangleArea {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the A side:");
		int a = in.nextInt();
		System.out.println("Enter the B side:");
		int b = in.nextInt();
		System.out.println("Rectangle area = " + (a * b));
	}
}
