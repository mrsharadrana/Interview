package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q22_Reverse_Of_Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre number to Reverse");
		long input = scan.nextLong();
		long rev = 0;
		while(input != 0) {
				long a = input % 10; // 4//3//2//1
				rev = rev * 10 + a; //0*10+4=4//40+3=43//430+2=432//4320+1=4321
				input = input/10;
				
		}
		System.out.println(rev);

	}

}
