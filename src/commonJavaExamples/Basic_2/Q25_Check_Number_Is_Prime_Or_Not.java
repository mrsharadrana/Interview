package commonJavaExamples.Basic_2;

public class Q25_Check_Number_Is_Prime_Or_Not {

	public static void main(String[] args) {
		//Prime number is a number which is divisible by only Two numbers FIRST 1 and SECOND No. Itself.
		//Logic_1 :- First Factors of the input number if it is greater than 2 than it not a prime number.
		//Logic_2 :- input divide by (input/2)
//		int input = 51;
//		boolean flag = false;
//		for(int i =2;i<=input/2;i++) {
//			if(input % i == 0) {
//				flag = true;
//				break;
//			}
//		
//		}
//		if(flag == true) {
//			System.out.println(input+" Is not a Prime Number");
//		}
//		else {
//			System.out.println(input+" Is a Prime Number");
//		}
//		System.out.println("Total is "+flag);
//		
//		
		//using While loop
		int input = 47;
		int i = 2;
		boolean flag = false;
		while(i<=input/2) {
			if(input%i==0) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
		i++;
		}
		if(flag == true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
