package com.test.jdbcdemos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.lti.jdbcdemos.model.Department;
import com.test.utils.ConnectionManager;

public class DepartmentDAOImpl implements DepartmentDAO{
Connection connection = ConnectionManager.getConnection();

//String sql = ""
PreparedStatement ps = connection.PreparedStatement();
	@Override
	
	
	public void addDepartment(Department department) {
     String query  = "insert into departments values (?,?,?,?)" ;

try {
	
	ps = connection.prepareStatement(query);
	ps.setInt(1, department.getDepartment_id());
	ps.setString(2, department.getDepartment_name());
	ps.setInt(3, department.getLocation_id());
	ps.setInt(4, department.getManager_id());
	
	int retval = ps.executeUpdate();

	if (retval == 1)
	{
		System.out.println("Department added");
	}
	}catch(SQLException e){}
		
}
		
	

	@Override
	public void updateDepartment(Department department) {
		String query =  "update departments set department_name = ?,"+"location_id = ?"+
	"manager_id=? where department_id = ?" 
				
     ps = connection.prepareStatement(query);
		ps.setString(1, department.getDepartment_name());
		ps.setInt(2, department.getLocation_id());
		ps.setInt(3, department.getManager_id());
		ps.setInt(4, department.getDepartment_id());
		
		if(retval == 1)
		{
			
			System.out.println("Department added");
			return department;
		
	}

	@Override
	public void deleteDepartment(int dept_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> listAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public department listDeptbyId(int dept_id) {
		// TODO Auto-generated method stub
		return null;
	}

		@Override
	public List<Department> listAllDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
