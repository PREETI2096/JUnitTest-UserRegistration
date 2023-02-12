package com.bridgelabz.junittest;

import java.util.regex.Pattern;

public class UserRegistration {

	public static final String VALIDATE_FIRST_NAME = "^[A-Z]{1}[a-zA-Z]{2,}$";
	public static final String VALIDATE_LAST_NAME = "^[A-Z]{1}[a-zA-Z]{2,}$";
	public static final String VALIDATE_EMAIL_ID = "^[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+";

	public Boolean checkFirstName(String firstName) {

		return (Pattern.matches(VALIDATE_FIRST_NAME, firstName));
	}

	public Boolean checkLastName(String lastName) {

		return (Pattern.matches(VALIDATE_LAST_NAME, lastName));
	}

	public Boolean checkEmailId(String emailId) {

		return (Pattern.matches(VALIDATE_EMAIL_ID, emailId));
	}
}
