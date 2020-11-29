package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q12_Check_Char_Is_Alphabet_Or_Not {

	public static void main(String[] args) {
/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Character \n");
		char input = scan.next().charAt(0);
		if((input >='a' && input <='z') || (input>='A' && input<='Z')){
			System.out.println(input+" Is a Alphabet");
		}
		else {
			System.out.println(input+" Is not a Alphabet");
		}
//Using isAlphabetic() Method
		if(Character.isAlphabetic(input)) {
			System.out.println(input+" Is Alphabet");
		}
		else {
			System.out.println(input+" Is Not Alphabet");
		}
	*/
		char ch = 'A';
		if((ch>='a') && (ch<='z')||(ch>='A') && (ch<='Z')){
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not Alphabet");
		}
		char k = 'A';
		while( k <= 'Z') {
			System.out.println(k);
			k++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
