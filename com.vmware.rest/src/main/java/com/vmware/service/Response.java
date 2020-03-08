package com.vmware.service;

/**
 * 
 * @author Santosh Verma
 *
 */
public class Response {
	private String result;

	public Response() {

	}

	public Response(String result) {
		super();
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public String setResult(String result) {
		this.result = result;
		return this.result;
	}

}