package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q20_Display_Character_AtoZ {

	public static void main(String[] args) {
//		//Using int i and then converting ASCII to corresponding Char 
//		for(int i='A';i<='Z';i++) {
//			char c = (char) i;
//			System.out.println(c);
//		}
//		//Directly using Char
//		for(char c ='A';c<='Z';c++) {
//			System.out.print(c);
//		}
		//using While loop
		char ch = 'a';
		while(ch<='z') {
			System.out.println(ch);
			ch++;
		}
		
	}

}
