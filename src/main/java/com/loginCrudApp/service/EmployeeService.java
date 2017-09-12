package com.loginCrudApp.service;

import com.loginCrudApp.model.Employee;;

public interface EmployeeService {

	Iterable<Employee> listAllEmployees();
	Employee getEmployeeById(Integer id);
	Employee saveEmployee(Employee employee);
	
	void deleteEmployee(Integer id);
	
}
