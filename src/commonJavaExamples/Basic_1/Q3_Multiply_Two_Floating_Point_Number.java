package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q3_Multiply_Two_Floating_Point_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter First Floating Point Number");
		float num1 = reader.nextFloat();
		System.out.println("Enter Second Floating Point Number");
		float num2 = reader.nextFloat();
		System.out.println("Multiplying First Floating Point Number with Second Floating Point Number and Result is: "+(num1*num2));
	}

}
