package assignment.jpa.employee.service;

import java.util.List;

import assignment.jpa.employee.entity.Employee;

public interface EmployeeService {

	public String saveEmployee(Employee employee);
    
	public List<Employee> fetchEmployeeList();

	public List<Employee> getEmployeeNameBySalaryDesc(Long salary);

	
}
