package com.lti.jdbcdemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.jdbcdemos.model.Department;
import com.test.jdbcdemos.dao.DepartmentDAOImpl;

public class DMLDept {
	static Department department = null;
	static DepartmentDAOImpl daoimpl = new DepartmentDAOImpl();
	
	public static void acceptDetails() {
		try {
		int id ,l_id, m_id;
		String dname;
		
		Scanner br1 = new Scanner(System.in);
		/*InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1= new BufferedReader(isr1);*/
		System.out.println("Enter department id :");
		id = br1.nextInt();
		System.out.println("Enter department name :");
		dname = br1.nextLine();
		br1.nextLine();
		System.out.println("Enter manager id :");	
		m_id = br1.nextInt();
		
		System.out.println("Enter department location_id :");
		l_id = br1.nextInt();
		
		
		department = new Department(id, dname,l_id,m_id);
		
	} catch(Exception ioe) {
		System.out.println("io error");
	}
		
		
	}
	public static void main(String[] args) {
		
		Department dep = new Department();
		int dept_id = 0;
		
		List<Department> listofdepts = new ArrayList<>();
		try {
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		int choice = 0;
		while(choice>=1 && choice <6)	
		{
	System.out.println("departments CRUD");
	System.out.println("1.add dept");
	System.out.println("2.update dept");
	System.out.println("3.delete dept");
	System.out.println("4.list all the dept");
	System.out.println("5.list by dept id");
	System.out.println("6.exitwa");

	System.out.println("Choose CRUD to be performed ");

//	try {
		choice  = sc.nextInt();
	//} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	
	switch(choice)
	{
	case  1 : acceptDetails(); 
		daoimpl.addDepartment(department);
	break;
	
	
	case 2 :	acceptDetails();
		daoimpl.updateDepartment(department);
		break;
		
	case 3: System.out.println("Enter dept to be deleted :");
	dept_id =br.read();
		daoimpl.deleteDepartment(dept_id);
		break;
		
	case 4: listofdepts = 	daoimpl.listAllDepartments();
	for(Department d : listofdepts)
	{
		System.out.println(d);
	}
	break;
	
	case 5:System.out.println("Enter dept to view :");
	dept_id = br.read();
		department  = daoimpl.listDeptbyId(dept_id);
		System.out.println(department);
	break;

	}
	}

}catch(IOException e)
		{
	e.printStackTrace();
		}
		}
}