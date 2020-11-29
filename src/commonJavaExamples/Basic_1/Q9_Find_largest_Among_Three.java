package commonJavaExamples.Basic_1;

import java.util.Scanner;

public class Q9_Find_largest_Among_Three {
//10,20,15
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 3 Interger");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);
		
		if(a==b) {
			System.out.println("A and B are same");
		}
		if(b==c) {
			System.out.println("B and C are same");
		}
		if(c==a) {
			System.out.println("C and A are same");
		}
		if(a>b && a >c)//(10>20)
			{
			
				System.out.println("A is Greater");
				
			}	
		else if (b>c) {
			System.out.println("B is Greater");
		}
		else if (c>a){
			System.out.println("C is Greater");
		}
		if(a>=b && a >=c)//(10>20)
		{
			
			System.out.println("A is Greater");
			
		}	
	else if (b>=c) {
		System.out.println("B is Greater");
	}
	else if (c>a){
		System.out.println("C is Greater");
	}

	if(a>b &&a>c) {
		System.out.println("A is largest");
	}
	else if(b>a && b>c) {
		System.out.println("B is largest");
	}
	else if(c>a && c>b) {
		System.out.println("C is largest");
	}
	else {
		System.out.println("Three are same");
	}
	}
}