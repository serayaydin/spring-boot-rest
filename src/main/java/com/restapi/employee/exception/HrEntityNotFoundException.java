package com.restapi.employee.exception;

import javax.persistence.EntityNotFoundException;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author nozturk
 *
 */
@Data
@EqualsAndHashCode (callSuper = false)
public class HrEntityNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String entity;
	public HrEntityNotFoundException(String entity, int id) {
		super(entity+" with id " +id +" not found");
		this.entity = entity;
		this.id = id;
	}
	
	
   
}
