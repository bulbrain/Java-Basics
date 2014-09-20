// Write a program that enters 3 points in the plane (as integer x and y 
// coordinates), calculates and prints the area of the triangle composed by these 3
// points. Round the result to a whole number. In case the three points do not form
// a triangle, print "0" as result.

import java.util.Scanner;

public class _02_TriangleArea {
	
	public static void main(String[] args) {
		
		int ax, ay, bx, by, cx, cy, area;
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the first point coordinates:");
		ax = in.nextInt();
		ay = in.nextInt();
		System.out.println("Insert the second point coordinates:");
		bx = in.nextInt();
		by = in.nextInt();
		System.out.println("Insert the third point coordinates:");
		cx = in.nextInt();
		cy = in.nextInt();
		area = ((ax * (by - cy)) + (bx * (cy - ay)) + (cx * (ay - by))) / 2;
		if (area < 0) {
			area = -area;
		}
		System.out.println("The area is: " + area);
	}
}
