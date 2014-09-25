// Write a program to find how many times a word appears in given text. The text is given at the first input line.
// The target word is given at the second input line. The output is an integer number. Please ignore the character
// casing. Consider that any non-letter character is a word separator.

import java.util.*;

public class _06_CountSpecifiedWord {
	
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the input:");
		String[] input = in.nextLine().toLowerCase().split("[\\W]+");
		System.out.println("Find word:");
		String wordCount = in.next().toLowerCase();
		int count = 0;
		for (String word : input) {
			if (word.equals(wordCount)) {
				count++;
			}
		}
		System.out.println("The word " + wordCount + " appears " + count + " times.");
	}

}
