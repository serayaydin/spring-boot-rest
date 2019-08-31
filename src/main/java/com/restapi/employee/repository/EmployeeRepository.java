package com.restapi.employee.repository;

import com.restapi.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sibelbayirli on 8/31/19.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
