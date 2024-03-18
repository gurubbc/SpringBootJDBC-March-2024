package com.cfgbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JDBCMainApp {

	public static void main(String[] args) {
		SpringApplication.run(JDBCMainApp.class, args);
		System.out.println("JDBC TEMPLATE STARTED...");

	}

}
