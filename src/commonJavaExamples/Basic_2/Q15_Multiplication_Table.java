package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q15_Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scan.nextInt();
		int result = 1;
		for(int i=1;i<=10;i++) {
			result = number*i;
			System.out.println(number+"X"+i +" = "+result);
		}
	
		int num = 5;
		int i = 1;
		while(i<=10) {
			System.out.println(num*i);
			i++;
		}
		
	
	}

}
