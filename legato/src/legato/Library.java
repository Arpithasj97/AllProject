package legato;



	import java.sql.*;
	import java.util.Scanner;

	public class Library {

		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			//Movie a[]=null;
			while(true) {
			System.out.println("1 Enter the no of objects \n"+"2 for displaying\n"+"3 for exit");
			int option=scan.nextInt();
		
			switch(option) {
			case 1:addbook(scan);
					break;
			case 2:displayBook();
			break;
			case 3:
				System.exit(0);
			break;
			default : System.out.println("please enter correct option");
			}
			}
		}
		

	public static void addbook(Scanner scan) {
			try {
				
				Connection con=createConnection();
					//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","admin");
						System.out.println("connected successfully");
						Scanner scr=new Scanner(System.in);
						System.out.println("Enter the bookid: ");
						int bookid=scr.nextInt();
						System.out.println("Enter the bookname: ");
						String bookname=scr.next();
						System.out.println("Enter the author: ");
						String author=scr.next();
			
						String sql1="select * from db9.book";
					    PreparedStatement pstmt1=con.prepareStatement(sql1);
						pstmt1.setInt(1,bookid);
					    ResultSet rs=pstmt1.executeQuery();
						//ResultSet rs="Select * from db9.book where bookid=?";
						boolean flag=false;
						while(rs.next())
						{
							flag=true;
						}
						if(flag)
						{
							System.out.println("please select onother bookid");
					pstmt1.close();
					
						}else
						{
					
						//create the statement
						//Statement pstmt=con.createStatement();
						String sql="insert into book values(?,?,?)";
					    PreparedStatement pstmt=con.prepareStatement(sql);
						pstmt.setInt(1,bookid);
						pstmt.setString(2,bookname);
						pstmt.setString(3,author);
						int rows=pstmt.executeUpdate();
						System.out.println("No of affected rows"+rows);
						pstmt.close();
						con.close();
						}
			}catch(SQLException e) {
				e.printStackTrace();
				//return null;
					}
	}
			
			
			public static void displayBook() {
				try{
					Connection con=createConnection();
					String sql="select * from book";
					PreparedStatement pstmt = con.prepareStatement(sql);
					
						Statement stmt=con.createStatement();
						
						String sql="insert into db9.employee values("+bookid+","+bookname+","+author+")";
						exicute sql queries
						int i=stmt.executeUpdate(sql);
						System.out.println("the value of inserted rows are"+i); 
					
					ResultSet rs=pstmt.executeQuery();
									
					
					while(rs.next()) {
						System.out.println("bookid"+rs.getInt(1)+"bookname"+rs.getString(2)+"author"+rs.getString(3));
							
						}
						
						//close connection and statement
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