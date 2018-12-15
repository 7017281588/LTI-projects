package com.lti.miscellaneous.exceptionhandling;

public class UncheckedExceptionHdlg {

	
	public static void main(String ar[])
	{
		try
		{
			String s=null;
			String s1="abc;";
			int i= Integer.parseInt(s1);
			System.out.println(s.length());
			
		}
		
	
		catch (NullPointerException ne){
			System.out.println("null hai baiiiiiiiiiiiii");
			
		//	System.out.println("Some Exception oyeeeeeee");
			
		}
		catch (Exception e){
			//System.out.println("0 se divide nhi hogga baiiiiiiiiiiiii");
			
			System.out.println("Some Exception oyeeeeeee");
			
		}
		System.out.println("code");
		System.out.println("code aur hai baii");
	} 
}
