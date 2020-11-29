package commonJavaExamples.Basic_2;

public class Q24_Check_Number_Is_Palindrome_Or_Not {

	public static void main(String[] args) {
		//A Palindrome number is same in reverse ex. 1331,121
		
		int input = 1281;
		int tempInput = input;
		int rev = 0;
		while(tempInput != 0) {
			int a = tempInput % 10;
			rev = rev*10+a;
			tempInput/=10;
		}
		System.out.println(rev);
		if(input == rev) {
			System.out.println("Entered No. "+input+" Is Palindrome");
		}
		else {
			System.out.println("Entered No. "+input+" Is Not Palindrome");
		}
	}

}
