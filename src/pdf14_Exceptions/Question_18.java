package pdf14_Exceptions;

import java.sql.*;

public class Question_18 {

/*
 * 18. Write a program to generate SQLException
 */
	
public static void main(String[] args) {
	String db = "jdbc:mysql://localhost/mydatabase";
	String user = "root";
	String pasword = "root123";
	String query ="Select * from table";
	
	try (
		Connection con = DriverManager.getConnection(db, query, pasword);
		CallableStatement statement = con.prepareCall(query);
		)
	{
		statement.setInt(1, 1);
		statement.registerOutParameter(2, java.sql.Types.VARCHAR);
		statement.execute();
		
		String sqlresults = statement.getString(2);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("SQLException :"+e);
	}
	
	
	}
	
}
