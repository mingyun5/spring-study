package org.study.demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	private String validHobbies;
	
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.validHobbies = isValidHobby.listOfValidHobbies();

	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {
		
		if(studentHobby.toLowerCase().matches(validHobbies)) {
			return true;
		}else {
			return false;
		}
	}

}
