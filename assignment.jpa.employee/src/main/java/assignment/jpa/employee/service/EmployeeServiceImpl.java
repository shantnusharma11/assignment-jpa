package assignment.jpa.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment.jpa.employee.entity.Employee;
import assignment.jpa.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

@Autowired	
private EmployeeRepository employeeRepository;
	
	@Override
	public String saveEmployee(Employee employee) {
		 employeeRepository.save(employee) ;
		 return "Employee add successfully";
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> getEmployeeNameBySalaryDesc(Long salary) {
		return employeeRepository.getEmployeeNameBySalaryDesc(salary);
	}

}
