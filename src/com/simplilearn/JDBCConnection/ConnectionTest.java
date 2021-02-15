package com.simplilearn.JDBCConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/emsystem";
		String username = "root";
		String password = "root";
		
		try {
			//Step1: Register Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Step2 : Create /get Connection
			DriverManager.getConnection(url,username,password);
			System.out.println("DB connection Successful !");
			
		} catch (SQLException e) {
			String getMessage = null;
			System.out.println("DB connection Failure !" +getMessage);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			
		}

	}

}
