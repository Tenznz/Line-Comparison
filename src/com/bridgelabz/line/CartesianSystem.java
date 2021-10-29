package com.bridgelabz.line;

import java.util.Scanner;

public class CartesianSystem {

	public static void Line(int x1,int x2,int y1,int y2 ) {
		    double line;
		    line=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
	            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is "+line);
	}
	
	public static void main(String[] args) {
            int x1,x2,y1,y2;
            System.out.println("Enter x1,y1 and x2,y2");
            Scanner sc = new Scanner(System.in);
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            Line(x1,x2,y1,y2);
            

	}
}
