package com.bridgelabz.junittest;

import java.util.regex.Pattern;

public class UserRegistration {
	
public static final String VALIDATE_FIRST_NAME= "^[A-Z]{1}[a-zA-Z]{2,}$";

	public Boolean checkFirstName(String firstName) {
		// TODO Auto-generated method stub
		return (Pattern.matches(VALIDATE_FIRST_NAME, firstName));
	}

}
