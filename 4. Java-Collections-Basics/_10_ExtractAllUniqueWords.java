// At the first line at the console you are given a piece of text. Extract all words from it and print them in 
// alphabetical order. Consider each non-letter character as word separator. Take the repeating words only once. 
// Ignore the character casing. Print the result words in a single line, separated by spaces.

import java.util.*;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> uniqueWords = new ArrayList<>();
		System.out.println("Insert the text:");
		String[] input = in.nextLine().toLowerCase().split("\\W+");
		for (String word : input) {
			if (!uniqueWords.contains(word)) {
				uniqueWords.add(word);
			}
		}
		Collections.sort(uniqueWords);
		for (String word : uniqueWords) {
			System.out.print(word + " ");
		}
	}

}