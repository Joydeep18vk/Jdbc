package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValue {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st = con.createStatement();
		st.execute("insert into student Values(1,'Joy',24)");
		st.execute("insert into student Values(2,'Biswa',26)");
		st.execute("insert into student Values(3,'Satya',22)");
		st.execute("insert into student Values(4,'Arka',23)");
		System.out.println(" Value insert...");
		con.close();
	}
}
