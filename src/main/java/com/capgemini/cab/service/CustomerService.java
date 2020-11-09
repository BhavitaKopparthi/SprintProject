package com.capgemini.cab.service;

import java.util.ArrayList;
import com.capgemini.cab.dto.Cab;
import com.capgemini.cab.dto.Customer;
import com.capgemini.cab.dto.Driver;
import com.capgemini.cab.dto.RideBooking;

public interface CustomerService  {
		
	/*
	 * Author: Bhavita
	 * Description: It contains abstract method called customerLogin()
	 */
	public String customerLogin(Customer customer);
	
	/*
	 * Author: Bhavita
	 * Description: It contains abstract method addCustomer()
	 */
	
	public String addCustomer(Customer customer);
	
	/*
	 * Author: Bhavita
	 * Description: contains abstract method called bookingHistoryCustomers()
	 */
	
	public ArrayList<RideBooking>  bookingHistoryCustomers();
	
	/*
	 * Author: Rishitha
	 * Description: contains abstract method called finalFare()
	 */
	
	public float finalFare();
	/*
	 * Author: Rishitha
	 * Description: contains abstract method called cabDetails()
	 */
	
	public ArrayList<Cab> cabDetails();
	/*
	 * Author: Rishitha
	 * Description: contains abstract method called driverDetails()
	 */
	public ArrayList<Driver> driverDetails();
}