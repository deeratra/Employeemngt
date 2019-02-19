package com.cts.employeemngt.service;

import java.util.List;

import com.cts.employeemngt.bean.Employee;
import com.cts.employeemngt.dao.EmployeeDAO;
import com.cts.employeemngt.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	@Override	
	
	public String addEmployee(Employee employee){
		// TODO Auto-generated method stub
		
		return employeeDAO.addEmployee(employee);	
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
