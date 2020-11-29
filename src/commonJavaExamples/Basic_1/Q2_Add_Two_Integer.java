package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q2_Add_Two_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter First Integer");
		int num1 = reader.nextInt();
		System.out.println("Enter Second Integer");
		int num2 = reader.nextInt();
		System.out.println("Adding First and Second Integer : "+(num1+num2));
	}

}
