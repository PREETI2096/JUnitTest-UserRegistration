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
	void given_email_id_should_returnTrue1() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc@yahoo.com,");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue2() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc-100@yahoo.com");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue3() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc.100@yahoo.com");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue4() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc111@abc.com");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue5() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc-100@abc.net");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue6() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc.100@abc.com.au");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue7() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc@1.com,");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue8() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc@gmail.com.com");
		Assertions.assertEquals(result, true);
	}
	@Test
	void given_email_id_should_returnTrue9() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("abc+100@gmail.com");
		Assertions.assertEquals(result, true);
	}
	
}
