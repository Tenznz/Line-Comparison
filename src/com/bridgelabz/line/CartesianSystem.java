package com.bridgelabz.line;

import java.util.Scanner;

public class CartesianSystem {
	static int x1, x2, y1, y2, count = 1;
	Scanner sc = new Scanner(System.in);

	public double Line() {

		System.out.println("Enter a Line" + (count++) + " points (x1,y1) and (x2,y2)");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		return ((double) Math.round(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) * 100)) / 100;
	}

	private static String compareTo(double line1, double line2) {
		String msg = "";
		int check = Double.compare(line1, line2);
		if (check == 0) {
			msg = "Line1 = Line2";
		} else if (check > 0) {
			msg = "Line1 > Line2";
		} else
			msg = "Line1 < Line2";
		return msg;
	}

	public static void main(String[] args) {
		double line1, line2;
		CartesianSystem line = new CartesianSystem();
		line1 = line.Line();
		System.out.println("Distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") = " + line1);
		line2 = line.Line();
		System.out.println("Distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") = " + line2);
		String result = compareTo(line1, line2);
		System.out.println(result);
	}

}
