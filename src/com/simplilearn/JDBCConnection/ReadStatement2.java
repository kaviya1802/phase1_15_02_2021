package com.simplilearn.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadStatement2 {
		public static void main(String[] args) {
		
		
		try {
			
			Connection conn = DBConnection.initConnection();
			
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
		
		}finally {
			
		}
 
	}
	}
