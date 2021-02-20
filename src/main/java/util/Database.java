package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	public static String get(String columnName)throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/midspring2020", "root", "kanbay80");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from usersession12");
		
		while (rs.next()) {
			return rs.getString(columnName);
		}
		return null;
	}

}

//while loop - when we don't know how many times there is data, no range specific
//for loop - when there is condition and we have a range eg: 3times then we put i=3
//do while loop - when we have a condition and it has to at least meet 1 time then do while loop
