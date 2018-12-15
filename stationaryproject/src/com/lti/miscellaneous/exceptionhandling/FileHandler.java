package com.lti.miscellaneous.exceptionhandling;
import java.io.*;

public class FileHandler {
	public static void main(String [] args) {
		int i;
		try( FileReader fr = new FileReader("c:\\mkg\\srish.png");
	FileOutputStream fw= new FileOutputStream("c:\\mkg\\srish.png"))
		{
			while((i =fr.read()) != -1)
			{
				System.out.print((char)i);
			//	fw.write(i);
				
			}	

	
		}
		
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("abcd");
		}
		//fr.close();
	}
}
