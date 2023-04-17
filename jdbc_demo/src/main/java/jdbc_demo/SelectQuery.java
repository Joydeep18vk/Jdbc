package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select sname,sage from student where sid=1");
		
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
	}
}
