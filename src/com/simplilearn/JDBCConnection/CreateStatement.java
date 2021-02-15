package com.simplilearn.JDBCConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stm = null;
		
		try {
			
			//Get connection
			conn = DBConnection.initConnection();
			//Create statement
			stm = conn.createStatement();
			
			//prepare query
			
			String query = "INSERT INTO employees(id, first_name, last_name, email, department, salary) "+
					"VALUES "+
					"(5,'Selva','Prakash', 'selva@gmail.com', 'HR', 150000.00),"+
					"(6,'Vishnu','Priya', 'vishnu@gmail.com', 'Tester', 200000.00)"; 
			//Execute query
			
			int result = stm.executeUpdate(query);	
			
			System.out.println("Employee details inserted successfully !!");
			System.out.println("No of rows affected"+result);
				
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(stm != null)
				stm.close();
		  	}if(conn !=null)
		  		conn.close();
	}
	}
