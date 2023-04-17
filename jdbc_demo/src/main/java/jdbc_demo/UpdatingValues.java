package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingValues {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st = con.createStatement();
		st.execute("update student set sage=27 where sid=2");
		System.out.println("Value updated...");
		con.close();
	}
}
