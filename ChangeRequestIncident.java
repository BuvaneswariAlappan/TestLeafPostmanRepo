package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ChangeRequestIncident {
	
 // https://dev140572.service-now.com/api/now/table/incident?sysparm_fields=short_description&sysparm_input_display_value=Value%20of%20Short%20Description%20for%20rest%20assured%20Change%20%20request
	//Enter the Endpoint
	
	@Test
	public void changeIncident() {
		RestAssured.baseURI="https://dev53616.service-now.com/api/now/table/";
		
		// Give Authorization
		RestAssured.authentication=RestAssured.basic("admin", "P-qQ7@umSYz8");
		// Specify the header for content type and Add the request body --Form the request
		
		RequestSpecification body = RestAssured.given().contentType("application/json").body("{\r\n"
				+ "    \"rfc\": \"\"\r\n"
				+ "}");
		
		Response post = body.post("change_incident");
		post.prettyPrint();
	}

}
