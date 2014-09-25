// Write a program that enters an array of strings and finds in it the largest sequence of equal strings. If 
// several sequences have the same longest length, print the leftmost of them. The input strings are given as a 
// single line, separated by a space.

import java.util.*;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		System.out.println("Insert the sequence of strings:");
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String[] strings = in.nextLine().split(" ");
		ArrayList<String> largestSequence = new ArrayList<String>();
		ArrayList<String> currentSequence = new ArrayList<String>();
		largestSequence.add(strings[0]);
		currentSequence.add(strings[0]);
		for (int i = 1; i < strings.length; i++) {
			if (!strings[i].equals(strings[i - 1])) {
				currentSequence.clear();
			}
			currentSequence.add(strings[i]);
			
			if (currentSequence.size() > largestSequence.size()) {
				largestSequence = new ArrayList<String>(currentSequence);
			}
		}
		
		for (String element : largestSequence) {
			System.out.printf("%s ", element);
		}
	}
}
