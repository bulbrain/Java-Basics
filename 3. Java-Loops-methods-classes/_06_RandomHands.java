// Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards.

import java.util.*;

public class _06_RandomHands {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of hands:");
		int n = in.nextInt();
		String[] face = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		char[] suit = {'\u2660', '\u2665', '\u2666', '\u2663'};
		for (int i = 0; i < n; i++) {
			Random rnd = new Random();
			System.out.printf("%s%c %s%c %s%c %s%c %s%c%n", face[rnd.nextInt(13)+0], suit[rnd.nextInt(4)+0], face[rnd.nextInt(13)+0], suit[rnd.nextInt(4)+0], face[rnd.nextInt(13)+0], suit[rnd.nextInt(4)+0], face[rnd.nextInt(13)+0], suit[rnd.nextInt(4)+0], face[rnd.nextInt(13)+0], suit[rnd.nextInt(4)+0]);
		}
	}
}