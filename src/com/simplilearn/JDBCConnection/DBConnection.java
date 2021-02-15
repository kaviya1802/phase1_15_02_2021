package com.simplilearn.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

		static String url = "jdbc:mysql://localhost:3306/emsystem";
		static String username = "root";
		static String password = "root";
		static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

		public static Connection initConnection() {
		
		Connection conn = null;
		
		try {
		
			// Create /get Connection
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("DB connection Successful !");
			
		} catch (SQLException e) {
			String getMessage = null;
			System.out.println("DB connection Failure !" +getMessage);
		}
		return conn;
	}

}
