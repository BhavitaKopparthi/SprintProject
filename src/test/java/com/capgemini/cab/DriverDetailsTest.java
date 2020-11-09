package com.capgemini.cab;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.cab.dto.Cab;
import com.capgemini.cab.dto.Customer;
import com.capgemini.cab.dto.Driver;
import com.capgemini.cab.repository.CabRepository;
import com.capgemini.cab.repository.DriverRepository;
import com.capgemini.cab.service.DriverServiceImpl;

//Annotation that can be specified on a test class that runs Spring Boot based tests
@SpringBootTest
public class DriverDetailsTest {
	
	@Autowired
	DriverServiceImpl driverServiceImpl;
	
	@MockBean
	DriverRepository driverRepository;
	
	@MockBean
	CabRepository cabRepository;
	Driver driver=new Driver();
	Customer cus=new Customer();
	 /*
	 * Author: Bhavita
	 * Description: It is used to test the driver details()
	 */
	@Before
	public void Beforetest1() {
	        driver.setDriverid("502");
	        driver.setDriverfirstname("Ajay");
	        driver.setDriverlastname("Lakavath");
	        driver.setContact("2491254937");
	        driver.setCabnumber("TS 09 MD 7987");
	        driver.setUsername("ajay");
	        driver.setPassword("Ajay@123");
	}
	 @Test
	    public void savedriverdetailsTest1() 
	   {
	        when(driverRepository.save(driver)).thenReturn(driver);
	    }
	 
	 @After
	 public void afterTest1() {
	      System.gc();
	}
	
	 @Test
	 public void cabDetailsTest()
	 {
		 List<Cab> cab=new ArrayList<Cab>();
		when(cabRepository.findAll()).thenReturn(cab);	
	 }
	 @Test
	 public void driverDetailsTest()
	 {
		 List<Driver> driver=new ArrayList<Driver>();
		when(driverRepository.findAll()).thenReturn(driver);	
	 }
	 
	 @After
	 public void afterall2() {
	      System.gc();
	}
}
