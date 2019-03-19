	package legato;
	import java.sql.*;
	
	public class Library2
	{
			public static void main(String[] args)
			{
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db9","root","root");
							System.out.println("connected successfully");
							//create the statement
							Statement stmt=con.createStatement();
							String sql="insert into db9.book values(5,'html','king')";
							//exicute sql queries
							int i=stmt.executeUpdate(sql);
							System.out.println("the value of inserted rows are"+i); 
							//close connection and statement
							stmt.close();
							con.close();
				}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			}

		}
		}


