// Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of
// integers: int[].

import java.util.*;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of numbers:");
		int n = in.nextInt();
		Integer[] nums = new Integer[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		System.out.print("The sorted sequence is: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
