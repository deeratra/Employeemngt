package com.cts.employeemngt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cts.employeemngt.bean.Employee;
import com.cts.empolyeemngt.utils.DBUtils;


public class EmployeeDAOImpl implements EmployeeDAO {
	

	@Override
	public String addEmployee (Employee employee) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparestatement = null;
		ResultSet rs = null;
		String insertStatement = "insert into employee" + "values(?,?,?,?)";
		
		
		connection= DBUtils.getConnection();
		
		try {
			connection.setAutoCommit(true);
			preparestatement = connection.prepareStatement(insertStatement);
			preparestatement.setString(1,employee.getEmployeeId());
			preparestatement.setString(2,employee.getFirstName());
			preparestatement.setString(3,employee.getLastName());
			preparestatement.setFloat(4, employee.getSalary());
			
			int res = preparestatement.executeUpdate();
			return "success";
			
		} catch (SQLException e) {			
			// TODO: handle exception
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			return "fail";
		}
		finally{
			DBUtils.closeConnection(connection);
		}
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
