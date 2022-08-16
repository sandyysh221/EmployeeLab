package com.example.EmployeeTracking;

import com.example.EmployeeTracking.models.Employee;
import com.example.EmployeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("Sandy", 30, "sandy@email.com");
		employeeRepository.save(employee);
	}

}
