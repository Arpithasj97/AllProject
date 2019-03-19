package legato;

import java.util.Scanner;

public class Repeat
{

		    public static void main(String[] args)
		    {
		    	 Scanner sc = new Scanner(System.in);
		    	 
			      System.out.println("Enter a string:");
			      String s = sc.nextLine();
			                                              //char[] arr=s.tocharArray();		        
		        for(Character ch:s.toCharArray())            //for(int i=0;i<str.length());i++) //instead of ch make it as arr[i]
		        {
		            if(s.indexOf(ch) == s.lastIndexOf(ch))
		            {
		                System.out.println("1st non repeat character = " + ch);
		                break;
		            }
		        }
		    }
		}

