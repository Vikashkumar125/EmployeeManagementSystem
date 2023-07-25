package net.employeemanagement.springboot.service;

import java.util.List;

import net.employeemanagement.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);


}
