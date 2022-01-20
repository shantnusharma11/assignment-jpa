package assignment.jpa.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import assignment.jpa.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> , PagingAndSortingRepository<Employee,Long>{

	//@Query("SELECT e FROM Employee e where e.name ORDER BY e.salary DESC")
	
	@Query(value="SELECT e FROM Employee e  ORDER BY e.salary DESC",
			nativeQuery=true
			)
	List<Employee> getEmployeeNameBySalaryDesc(Long salary);

	

	
}
