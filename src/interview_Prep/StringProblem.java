package interview_Prep;

public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input :-  Smart team, Smart result
//			1		2		3		4
//OutPut :- Result Smart, Team Smart
//			4		3		2	1
		String input = "Smart team , Smart result";
		System.out.println("Input :-" +input);
		String[] divide = input.split(" ");
		String result = divide[4];
		String team2  = divide[3];
		String comma  = divide[2];
		String smart  = divide[1];
		String team   = divide[0];
		
		

		System.out.println("Output:- "+result.substring(0, 1).toUpperCase()+result.substring(1)+ 
				" "+ team.substring(0, 1).toUpperCase()+team.substring(1)+
				" " +comma +
				" "	+smart.substring(0, 1).toUpperCase()+smart.substring(1)+
				" "  +team2.substring(0, 1).toUpperCase()+team2.substring(1));
		String[] reverse = new String[5];
		String[] divide1 = input.split(" ");
		for(int i =5 ;i<=5;--i) {
			for(int j= 0 ;j>=5;j++)
				System.out.println("h");
		}
		}

}
