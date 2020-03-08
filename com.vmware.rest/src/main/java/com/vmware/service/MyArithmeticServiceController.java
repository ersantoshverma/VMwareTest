package com.vmware.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Santosh Verma
 *
 */
@RestController
@EnableWebSecurity
public class MyArithmeticServiceController {

	private final Logger LOG = LoggerFactory.getLogger(MyArithmeticServiceController.class);

	/**
	 * This method adds two values received from request payload and returns result.
	 * 
	 * @param request Request
	 * @return Response
	 */
	@PostMapping(value = "api/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response add(@RequestBody Request request) {
		LOG.info("Inside add method : START");

		int x = Integer.valueOf(request.getX());
		LOG.info("Value of first number provided by user : {}", x);
		int y = Integer.valueOf(request.getY());
		LOG.info("Value of second number provided by user : {}", y);
		long sum = x + y;
		LOG.info("Sum value : {}", sum);

		Response resp = new Response();
		resp.setResult(String.valueOf(sum));

		LOG.info("Inside add method : END");
		return resp;
	}

	/**
	 * This method calculates the diff of two values received from request payload
	 * and returns result.
	 * 
	 * @param request Request
	 * @return Response
	 */
	@PostMapping(value = "api/diff", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response diff(@RequestBody Request request) {
		LOG.info("Inside diff method : START");
		int x = Integer.valueOf(request.getX());
		LOG.info("Value of first number provided by user : {}", x);
		int y = Integer.valueOf(request.getY());
		LOG.info("Value of second number provided by user : {}", y);

		long diff = x - y;
		LOG.info("diff value : {}", diff);

		Response resp = new Response();
		resp.setResult(String.valueOf(diff));

		LOG.info("Inside diff method : END");
		return resp;
	}

	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck() {
		LOG.info("Calling getHealthCheck method");
		return "{ \"isWorking\" : true }";
	}
}
