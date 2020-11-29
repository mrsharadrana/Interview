package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q5_Compute_Quotient_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Divident");
		int divident = scan.nextInt();
		System.out.println("Enter Divisor");
		int divisor = scan.nextInt();
		int quotient = divident/divisor ;
		int remainder = divident%divisor;
		System.out.println("Quotient is : "+quotient);
		System.out.println("Remainder is : "+remainder);
	}

}
