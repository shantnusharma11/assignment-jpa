package assignment.jpa.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import assignment.jpa.employee.entity.Employee;
import assignment.jpa.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public String saveEmployee( @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee) ;
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> fetchEmployeeList(){
		return employeeService.fetchEmployeeList();
	}
	
	@GetMapping("/getEmployeesBySalary")
	public List<Employee> getEmployeeNameBySalaryDesc(Long salary){
		return employeeService.getEmployeeNameBySalaryDesc(salary);
	}
	
}
