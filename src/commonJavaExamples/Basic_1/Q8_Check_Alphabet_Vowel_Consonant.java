package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q8_Check_Alphabet_Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Alphabet");
		char input = scan.next().charAt(0);
		if(input == 'a'|| input == 'e'|| input == 'i'|| input == 'o'|| input == 'u') {
			System.out.println("Entered Alphabet "+input+" is Vowel");
		}
		else {
			System.out.println("Entered Alphabet "+input+" is Consonent");
		}
	}

}
