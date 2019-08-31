package com.restapi.employee.service;

import com.restapi.employee.model.Employee;
import com.restapi.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sibelbayirli on 8/31/19.
 */
@Service
@Transactional
public class EmployeeServiceImpl{
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
       return employeeRepository.save(employee);
    }

    public Employee getEmployee(Employee employee){
        return employeeRepository.;
    }
}
