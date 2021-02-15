package com.simplilearn.JDBCConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		Statement stm = null;
		
		try {
			//get connection
		conn = DBConnection.initConnection();
		 
		//prepare statement
		
		stm = conn.createStatement();
		
		//Execute query
		
		String query = "UPDATE employees SET salary= 150000 where id = 2";
		int result = stm.executeUpdate(query);
		
		System.out.println("Employee details updated successfully !!");
		System.out.println("No of rows affected"+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(stm != null)
				stm.close();
			}if(conn != null)
				conn.close();
}
}
