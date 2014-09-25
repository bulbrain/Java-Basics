// Write a program to find how many times given string appears in given text as substring. The text is given at the
// first input line. The search string is given at the second input line. The output is an integer number. Please
// ignore the character casing.

import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert the text:");
		String[] input = in.nextLine().toLowerCase().split("[\\W]+");
		System.out.println("Insert the word to find:");
		String substringToCount = in.next().toLowerCase();
		int count = 0;
		
		for (int wordIndex = 0; wordIndex < input.length; wordIndex++) {
			
			int substringIndex = input[wordIndex].indexOf(substringToCount);
			
			while (substringIndex != -1) {
				String currentWord = "";
				
				for (int index = 0; index < input[wordIndex].length(); index++) {
					if (index == substringIndex) {
						currentWord += "";
					}
					else {
						currentWord += input[wordIndex].charAt(index);
					}
				}
				
				input[wordIndex] = currentWord;
				substringIndex = input[wordIndex].indexOf(substringToCount);
				count++;
			}
		}
		
		System.out.println(count);
	}

}