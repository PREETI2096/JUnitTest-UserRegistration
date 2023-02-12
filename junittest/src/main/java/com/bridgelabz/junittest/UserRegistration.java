package com.bridgelabz.junittest;

import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validFirstName(String name) throws Exception {
		// firstName or lastName starts with Cap and has minimum 3 characters

		Pattern fName = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
		boolean isValid = fName.matcher(name).matches();

		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid first name " + name);
		}

	}

	public boolean validLastName(String name) throws Exception {
		// Validation for firstName or lastName is same
		boolean isValid = validFirstName(name);
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid last name" + name);
		}
	}

	public boolean validEmailId(String email) throws Exception {
		
		Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$");
		boolean isValid = pattern.matcher(email).matches();
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid email" + email);
		}
	}

	public boolean validPhoneNumber(String number) throws Exception {
		Pattern pattern = Pattern.compile("^[9][1][ ][6-9][0-9]{9}$");
		boolean isValid = pattern.matcher(number).matches();
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid phone number" + number);
		}
	}

	public boolean validPassword(String password) throws Exception {
		// password all rules 1 to 4
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])?.{8,}$");
		boolean isValid = pattern.matcher(password).matches();
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("password is invalid " + password);
		}
	}
}
