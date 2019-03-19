package legato;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Library3
{
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("1 for displaying\n"+"2 Enter the new books\n"+"3 for exit");
		int option=scan.nextInt();
	
		switch(option) {
		case 1:displayAll();
				break;
		case 2:addNewBooks(scan);
		break;
		case 3:
			System.exit(0);
		break;
		default : System.out.println("please enter correct option");
		}
		}
	}
	

public static void addNewBooks(Scanner scan) {
		try {
			
			Connection con=createConnection();
					Scanner scr=new Scanner(System.in);
					System.out.println("Enter the bookid");
					int bookid=scr.nextInt();
					System.out.println("Enter the bookname");
					String bookname=scr.next();
					System.out.println("Enter the authorname");
					String author=scr.next();
					
					
				/*	String sql1="select * from db9.book where bookname=?";
				    PreparedStatement pstmt1=con.prepareStatement(sql1);
					pstmt1.setString(1,bookname);
				    ResultSet rs=pstmt1.executeQuery();
					
					while(rs.next())
					{
						if(Pattern.matches("^[A-Za-z]+$",bookname))
						{
						System.out.println("Name can only contain alphabets");
				pstmt1.close();
						}
						else
					*/{
				
					String sql="insert into db9.book values(?,?,?)";
				    PreparedStatement pstmt=con.prepareStatement(sql);
					pstmt.setInt(1,bookid);
					pstmt.setString(2,bookname);
					pstmt.setString(3,author);
					int rows=pstmt.executeUpdate();
					System.out.println("No of affected rows"+rows);
					pstmt.close();
					con.close();
					}
					
		}
					
		catch(SQLException e) {
			e.printStackTrace();
			//return null;
				}
}
	
		
		public static void displayAll() {
			try{
				Connection con=createConnection();
				String sql="select * from db9.book";
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
			
				while(rs.next()) {
					System.out.println("bookid"+rs.getInt(1)+"bookname"+rs.getString(2)+"author"+rs.getString(2));
						
				}
				rs.close();	
				pstmt.close();
					con.close();
		}catch(SQLException e) {
	e.printStackTrace();
	}

}

public static Connection createConnection(){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db9","root","root");
		return con;
	
	}
	
	
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
return null;
	}
	
}
}


