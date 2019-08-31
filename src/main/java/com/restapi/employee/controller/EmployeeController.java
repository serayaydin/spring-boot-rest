package com.restapi.employee.controller;

import com.restapi.employee.model.Employee;
import com.restapi.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sibelbayirli on 8/31/19.
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/greetings")
    public String hello(String name){
        return "Hello "+name;
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
        Employee emp = employeeService.g
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        ResponseEntity<Employee> emp = new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
        return emp;
    }

    @PatchMapping("/employee")
    public String saveEmployee(Integer id){
        return "Hello ";
    }

    @DeleteMapping("/employee")
    public String deleteEmployee(Integer id){
        return "Hello ";
    }
}
