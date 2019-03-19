package today;

import java.text.*;
import java.util.*;
import java.sql.*;
public class prgm {

	   
	      static Connection currentCon = null;
	      static ResultSet rs = null;  
		
		
		
	      public static prgm login(prgm p) {
		
	         //preparing some objects for connection 
	         Statement stmt = null;    
		
	         String uname = p.getuName();    
	         String pwd = p.getpwd();   
		    
	         String searchQuery =
	               "select * from users where uname='"
	                        + uname
	                        + "' AND pwd='"
	                        + pwd
	                        + "'";
		    
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Your user name is " + uname);          
	      System.out.println("Your password is " + pwd);
	      System.out.println("Query: "+searchQuery);
		    
	      try 
	      {
	         //connect to DB 
	         currentCon = ConnectionManager.getConnection();
	         stmt=currentCon.createStatement();
	         rs = stmt.executeQuery(searchQuery);	        
	         boolean more = rs.next();
		       
	         // if user does not exist set the isValid variable to false
	         if (!more) 
	         {
	            System.out.println("Sorry, you are not a registered user! Please sign up first");
	            p.setValid(false);
	         } 
		        
	         //if user exists set the isValid variable to true
	         else if (more) 
	         {
	            String uname = rs.getString("uname");
	            String pwd = rs.getString("pwd");
		     	
	            System.out.println("Welcome " + uname);
	            p.setuName(uname);
	            p.setpwd(pwd);
	            p.setValid(true);
	         }
	      } 

	      catch (Exception ex) 
	      {
	         System.out.println("Log In failed: An Exception has occurred! " + ex);
	      } 
		    
	      //some exception handling
	      finally 
	      {
	         if (rs != null)	{
	            try {
	               rs.close();
	            } catch (Exception e) {}
	               rs = null;
	            }
		
	         if (stmt != null) {
	            try {
	               stmt.close();
	            } catch (Exception e) {}
	               stmt = null;
	            }
		
	         if (currentCon != null) {
	            try {
	               currentCon.close();
	            } catch (Exception e) {
	            }

	            currentCon = null;
	         }
	      }

	return p;
		
	      }	
	   }



