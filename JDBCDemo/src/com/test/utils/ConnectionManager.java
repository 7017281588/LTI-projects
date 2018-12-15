package com.test.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static Connection connection = null;
	
	
	private ConnectionManager()
	{
		
		
	}
	
	public static Connection getConnection() {
		
		String url=( "jdbc:oracle:thin:@localhost:1521:xe");
		String uname="hr";
		String pwd="hr";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. conn 
			connection =DriverManager.getConnection(url,uname,pwd);
		
	} catch (ClassNotFoundException e) {
		System.out.println("not found");
	}catch (SQLException e1 ) {
	e1.printStackTrace();
	}
		return connection;
		
	}
	public static void main(String[] args) {
		getConnection();
	}
	
	
	//Step : Register driver class
	
	
}
