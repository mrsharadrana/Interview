package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q1_Print_Entered_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class to read value from console
		Scanner reader = new Scanner(System.in);
		//Print in Console to Enter Integer
		System.out.println("Please Enter Your Integer");
		int input = reader.nextInt();
		System.out.println("Your Integer is "+input);
	}

}
