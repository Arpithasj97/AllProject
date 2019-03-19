package legato;
import java.sql.*;
public class JDBCProgram {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db10","root","root");
						System.out.println("connected successfully");
						//create the statement
						Statement stmt=con.createStatement();
						String sql="insert into db10.employee values(107,'arpita sj',40000,26)";
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
