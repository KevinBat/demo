package com.example.demo.controller;

import com.example.demo.dto.Employee;
import com.example.demo.dto.Employees;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/employees")
    public ResponseEntity<Employees> getEmployees() {

        Employees employees = employeeService.getEmployees();

        return ResponseEntity.ok(employees);
    }

    @GetMapping(value = "/employee")
    public ResponseEntity<Employee> getEmployee(@RequestParam(value = "employeeId") String employeeId) {
        //TODO Recupère un employé
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }


    @PostMapping(value = "/employee")
    public ResponseEntity<Void> postEmployee(@RequestBody Employee employee) {
        //TODO Creation d'un employé
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }


}
