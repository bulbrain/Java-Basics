// Write a program to generate a PDF document called Deck-of-Cards.pdf and print in
// it a standard deck of 52 cards, following one after another. Each card should be
// a rectangle holding its face and suit.

public class _09_GeneratePDF {
public static void main(String[] args) {
	String spade = "\u2660";
	String club = "\u2663";
	String heart = "\u2665";
	String diamond = "\u2666";
	System.out.println("----  ----  ----  ----");
	System.out.println("|A" + (spade) + "|" + "  " + "|A" + (club) + "|" + "  " + "|A" + (heart) + "|" + "  " + "|A" + (diamond) + "|");
	System.out.println("----  ----  ----  ----");
	System.out.println();
	for (int i = 1; i < 8; i++) {
		System.out.println("----  ----  ----  ----");
		System.out.println("|" + (i+1) + (spade) + "|" + "  " + "|" + (i+1) + (club) + "|" + "  " + "|" + (i+1) + (heart) + "|" + "  " + "|" + (i+1) + (diamond) + "|");
		System.out.println("----  ----  ----  ----");
		System.out.println();
	}
	System.out.println("----  ----  ----  ----");
	System.out.println("|J" + (spade) + "|" + "  " + "|J" + (club) + "|" + "  " + "|J" + (heart) + "|" + "  " + "|J" + (diamond) + "|");
	System.out.println("----  ----  ----  ----");
	System.out.println();
	System.out.println("----  ----  ----  ----");
	System.out.println("|Q" + (spade) + "|" + "  " + "|Q" + (club) + "|" + "  " + "|Q" + (heart) + "|" + "  " + "|Q" + (diamond) + "|");
	System.out.println("----  ----  ----  ----");
	System.out.println();
	System.out.println("----  ----  ----  ----");
	System.out.println("|K" + (spade) + "|" + "  " + "|K" + (club) + "|" + "  " + "|K" + (heart) + "|" + "  " + "|K" + (diamond) + "|");
	System.out.println("----  ----  ----  ----");
	System.out.println();
}
}
