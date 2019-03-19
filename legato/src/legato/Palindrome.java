package legato;

import java.util.Scanner;

public class Palindrome 

	{
	   public static void main (String args[])
	   {
	      String str, a1 = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         a1 = a1 + str.charAt(i);
	 
	      if (str.equals(a1))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
	}




