package com.example.assignment.service;

import java.util.List;

import com.example.assignment.entity.Employee;

public interface EmployeeServiceIntf {
	/*
	 * Save employee
	 */
	public Employee saveEmployee(Employee employee);
	
	/*
	 * Update Employee
	 */
	public Employee updateEmployee(int empId, Employee employee);
	
	/*
	 * list All employees
	 */
	public List<Employee> getEmployees();
}
