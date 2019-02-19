package com.cts.employeemngt.main;

import com.cts.employeemngt.bean.Employee;
import com.cts.employeemngt.service.EmployeeService;
import com.cts.employeemngt.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args)
	{
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = new Employee();
		
		String result = employeeService.addEmployee(employee);
		if("success".equals(result)){
			System.out.println("record added successfully");
			
		}
		else
		{
			System.out.println("not done");
		}
	}

}
