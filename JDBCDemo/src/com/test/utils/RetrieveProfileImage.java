package com.test.utils;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class RetrieveProfileImage {
int ctr = 0;
static Connection con;
static CallableStatement stmt,stmt1;

static ResultSet rs;
public static void main(String[] args) {

	con = ConnectionManager.getConnection();
	
	
	

	String query  = "select * from profile";
	stmt =con.CreateStatement();
	
	rs=stmt.executeQuery();
	
	FileOutputStream fos=new FileOutputStream("c:\\mkg\\outputimg.png");
	while(rs.next())
	{
		Blob img=rs.getBlob(3);
		byte[] b=img.getBytes(1,(int)img.length());
		fos.write(b);
	}
	System.out.println("image retrieved");
}
//catch(SQLException su ) {}

	
}

