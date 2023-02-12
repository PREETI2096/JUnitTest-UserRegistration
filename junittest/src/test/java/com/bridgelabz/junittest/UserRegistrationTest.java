package com.bridgelabz.junittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
	@BeforeAll
	static void display() {
		System.out.println("Welcome to User Registration Testing Program");
	}
		@AfterEach
		public void afterDisplay() {
			System.out.println("End");
		}
		
		@Test
		void given_first_name_should_returnTrue() {
			UserRegistration user = new UserRegistration();
			Boolean result = user.checkFirstName("Preeti");
			Assertions.assertEquals(result,true);
		}
}
