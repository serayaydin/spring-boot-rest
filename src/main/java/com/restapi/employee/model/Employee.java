package com.restapi.employee.model;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sibelbayirli on 8/31/19.
 */
@Entity
@Data
public class Employee {
    String name;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String department;
}
