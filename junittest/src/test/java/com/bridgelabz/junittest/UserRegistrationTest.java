package com.bridgelabz.junittest;

import org.junit.jupiter.api.AfterAll;
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
		System.out.println("Passed Test Case");
	}
	@AfterAll
	static void displayEnd() {
		System.out.println("----END-----");
	}
	@Test
	public void given_first_name_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkFirstName("Preeti");
		Assertions.assertEquals(result,true);
	}
	@Test
	public void given_first_name_should_returnFalse() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkFirstName("preeti");
		Assertions.assertEquals(result,false);
	}
	
	@Test
	public void given_last_name_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkLastName("Ghatage");
		Assertions.assertEquals(result,true);
	}
	@Test
	public void given_last_name_should_returnFalse() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkLastName("gha");
		Assertions.assertEquals(result,false);
	}
	@Test
	public void given_email_id_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("pree12@gmail.com");
		Assertions.assertEquals(result,true);	
	}
	@Test
	public void given_email_id_should_returnFalse() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("pree.mail.gmail.com");
		Assertions.assertEquals(result,false);	
	}
   @Test
  public  void given_phone_number_should_returnTrue() {
	   UserRegistration user = new UserRegistration();
		Boolean result = user.checkPhoneNumber("91 8553266354");
		Assertions.assertEquals(result,true);	
   }
   @Test
   public  void given_phone_number_should_returnFalse() {
 	   UserRegistration user = new UserRegistration();
 		Boolean result = user.checkPhoneNumber("8553266354");
 		Assertions.assertEquals(result,false);	
    }
	@Test
	public void given_password_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.password("Srikrishna@34");
		Assertions.assertEquals(result,true);		
	}
	@Test
	public void given_password_should_returnFalse() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.password("sr34");
		Assertions.assertEquals(result,false);		
	}
}
