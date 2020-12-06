package hackerRank;
import java.io.*;
import java.util.*;

public class Day6_Loop_Problem {

    public static void main(String[] args) {
 /*       String s = "Hacker\r\n" + 
        		"Rank";
        System.out.println(s);
        int i=0;
        String even_index = "";
        String odd_index = "";
        while(i<s.length()) {
        	if(i % 2 == 0) {
        		odd_index += s.charAt(i);   		
        	}
        	else {
        		even_index += s.charAt(i);        	}
        	i++;
        }
        System.out.println(odd_index);
        System.out.println(even_index);
   */
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("Enter Number of String");
    	    int T = scan.nextInt();
    	    String string[] = new String[T];
    	    for(int i = 0; i<T; i++){
    	    	System.out.println("Enter Your "+ i+ " String");
    	        string[i] = scan.next();
    	    }
    	    for(int temp = 0; temp<T; temp++){

    	        for(int j = 0; j<string[temp].length(); j = j+2)
    	        {
    	            System.out.print(string[temp].charAt(j));
    	        }
    	        System.out.print(" ");

    	        for(int j = 1; j<string[temp].length(); j = j+2){
    	            System.out.print(string[temp].charAt(j));
    	        }

    	        System.out.println();

    	    }
    	    scan.close();
    	}
}