package com.example.demo.services;

import com.example.demo.dto.Employee;
import com.example.demo.dto.Employees;

public interface EmployeeService {

    Employees getEmployees();

    Employee getEmployee(String id);

    void saveEmployee(Employee employee);



}
