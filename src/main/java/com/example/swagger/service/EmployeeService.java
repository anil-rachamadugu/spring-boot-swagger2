package com.example.swagger.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.swagger.model.Employee;

@Service
public class EmployeeService {
	List<Employee> employeeList = new ArrayList<Employee>();

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	public Employee findById(Long employeeId) {
		Employee employeeReturn = employeeList.stream()
				  .filter(employee -> employeeId == employee.getId())
				  .findAny()
				  .orElse(null);
		
		return employeeReturn;
	}

	public Employee save(@Valid Employee employee) {
		employeeList.add(employee);
		return employee;
	}

	public void delete(Employee employee) {
		employeeList.remove(employee);
	}

}
