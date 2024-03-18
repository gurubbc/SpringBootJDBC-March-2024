package com.cfgbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfgbank.model.Customer;
import com.cfgbank.model.CustomerDAO;

@Service
public class CustomerService {
	@Autowired
	CustomerDAO customerDAO;
	
	public String insertARow(Customer customer) {
		return customerDAO.addCustomer(customer);
	}
}
