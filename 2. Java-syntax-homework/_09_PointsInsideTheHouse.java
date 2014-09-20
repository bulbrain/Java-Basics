// Write a program to check whether a point is inside or outside the house below. 
// The point is given as a pair of floating-point numbers, separated by a space. 
// Your program should print "Inside" or "Outside".

import java.util.Scanner;

public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the coordinates:");
		double px = in.nextDouble();
		double py = in.nextDouble();
		if (py < 12.5 || (py > 17.5 && py < 20) || py > 22.5 || px > 13.5) {
			System.out.println("Outside");
		}
		else
		{
			System.out.println("Inside");
		}
	}
}
