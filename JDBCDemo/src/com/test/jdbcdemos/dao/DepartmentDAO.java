package com.test.jdbcdemos.dao;

import java.util.List;

import com.lti.jdbcdemos.model.Department;

public interface DepartmentDAO  {

	
public void  addDepartment(Department department);
public void  updateDepartment(Department department);
public void  deleteDepartment(int dept_id);
public Department listDeptbyId(int dept_id);
public List<Department> listAllDepartment();

}
