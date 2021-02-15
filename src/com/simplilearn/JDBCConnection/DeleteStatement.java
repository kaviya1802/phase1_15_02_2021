package com.simplilearn.JDBCConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		Statement stm = null;

		try {
			
			//Step  : get connection
			
			conn = DBConnection.initConnection();
			
			//prepare statement
			
			stm = conn.createStatement();
			
			//execute query
			String query = "DELETE FROM employees where id = 1";
			int result = stm.executeUpdate(query);
			
			System.out.println("Employee details deleted successfully !!");
			System.out.println("No of rows affected"+result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(stm !=null)
				stm.close();
		}if(conn != null)
			conn.close();
	}

}
