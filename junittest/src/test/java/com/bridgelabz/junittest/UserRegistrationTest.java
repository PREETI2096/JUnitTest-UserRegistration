package com.bridgelabz.junittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
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
	public void given_first_name_should_returnTrue() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validFirstName("Preeti");
		Assertions.assertEquals(result,true);
	}
	@Test
	public void given_first_name_should_returnFalse() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validFirstName("preeti");
		Assertions.assertEquals(result,false);
	}
	
	@Test
	public void given_last_name_should_returnTrue() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validLastName("Ghatage");
		Assertions.assertEquals(result,true);
	}
	@Test
	public void given_last_name_should_returnFalse() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validLastName("gha");
		Assertions.assertEquals(result,false);
	}
	@Test
	public void given_email_id_should_returnTrue() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validEmailId("pree12@gmail.com");
		Assertions.assertEquals(result,true);	
	}
	@Test
	public void given_email_id_should_returnFalse() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validEmailId("pree.mail.gmail.com");
		Assertions.assertEquals(result,false);	
	}
   @Test
  public  void given_phone_number_should_returnTrue() throws UserRegistrationException {
	   UserRegistration user = new UserRegistration();
		Boolean result = user.validPhoneNumber("91 8553266354");
		Assertions.assertEquals(result,true);	
   }
   @Test
   public  void given_phone_number_should_returnFalse() throws UserRegistrationException {
 	   UserRegistration user = new UserRegistration();
 		Boolean result = user.validPhoneNumber("8553266354");
 		Assertions.assertEquals(result,false);	
    }
	@Test
	public void given_password_should_returnTrue() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validPassword("Srikrishna@34");
		Assertions.assertEquals(result,true);		
	}
	@Test
	public void given_password_should_returnFalse() throws UserRegistrationException {
		UserRegistration user = new UserRegistration();
		Boolean result = user.validPassword("sr34");
		Assertions.assertEquals(result,false);		
	}
	  @Parameterized.Parameters
	    @ValueSource(strings = {"Abc@yahoo.com","abc@gmail.com.com",})
	    public void givenEmailWhenValidShouldReturnTrue(String email) throws UserRegistrationException {
		  UserRegistration user = new UserRegistration();
	        Assertions.assertTrue(user.validEmailId(email));
	    }
	  @Parameterized.Parameters
	    @ValueSource(strings = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc@%*.com",})
	    public void givenEmailWhenInValidShouldReturnFalse(String email) throws UserRegistrationException {
		  UserRegistration user = new UserRegistration();
	        Assertions.assertFalse(user.validEmailId(email));
	    }
}
