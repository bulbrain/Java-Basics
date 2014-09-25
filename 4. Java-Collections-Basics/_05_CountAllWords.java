// Write a program to count the number of words in given sentence. Use any non-letter character as word separator.

import java.util.*;

public class _05_CountAllWords {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the sentence:");
		String[] words = in.nextLine().split("[\\W]+");
		int count = words.length;
		System.out.println("Words: " + count);
	}

}
