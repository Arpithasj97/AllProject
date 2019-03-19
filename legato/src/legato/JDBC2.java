
package legato;



	import java.sql.*;
	import java.util.Scanner;

	public class JDBC2 {

		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			//Movie a[]=null;
			while(true) {
			System.out.println("1 Enter the no of objects \n"+"2 for displaying\n"+"3 for exit");
			int option=scan.nextInt();
		
			switch(option) {
			case 1:addCustomer(scan);
					break;
			case 2:displayCustomer();
			break;
			case 3:
				System.exit(0);
			break;
			default : System.out.println("please enter correct option");
			}
			}
		}
		

	public static void addCustomer(Scanner scan) {
			try {
				
				Connection con=createConnection();
					//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","admin");
						System.out.println("connected successfully");
						Scanner scr=new Scanner(System.in);
						System.out.println("Enter the customerid");
						int customerid=scr.nextInt();
						System.out.println("Enter the customername");
						String customername=scr.next();
						System.out.println("Enter the address");
						String address=scr.next();
			
						String sql1="select * from db5.customer where customerid=?";
					    PreparedStatement pstmt1=con.prepareStatement(sql1);
						pstmt1.setInt(1,customerid);
					    ResultSet rs=pstmt1.executeQuery();
						//ResultSet rs="Select * from db3.customer where customerid=?";
						boolean flag=false;
						while(rs.next())
						{
							flag=true;
						}
						if(flag)
						{
							System.out.println("please select onother customerid");
					pstmt1.close();
					
						}else
						{
					
						//create the statement
						//Statement pstmt=con.createStatement();
						String sql="insert into customer values(?,?,?)";
					    PreparedStatement pstmt=con.prepareStatement(sql);
						pstmt.setInt(1,customerid);
						pstmt.setString(2,customername);
						pstmt.setString(3,address);
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
			
			
			public static void displayCustomer() {
				try{
					Connection con=createConnection();
					String sql="select * from customer";
					PreparedStatement pstmt = con.prepareStatement(sql);
					
					/*	Statement stmt=con.createStatement();
						
						String sql="insert into db5.employee values("+customerid+",'"+empname+"',"+salary+","+age+")";
						//exicute sql queries
						int i=stmt.executeUpdate(sql);
						System.out.println("the value of inserted rows are"+i); 
					*/	
					ResultSet rs=pstmt.executeQuery();
									
					
					while(rs.next()) {
						System.out.println("customerid"+rs.getInt(1)+"customername"+rs.getString(2)+"address"+rs.getString(2));
							System.out.println("empname"+rs.getString(1));
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
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db5","root","root");
			return con;
		
		}
		
		
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
	return null;
		}
		
	}
}