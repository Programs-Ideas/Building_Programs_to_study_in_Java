package main;

import java.util.Scanner;

public class EscapeSequences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Next two lines: ");
		String nextLine = sc.nextLine();
		System.out.println("\n" + nextLine);
		
		System.out.println("\nHorizontal tabulation: ");
		String horizontalTabulation = sc.nextLine();
		System.out.print("\t" + horizontalTabulation);
		
		System.out.println("\nCar return: ");
		String carReturn = sc.nextLine();
		System.out.print("\r" + carReturn);
		
		System.out.println("\nInverted bars: ");
		String invertedBars = sc.nextLine(); 
		System.out.print("\\" + invertedBars);
		
		System.out.println("\nDouble quotation marks: ");
		String doubleQuotationMarks = sc.nextLine();
		System.out.printf("\"%s\"", doubleQuotationMarks);
		
		sc.close();
	}
}
