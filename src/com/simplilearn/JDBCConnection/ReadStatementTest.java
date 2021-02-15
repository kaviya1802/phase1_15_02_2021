package com.simplilearn.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadStatementTest {
	
	public static String url = "jdbc:mysql://localhost:3306/emsystem";
	public static String username = "root";
	public static String password = "root";
	
	public static void main(String[] args) {
		
		
		try {
			//Step1: Register Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Step2 : Create /get Connection
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("DB connection Successful !");
			
			//Step 3 : Create statement
			Statement stm = conn.createStatement();
			
			//Step 4 : Execute query
			
			String query = "SELECT * FROM employees";
			ResultSet result = stm.executeQuery(query);
			
			while (result.next())
				System.out.println(
						result.getInt("id") +"  "+
						result.getString("first_name") +"  "+
						result.getString("last_name") +"  "+
						result.getString("email") +"  "+
						result.getString("department")+"  "+
						result.getDouble("salary")+"  ");
			
		} catch (SQLException e) {
			String getMessage = null;
			System.out.println("DB connection Failure !" +getMessage);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			
		}
 
	}

	private static Object createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

}
