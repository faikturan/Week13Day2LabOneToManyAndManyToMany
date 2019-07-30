package com.codeclan.example.personnelservice;

import com.codeclan.example.personnelservice.models.Department;
import com.codeclan.example.personnelservice.models.Employee;
import com.codeclan.example.personnelservice.repositories.DepartmentRepository;
import com.codeclan.example.personnelservice.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonnelserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void createEmployee(){
//		Employee sarab = new Employee("Sarabjeet", "Kaur", 12345);
//		employeeRepository.save(sarab);
//	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Sales");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Laura", "Sheach", 54321, department);
		employeeRepository.save(employee1);
	}

}
