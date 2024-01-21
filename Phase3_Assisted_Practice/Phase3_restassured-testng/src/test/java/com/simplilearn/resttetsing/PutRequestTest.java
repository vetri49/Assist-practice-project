package com.simplilearn.resttetsing;


import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequestTest {
	private static final String BASE_URL="https://reqres.in/api";
	private static final Logger logger = Logger.getLogger(PutRequestTest.class);
	
	@Test(description="Test for executing Put request using rest assured")
	public void putRequestTest() {
		
		logger.info("Start :: Test for executing Put request using rest assured");
		String response=null;
		try {
		int userId=7;
		PostData postData=new PostData("Mike smith","QA Analyst");
		
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON).body(postData)
		.put("/users/"+userId).then().assertThat().statusCode(200).and()
		.assertThat().body("name", equalTo(postData.name)).and()
		.assertThat().body("job",equalTo(postData.job));
		 response=RestAssured.given().baseUri(BASE_URL).when()
				.contentType(ContentType.JSON)
				.body(postData)
				.post("/users").getBody().asString();
	}catch(Exception e) {
		logger.error("Exception Object :: "+e.toString());
		logger.error("End Exception :: "+e.getLocalizedMessage());
	}
		logger.info("Response Object ::"+response);
		
		
		logger.info("End :: Test for executing Put request using rest assured");
	}
	
	


}

