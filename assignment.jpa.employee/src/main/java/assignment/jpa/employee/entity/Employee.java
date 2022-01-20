package assignment.jpa.employee.entity;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	//@NotBlank(message="Please add employee name")
	private String name;
	private Long salary;
	
}
