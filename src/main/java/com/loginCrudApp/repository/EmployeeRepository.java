package com.loginCrudApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loginCrudApp.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
