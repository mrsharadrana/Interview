package commonJavaExamples.Basic_2;

public class Q23_Calculate_Power_Of_Number {

	public static void main(String[] args) {

		int number = 5 ;
		int power = 3;
		int result = 1;
//	Using For Loop
//		for(int i =1;i<=power;i++) {
//		 result = result*number;
//			
//		}
//		
		
//Using While Loop
//		while(power != 0) {
//			result*= number;
//			--power;
//		}
//		System.out.println(result);
	
//	Using Math Function
		System.out.println(Math.pow(number, power));
	}

}
