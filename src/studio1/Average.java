package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("You, sup?");
		int n1 = in.nextInt();
		
		System.out.println("The first of two integers to be averaged?");
		int n2 = in.nextInt();	
		
		double avg = (n1 + n2)/2;
		
		System.out.print("Average of " + n1 + " and " + n2 + " is " + avg + ".");
		
	}

}
