// Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each at a separate line. 
// Print the sum of the numbers at the console. Ensure you close correctly the file in case of exception or in case
// of normal execution. In case of exception (e.g. the file is missing), print "Error" as a result.

import java.io.*;

public class _08_SumNumbersFromATextFile {
	
	public static void main(String[] args) {
		
		int sum = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"/home/georgi/Programming/1.1 Java/3. Java-Loops-methods-classes/src/input.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
			sum += Integer.parseInt(line);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Error");;
		}
		System.out.println("The sum is: " + sum);
	}
}