// Write a program to count how many sequences of two equal bits ("00" or "11") can
// be found in the binary representation of given integer number n (with overlapping).

import java.util.Scanner;

public class _08_CountOfEqualBitPairs {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number:");
		int n = in.nextInt();
		int mem = 0;
		String bits = Integer.toBinaryString(n);
		for (int i = 0; i < bits.length()-1; i++) {
			if (bits.charAt(i) == bits.charAt(i + 1)) {
				mem ++;
			}
		}
		System.out.println("Number of equal pair of bits:" + mem);
	}

}
