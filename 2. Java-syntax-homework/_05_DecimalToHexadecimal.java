// Write a program that enters a positive integer number num and converts and prints
// it in hexadecimal form. You may use some built-in method from the standard Java 
// libraries.

import java.util.Scanner;

public class _05_DecimalToHexadecimal {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Insert your number:");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println(Integer.toHexString(num));
	}

}
