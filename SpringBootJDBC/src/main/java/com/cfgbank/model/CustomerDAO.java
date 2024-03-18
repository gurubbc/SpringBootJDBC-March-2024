package com.cfgbank.model;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
@Repository
public class CustomerDAO extends JdbcDaoSupport{

	@Autowired
	DataSource dataSource; // declare a variable of DataSource type
	
	// define method in which you set the DataSource object
	
	// this annotaion will make sure that this method will be called
	// after the object creation
	@PostConstruct
	public void setDataSource() {
		System.out.println("Setting the data source object");
		setDataSource(dataSource); // method from superclass
	}
	
	public String addCustomer(Customer customer) {
		JdbcTemplate jdbcTemplate=getJdbcTemplate();
		// Write SQL query in case of spring jdbc 
		String sqlQuery="INSERT INTO CUSTOMER(CUST_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL_ID) VALUES(?,?,?,?,?)";
		int rowCount=jdbcTemplate.update(sqlQuery, new Object[] {customer.getCustId(), customer.getFirstName(), customer.getLastName(), customer.getPhoneNumber(), customer.getEmailId()});
		if (rowCount>0) {
			return "The customer object is persisted successfully into db table";
		} else {
			return "Some issues, not persisted";
		}
		
		
	
	}
}
