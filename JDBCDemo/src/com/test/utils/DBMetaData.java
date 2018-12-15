package com.test.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBMetaData {

	static Connection con = null;
	public static void main(String[] args) {
		{
			con =  ConnectionManager.getConnection();
			
			
			try {
				DatabaseMetaData metadata = con.getMetaData();
				String dbprod = metadata.getDatabaseProductName();
				int version = metadata.getDatabaseMajorVersion();
				
				ResultSet rs = metadata.getSchemas(); 
				
				
				while(rs.next()) {
					
					
					System.out.println("printing schemas..");
					
					String tableschema = rs.getString(1);
					
				//	String tablecatalog = rs.getString(2);
					System.out.println(tableschema);
					
				}
				
				rs = metadata.getCatalogs();
				
				while(rs.next())
				{
					System.out.println("Printing catalogs...");
					
					String catalog = rs.getString(1);
					String tablecatalog = rs.getString(2);
					System.out.println(catalog);
				}
				rs = metadata.getTableTypes();
				
				while(rs.next())
				{
					String tabletype = rs.getString(1);
					
					System.out.println(tabletype);
					
				}
				System.out.println("Printing column info of employee table");
				rs = metadata.getColumns(null,"HR","Employees","%name%");
			while(rs.next())	
			{
				String tablename = rs.getString("tablename");
				String colname = rs.getString("column_name");
			String datatype  = rs.getString("data_type");
			int nullable = rs.getInt("nullable");
					
					System.out.println(tablename + " " +colname + " " +datatype + " "+ nullable );
			}
						
			//metadata.getColumns();
				System.out.println(dbprod);
				System.out.println(version);
			
		}
			catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}
}
