package com.cfgbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cfgbank.model.Customer;
import com.cfgbank.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;

	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public String addACustomer(@RequestBody Customer customer) {
		return cs.insertARow(customer);
	}
}
