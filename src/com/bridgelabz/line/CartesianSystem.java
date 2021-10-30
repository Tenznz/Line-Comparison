package com.bridgelabz.line;

import java.util.Scanner;

public class CartesianSystem {

	public static double Line(int x1, int x2, int y1, int y2) {
		return ((double) Math.round(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) * 100)) / 100;
	}

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		System.out.println("Enter First line points x1,y1 and x2,y2");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		double line1 = Line(x1, x2, y1, y2);
		int X1, X2, Y1, Y2;
		System.out.println("Enter Second line points X1,Y1 and X2,Y2");
		X1 = sc.nextInt();
		Y1 = sc.nextInt();
		X2 = sc.nextInt();
		Y2 = sc.nextInt();
		double line2 = Line(X1, X2, Y1, Y2);
		sc.close();
		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") is " + line1);
		System.out.println("distancebetween" + "(" + X1 + "," + Y1 + ")," + "(" + X2 + "," + Y2 + ") is " + line2);
		
		
		if (line1 > line2)
			System.out.println("Line1 is greater than Line2");
		else if (line1 < line2)
			System.out.println("Line2 is greater than Line1");
		else
			System.out.println("Line1 and line2 are equal");
			
	}
}
