// Write a program to generate and print all 3-letter words consisting of given set of characters. For example if 
// we have the characters 'a' and 'b', all possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" 
// and "bbb". The input characters are given as string at the first line of the input. Input characters are unique.

import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Insert characters:");
		String cha = in.nextLine();
		char[] chars = cha.toCharArray();
		for (int i1 = 0; i1 < chars.length; i1++) {
			for (int i2 = 0; i2 < chars.length; i2++) {
				for (int i3 = 0; i3 < chars.length; i3++) {
					System.out.printf("%s%s%s", chars[i1], chars[i2], chars[i3] + " ");
				}
			}
		}
		
	}
}
