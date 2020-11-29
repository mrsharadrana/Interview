package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q7_Check_Number_Even_Or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number To Check");
		int input = scan.nextInt();
		if(input % 2 == 0) {
			System.out.println("Entered number: "+input +" is Even");
		}
		else {
			System.out.println("Entered number: "+input +" is Odd");
		}
	}

}
