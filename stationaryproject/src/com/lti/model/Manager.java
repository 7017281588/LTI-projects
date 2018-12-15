package com.lti.model;

import java.time.LocalDate;

public class Manager extends Employee {
	private String department_name;

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
	
	
	
	public Manager() {
		//super();
		
	}

	public Manager(int id, String name, float salary, LocalDate doj) {
		super(id, name, salary, doj);
		// TODO Auto-generated constructor stub
	}

	public Manager(Employee e, String dname)
	{
			this.id=e.id;
			this.name=e.name;
			this.salary=e.salary;
			this.doj=e.doj;
			this.department_name=dname;
	}

	public Manager(int id, String name, float salary, LocalDate doj, String department_name) {
		super(id, name, salary, doj);
		this.department_name = department_name;
	}

	@Override
	public String toString() {
		return "Manager [department_name=" + department_name + "]";
	}
	
	
	public void greeting()
	{
		System.out.println("hello manager");
	}
	
}
