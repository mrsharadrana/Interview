package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q21_Count_Digit_In_Integer {

	public static void main(String[] args) {
		
		
		System.out.println("Please Enter Your Integer");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int count = 0;
		
		
		while(input != 0) {
			input = input/10;
			count++;
		}
		System.out.println("Number of digit in "+input+" Is"+ count);
	}

}
