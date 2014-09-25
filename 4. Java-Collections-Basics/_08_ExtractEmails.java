// Write a program to extract all email addresses from given text. The text comes at the first input line. Print 
// the emails in the output, each at a separate line. Emails are considered to be in format <user>@<host>.
import java.util.Scanner;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the text:");
		String[] input = in.nextLine().split(" ");
		String temp = "";
		
		for (int index = 0; index < input[input.length - 1].length() - 1; index++) {
			temp += input[input.length - 1].charAt(index);
		}
		
		input[input.length - 1] = temp;
		
		String regex = "([a-zA-Z0-9]+[.,-_]?[a-zA-Z0-9]+)+[@]{1}"
				+ "([a-zA-Z0-9]+[.-]?[a-zA-Z0-9]+)+([.]{1}[a-zA-Z0-9]+)+";
		
		for (String word : input) {
			if (word.matches(regex)) {
				System.out.println(word);
			}
		}
	}

}