package com.capgemini.cab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.cab.dto.Customer;
import com.capgemini.cab.repository.CustomerRepository;
import com.capgemini.cab.service.CustomerServiceImpl;

//Annotation that can be specified on a test class that runs Spring Boot based tests
@SpringBootTest
public class CustomerLoginTest {
	
	//Annotation that can be used to add mocks to a Spring 
	//mock is an object which tests the dummy data that we pass
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@MockBean
	CustomerRepository customerRepository;
	
	 Customer customer=new Customer();
	 //causes that method to be run before the test
	 
	 /*
		 * Author: Bhavita
		 * Description: It is used to test the customerLogin()
		 */
	@Before
	public void Beforetest1() {
		customer.setUsername("Bhavita");
		customer.setPassword("reddy@123");
	}
	// used to signal that the annotated method is a test method
	@Test
	public void loginTest1()
	{                                                                                                                
		/*
		 * Customer customer=new Customer(); customer.setUsername("godhadevi");
		 * customer.setPassword("godhai@123");
		 */
		//The Mockito library enables mock creation, verification.
		Mockito.when(customerRepository.existsByUsername("bhavita")).thenReturn(true);
		Mockito.when(customerRepository.existsByPassword("bhavita123")).thenReturn(false);
		assertEquals("Invalid", customerServiceImpl.customerLogin(customer));
	}
	@After 
	 public void afterTest1() {
	      System.gc();
	 }
	@Before
	public void Beforetest2() {
		customer.setUsername("Bhavita");
		customer.setPassword("reddy@123");
	}
	
	// used to signal that the annotated method is a test method
	@Test
	public void loginTest2()
	{
		//The Mockito library enables mock creation, verification.
		Mockito.when(customerRepository.existsByUsername("bhavitareddy")).thenReturn(false);
		Mockito.when(customerRepository.existsByPassword("bhavita@123")).thenReturn(true);
		assertEquals("Invalid", customerServiceImpl.customerLogin(customer));
	}
	
	// used to signal that the annotated method is a test method
	@Before
	public void Beforetest3() {
		customer.setUsername("Bhavita");
		customer.setPassword("reddy@123");
	}
	@Test
	public void loginTest3()
	{
		//The Mockito library enables mock creation, verification.
		Mockito.when(customerRepository.existsByUsername("bhavi")).thenReturn(false);
		Mockito.when(customerRepository.existsByPassword("Reddy@123")).thenReturn(false);
		assertEquals("Invalid", customerServiceImpl.customerLogin(customer));
	}
	 @After 
	 public void afterTest3() {
	      System.gc();
	 }
	 

}