package com.npntraining.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npntraining.model.Employee;

@RestController
@EnableAutoConfiguration
public class EmployeeController {

	@RequestMapping("/employees")
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Manoj"));
		employees.add(new Employee(2, "Kumar"));

		return employees;
	}

}
