package com.example.demo.services.impl;

import com.example.demo.dto.Employee;
import com.example.demo.dto.Employees;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employees getEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntitiesToEmployeesDto(employeeEntities);
    }

    @Override
    public Employee getEmployee(String id) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    // Entity TO DTO

    public Employees employeeEntitiesToEmployeesDto(List<EmployeeEntity> employeeEntities) {
        return Employees.builder()
                .employees(employeeEntities.stream()
                        .map(this::employeeEntityToEmployeeDto)
                        .collect(Collectors.toList()))
                .build();
    }

    public Employee employeeEntityToEmployeeDto(EmployeeEntity employeeEntity) {

        return Employee.builder()
                .id(employeeEntity.getId())
                .firstName(employeeEntity.getFirstName())
                .lastName(employeeEntity.getLastName())
                .cityName(employeeEntity.getCityEntity().getName())
                .cityCode(employeeEntity.getCityEntity().getCode())
                .build();
    }


}
