package com.example.demo.controller;

import com.example.demo.dto.Employee;
import com.example.demo.dto.Employees;
import com.example.demo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(value = "/employees")
    public ResponseEntity<Employees> getEmployees() {

        Employees employees = demoService.getEmployees();

        return ResponseEntity.ok(employees);
    }

    @GetMapping(value = "/employee")
    public ResponseEntity<Employees> getEmployee(@RequestParam(value = "employeeId") String employeeId) {
        //TODO Recupère un employé
        return null;
    }


    @PostMapping(value = "/employee")
    public ResponseEntity<Employees> postEmployee(@RequestBody Employee employee) {
        //TODO Creation d'un employé
        return null;
    }

}
