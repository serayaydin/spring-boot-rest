package com.restapi.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.employee.model.Department;
import com.restapi.employee.model.Employee;
import com.restapi.employee.service.EmployeeServiceImpl;

/**
 * Created by sibelbayirli on 8/31/19.
 */
@RestController
@RequestMapping("/hr/api")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/greetings")
    public String hello(String name){
        return "Hello "+name;
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
        Employee emp = employeeService.getEmployee(id);
        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
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
    @PutMapping("/department")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
    	ResponseEntity<Department> response = new ResponseEntity<Department>(employeeService.saveDepartment(department), HttpStatus.CREATED);
        return response;
        
    }
}
