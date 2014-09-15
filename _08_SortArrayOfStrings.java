// Write a program that enters from the console number n and n strings, then sorts
// them alphabetically and prints them. Note: you might need to learn how to use 
// loops and arrays in Java (search in Internet).

import java.util.Scanner;
import java.util.Arrays;

public class _08_SortArrayOfStrings {
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	String [] str = new String[n];
	for (int i = 0; i < n; i++) {
		str[i] = in.next();
	}
	Arrays.sort(str);
	for (int i = 0; i < n; i++) {
		System.out.println(str[i]);
	}
}
}
