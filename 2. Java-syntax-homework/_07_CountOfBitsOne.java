// Write a program to calculate the count of bits 1 in the binary representation of
// given integer number n.

import java.util.Scanner;

public class _07_CountOfBitsOne {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter the integer:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println("Number of 1 bits: " + Integer.bitCount(n));
	}
}
