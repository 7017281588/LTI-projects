package com.lti.miscellaneous;

import java.io.*;
import java.time.LocalDate;

public class TestCitizen {

 public static void main(String ar[])
 {
	 
	 try( FileInputStream fis=
			 new FileInputStream("c:\\mkg\\uttu.txt");
			ObjectInputStream ois=
					 new ObjectInputStream(fis))
			
/*	 ObjectInputStream oos= new ObjectInputStream(fos));
	 ObjectInputStream ois=new ObjectInputStream(fis))*/
	 
			 {
				 Citizen citizen= (Citizen)ois.readObject();
				 citizenlist.add(citizen);
				 System.out.println(citizen);
			 }
	 

	Citizen [ ] citizen= {citizen1,citizen2,citizen3};
	 try( FileOutputStream fos=
			 new FileOutputStream("c:\\mkg\\uttu.txt");
			 FileInputStream fis=
					 new FileInputStream("c:\\mkg\\uttu.txt");
			
	 ObjectOutputStream oos= new ObjectOutputStream(fos));
	 ObjectInputStream ois=new ObjectInputStream(fis))
	 
	 {
		 oos.writeObject(citizen1);
		 oos.writeObject(citizen2);
		 oos.writeObject(citizen3);
	 }
					 catch(Exception e){}
	 { oos.writeObject(citizen1);
			 oos.writeObject(citizen2);
			 }
	 Address address1 = new Address("The Address1", "MGM Rd1", "Mumbai1",4000011);
	 Address address2 = new Address("The Address2", "MGM Rd2", "Mumbai2",4000012);
	 Address address3 = new Address("The Address3", "MGM Rd3", "Mumbai3",4000013);
	 
	 LocalDate date1 = LocalDate.of(2, 10, 2001);
	 LocalDate date2 = LocalDate.of(2, 10, 2002); 
	 LocalDate date3 = LocalDate.of(2, 10, 2003);

	 Citizen citizen1 = new Citizen("1111_3232_1212", "amit",address1,date1);
	 
		System.out.println(citizen1);
		date1.plusMonths(5);
		
		Citizen citizen2 = new Citizen("1111_3232_1214", "srishti",address2, date2);
		date1.minusYears(5);
		System.out.println(citizen2);
		
		
		Citizen citizen3 = new Citizen("1111_3232_1216", "utsav",address3, date3);
		System.out.println(citizen3);
		
 }
	
}
