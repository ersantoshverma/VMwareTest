package com.vmware.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * 
 * @author Santosh Verma
 *
 */
@SpringBootApplication
@EnableWebSecurity
public class MyArithmeticApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyArithmeticApplication.class, args);
	}

}
