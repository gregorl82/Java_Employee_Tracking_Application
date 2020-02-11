package com.codeclan.example.EmployeesLab;

import com.codeclan.example.EmployeesLab.models.Department;
import com.codeclan.example.EmployeesLab.models.Employee;
import com.codeclan.example.EmployeesLab.models.Project;
import com.codeclan.example.EmployeesLab.repositories.DepartmentRepository;
import com.codeclan.example.EmployeesLab.repositories.EmployeeRepository;
import com.codeclan.example.EmployeesLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesLabApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveEmployee(){
		Project project = new Project("Black Hammer", 90);
		projectRepository.save(project);

		Department department = new Department("IT");
		departmentRepository.save(department);

		Employee employee = new Employee("David", "Brent", 432123, department);
		employeeRepository.save(employee);

		employee.addProject(project);

		employeeRepository.save(employee);
	}

}
