package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q16_Generate_Fibonacci_Series {

	public static void main(String[] args) {
		// Fibonacci Sequence First two Fixed and then Next would be sum of previous Two
		//{0,1,1,2,3,5,8......}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Upto Numbre to Generate Fibonacci Sequence");
		int input = scan.nextInt();
		int k = 0;
		int first =0;
		int second =1;
//		System.out.println(first);
//		System.out.println(second);
//		while(k<=input) {
//			first = first +second;
//			System.out.println(first);
//			second = first+second;
//			System.out.println(second);
//			k++;
//		}
//		//Using For Loop
//		for(int j = 0; j<=input; j++) {
//			System.out.println(first);
//			int sum = first + second;
//			first = second;
//			second = sum;
//		}
		//Using While
		int limit = 10;
		while(k<=10) {
			System.out.println(first);
			int sum = first+second;
			first = second;
			second = sum;
			k++;
		
		}

	}

}
