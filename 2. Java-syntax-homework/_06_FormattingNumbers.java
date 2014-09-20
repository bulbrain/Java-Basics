// Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-
// point b and a floating-point c and prints them in 4 virtual columns on the
// console. Each column should have a width of 10 characters. The number a should be
// printed in hexadecimal, left aligned; then the number a should be printed in 
// binary form, padded with zeroes, then the number b should be printed with 2 
// digits after the decimal point, right aligned; the number c should be printed 
// with 3 digits after the decimal point, left aligned.

import java.util.Scanner;

public class _06_FormattingNumbers {
	
	public static void main(String[] args) {
		
		int a;
		float b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the integer A:");
		a = in.nextInt();
		System.out.println("Insert the float B:");
		b = in.nextFloat();
		System.out.println("Insert the float C:");
		c = in.nextFloat();
		if ((a < 0) || (a > 500)) {
			System.out.println("The integer is not valid, should be positive and lower than 501.");
		}
		else
		{
			String binastr = Integer.toBinaryString(a);
			int bina = Integer.parseInt(binastr);
			System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, bina, b, c);
		}
	}

}
