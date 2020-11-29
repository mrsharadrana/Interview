package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q4_Find_ASCII_Value_Of_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter Character");
		Scanner reader =new Scanner(System.in);
		char input = reader.next().charAt(0);
		int asciiValue = input;
		System.out.println(asciiValue);
	}

}
