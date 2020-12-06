package hackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Day7_Array_Reverse {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Starting For");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            
            System.out.print(arrItem);  
            System.out.print(" ");
           
        }
        System.out.println(" ");
        System.out.println("********");
        for(int i = n-1; i>=0;i--) {
        	int arrRev = Integer.parseInt(arrItems[i]);
        	System.out.print(arrRev);
        	System.out.print(" ");
        	
        }
        
     
        scanner.close();
	}

}
