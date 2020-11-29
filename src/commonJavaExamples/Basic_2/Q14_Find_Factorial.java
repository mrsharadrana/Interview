package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q14_Find_Factorial {

	public static void main(String[] args) {
		// Factorial mean n*(n-1)+n*(n-2)+....
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Number");
		int input = scan.nextInt();
		int fact = 1;
		for (int i =1;i<=input;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial is  "+fact);
		getFactorial(input);
	//Using While
		int k =1;
		int fact1 =1 ;
		while(k<=input) {
			 
			fact1= fact1*k;
			k++;
		}
		System.out.println("Factorial is "+fact1);
			
		//Another Approach
		int num =9;
		int fact2 = 1;
		int j =1;
		while(num>j) {
			fact2 = fact2*num;
			num--;
		}
		System.out.println("New Approach "+fact2);
	}
			//Method to return Factorial of a passed input
			//Takes one argument as int 
			public static void getFactorial(int num) {
				// Factorial mean n*(n-1)+n*(n-2)+....
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter your Number");
				int input = scan.nextInt();
				int fact = 1;
				for (int i =1;i<=input;i++) {
					fact = fact*i;
				}
				System.out.println("Using Method Factorial is  "+fact);
				
			}
			
			

}
