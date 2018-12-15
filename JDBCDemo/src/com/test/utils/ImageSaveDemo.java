package com.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ImageSaveDemo {
static Connection con;
static PreparedStatement ps;

	public static void main(String[] args) {
		
		try {
				Scanner sc = new Scanner(System.in);
		String query = "insert into profile values(?,?,?,?)";
		con = ConnectionManager.getConnection();
		
		//accepting data for table
		System.out.println("Entyer Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		
		String name = sc.nextLine();
		System.out.println("Enter path of the photoua...");
		
		String filename = sc.nextLine();
		
		try {
			FileInputStream fis = new FileInputStream(filename);
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 										}
		
		//jdbc
		
		ps = con.prepareStatement(query);
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setBinaryStream(3,fis);

		int retval  = ps.executeUpdate();
		
		if(retval == 1)
		{
			
		System.out.println("Profile added ..");
		}
		catch(Exception e1) {}
		}
	}
		

