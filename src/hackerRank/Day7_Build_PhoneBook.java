package hackerRank;
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Day7_Build_PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	      int n = in.nextInt();
	      HashMap<String,Integer>phonebook = new HashMap<String,Integer>();
	      for(int i = 0; i < n; i++){
	          String name = in.next();
	          int phone = in.nextInt();	          
	          phonebook.put(name, phone);
	      }
	      while(in.hasNext()){
	          String search = in.next();
	          if(phonebook.get(search) != null) {
	        	  System.out.println(search+"="+phonebook.get(search));
	          }
	          else {
	        	  System.out.println("Not found");
	          }
	         
	      }
	      in.close();

	}

}
