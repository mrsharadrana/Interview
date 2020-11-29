package commonJavaExamples.Basic_2;

import java.util.Scanner;

public class Q10_Check_Leap_Year {

	public static void main(String[] args) {
/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = scan.nextInt();
		//Logic to check Entered year is leap or not
		//Year should be divisible by 4 if it not a 00(Century) year
		//If A year is a Century Year then it should first divisible by 4 then 400.
		if(year % 4 == 0) {
		 if (year % 100 == 0) {//To check year is Century year or not 
			  if(year % 400 == 0 ) {
			 System.out.println(+year+" Is a Leap Year");
		}else {
			System.out.println(+year+" Is NOT a Leap Year");
		}
		}
		 else {
				System.out.println(+year+" Is a Leap Year");
			}
		}
		
		else {
			System.out.println(+year+" Is NOT a Leap Year");
		}
	*/
		int year = 2021;
		if(year % 4 ==0) {
			if(year % 100 ==0) {
				if(year % 400 ==0) {
					System.out.println("Leap Year");
				}
				else {
					System.out.println("No Leap");
				}
			}
			else {
				System.out.println("Leap Year");
			}
		}
		else {
			System.out.println("No Leap");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
