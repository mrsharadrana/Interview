package commonJavaExamples.Basic_2;

public class Q26_Find_Prime_Num_Between_Two_Num {

	public static void main(String[] args) {
		//A Number is considered as prime number when it is divisble by 1 and iteself.
		int minRange = 20;
		int maxRange = 40;
		
		while(minRange < maxRange) {
			boolean flag = false;
		for(int i =2;i<minRange/2;i++) {
			if(minRange % i == 0) {
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println(minRange+" Is a Prime Number");
		}
		
		minRange++;
		}
		
		//Using While Loop
		int start = 20;
		int end = 40;
		
		
		while(start < end) {
			int i = 2;
			boolean flag = false;
			while(i<=start/2) {
				if(start % i == 0) {
					flag = true;
					break;
				}
				i++;
				
			}
			if(!flag) {
				System.out.println(start);
			}
			
			start++;
		}
		
	}

}
