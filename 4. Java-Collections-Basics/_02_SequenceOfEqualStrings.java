// Write a program that enters an array of strings and finds in it all sequences of equal elements. The input
// strings are given as a single line, separated by a space.

import java.util.*;

public class _02_SequenceOfEqualStrings {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("Insert the sequence of strings:");
        String[] str = in.nextLine().split(" ");

        if (str.length == 1)
            System.out.println(str[0]);
        else {
            for (int i = 0; i < str.length; i++) {

                if (i == str.length - 1) {
                    if (str[i-1].equals(str[i]))
                        System.out.print(str[i]);
                    else
                        System.out.println(str[i]);
                }
                else if (str[i].equals(str[i+1])) {
                    System.out.print(str[i] + " ");
                }
                else {
                    System.out.println(str[i] + " ");
                }
            }
        }

    }
}