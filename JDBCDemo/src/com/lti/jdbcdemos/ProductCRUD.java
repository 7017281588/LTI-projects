package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductCRUD {
public static void main(String[] args) {
	String url=( "jdbc:oracle:thin:@localhost:1521:xe");
	String uname="hr";
	String pwd="hr";
	Connection connection=null;
	Statement stmt=null;
	String query="select employee_id,first_name,salary,phone_number from employees";
	ResultSet rs;
	
	//1. step for driver class
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//2. conn obj
		connection =DriverManager.getConnection(url,uname,pwd);
		System.out.println(connection.toString());
		//3.creating stmt obj;
		stmt=connection.createStatement();
		
		//4.execute statement
		rs
		=stmt.executeQuery(query);
		//5.fetching results
		while(rs.next())
		{
			int id=rs.getInt(1);
			String proddesc= rs.getString(2);
			float price= rs.getFloat(3);
			String qoh= rs.getString(4);
			System.out.println(id+ " "+ proddesc+" "+price+ " " +qoh);
			
		}
	
	} catch (ClassNotFoundException e) {
		System.out.println("not found");
	}catch (SQLException e1 ) {
	e1.printStackTrace();
	}
}
}
