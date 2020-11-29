package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q13_Sum_Of_Natural_Numbers {

	public static void main(String[] args) {
		//Natural Number is a number which is positive and could be decimal in nature
/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter End Range");
		int max = scan.nextInt();
		int sum =0;
		for(int i=1;i<=max;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
	//Using While loop
		int k = 1;
		int sum1 = 0;
		while( k <= max) {
			sum1 = sum1 + k;
			k++;
		}
		System.out.println("Sum is "+sum1);
*/
		int limt = 5;
		int sum = 0;
		int k = 1;
		while(k<=limt) {
			sum = sum+k;
			k++;
		}
		System.out.println(sum);
}
}
