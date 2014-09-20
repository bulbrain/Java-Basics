// Write a program to check whether a point is inside or outside of the figure
// below. The point is given as a pair of floating-point numbers, separated by a 
// space. Your program should print "Inside" or "Outside".

import java.util.Scanner;

public class _03_PointsInsideAFigure {

	public static void main(String[] args) {

		float ax, ay;
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the coordinates:");
		ax = in.nextFloat();
		ay = in.nextFloat();
		if (((ax >= 12.5 && ax <= 17.5) || (ax >= 20 && ax <= 22.5))
				&& ((ay >= 6 && ay <= 13.5))) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}
