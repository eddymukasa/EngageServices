package com.engage;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

public class WebServiceTester {

	private Client client;
	private String REST_SERVICE_URL = "http://localhost:8080/EngageServices/rest/SignupService/signups";
	private static final String SUCCESS_RESULT="<result>success</result>";
	private static final String PASS = "pass";
	private static final String FAIL = "fail";
	
	private void init(){
		this.client = ClientBuilder.newClient();
	}
	
	public static void main(String[] args){
		
		WebServiceTester tester = new WebServiceTester();
		
		tester.init();
		
		try{
		tester.testAddSignup();
		}catch(Exception ex){
			ex.printStackTrace();
			
			System.out.println();
		}
	}
	
	private void testAddSignup(){
		Form form = new Form();
		form.param("id", "22");
		form.param("region", "Engage");
		form.param("field2", "chess");
		
		String callResult = client.target(REST_SERVICE_URL).request(MediaType.APPLICATION_XML).put(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE),String.class);
		System.out.println(callResult);
		String result = PASS;
		if(!SUCCESS_RESULT.equals(callResult)){
			result = FAIL;
		}
		  System.out.println("Test case name: testAddSignup, Result: " + result );
	}
}
