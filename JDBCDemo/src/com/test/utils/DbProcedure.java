package com.test.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class DbProcedure {

	
		static Connection con;
		static CallableStatement stmt,stmt1;
		public static void main(String[] args) {
			try {
				int id=0;
				String name=null;
				float sal=0.0f;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("enter id to retrive");
				id=sc.nextInt();
				con=ConnectionManager.getConnection();
				stmt=con.prepareCall("{call retrievedata(?,?,?)}");
				stmt1=con.prepareCall("?=call sqrr(?)");
			
				stmt1.setInt(2, id);
				stmt1.registerOutParameter(1,Types.INTEGER);
			
				stmt.registerOutParameter(1, Types.VARCHAR);
				stmt.registerOutParameter(2, Types.FLOAT);
				stmt.execute();
				stmt1.execute();
				
				name=stmt.getString(1);
				sal=stmt.getFloat(2);
				System.out.println("name:"+name);
				System.out.println("salary:"+sal);
			}
			catch(SQLException sui) {
				sui.printStackTrace();
			}
	}

}
