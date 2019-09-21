package com.restapi.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.employee.exception.HrEntityNotFoundException;
import com.restapi.employee.model.Department;
import com.restapi.employee.model.Employee;
import com.restapi.employee.repository.DepartmentRepository;
import com.restapi.employee.repository.EmployeeRepository;

/**
 * Created by sibelbayirli on 8/31/19.
 */
@Service
@Transactional
public class EmployeeServiceImpl{
    @Autowired
    EmployeeRepository employeeRepository;
    
    @Autowired
    DepartmentRepository departmentRepository;

    public Employee saveEmployee(Employee employee){
    	//TODO handle inexistent department id case
       return employeeRepository.save(employee);
    }

    public Employee getEmployee(Integer id){
    	Optional<Employee> employee = employeeRepository.findById(id);
    	if(!employee.isPresent()) {
    		throw new HrEntityNotFoundException("Emloyee", id);
    	}
        return employee.get();
    }

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}
}
