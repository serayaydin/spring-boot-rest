package com.restapi.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.employee.model.Department;

/**
 * @author nozturk
 *
 */

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
