package com.loginCrudApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loginCrudApp.model.Employee;
import com.loginCrudApp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
    /**
     * List all employees.
     *
     * @param model
     * @return
     */
	@RequestMapping(value = "/admin/home/employees", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("employees", employeeService.listAllEmployees());
		System.out.println("Returning remployees:");
		return "admin/home";
	}
	
    /**
     * View a specific employee by its id.
     *
     * @param id
     * @param model
     * @return
     */
	@RequestMapping(value = "/admin/home/employee/{id}")
	public String showEmployee(@PathVariable Integer id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "admin/employeeshow";
	}
	
    /**
     * Edit a specific employee by its id.
     *
     * @param id
     * @param model
     * @return
     */
	@RequestMapping(value = "/admin/home/employee/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "admin/employeeform";
	}
	
    /**
     * New employee.
     *
     * @param model
     * @return
     */
	@RequestMapping(value = "/admin/home/employee/new")
	public String newEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "admin/employeeform";
	}
	
	/**
     * Save employee to database.
     *
     * @param product
     * @return
     */
	@RequestMapping(value = "employee", method = RequestMethod.POST)
	public String saveEmployee(Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/admin/home/employee/" + employee.getId();
	}
	
	/**
     * Delete employee by its id.
     *
     * @param id
     * @return
     */
	@RequestMapping(value = "/admin/home/delete/{id}")
	public String delete(@PathVariable Integer id) {
		employeeService.deleteEmployee(id);
		return "redirect:/admin/home";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

}
