package com.restapi.employee.enumaration;


/**
 * @author nozturk
 *
 */
public enum Gender {
	FEMALE("F"),
	MALE("M");
	
	
	public final String label;

	private Gender(String label) {
		this.label = label;
	}
	
}
