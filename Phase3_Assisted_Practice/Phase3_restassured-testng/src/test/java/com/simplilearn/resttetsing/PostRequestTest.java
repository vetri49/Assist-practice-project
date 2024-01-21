package com.simplilearn.resttetsing;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequestTest {
	private static final String BASE_URL="https://reqres.in/api";
	private static final Logger logger = Logger.getLogger(PostRequestTest.class);
	
	@Test(description="Test for executing Post request using rest assured")
	public void postRequestTest() {
		logger.info("Start :: Test for executing Post request using rest assured");
		String response=null;
		try {
		PostData postData=new PostData("Mike smith","Dermotologist");
		
		logger.info("Request Object :;"+postData);
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON).body(postData)
		.post("/users").then().assertThat().statusCode(201).and()
		.assertThat().body("name", equalTo(postData.name)).and()
		.assertThat().body("job",equalTo(postData.job));
		response=RestAssured.given().baseUri(BASE_URL).when()
				.contentType(ContentType.JSON)
				.body(postData)
				.post("/users").getBody().asPrettyString();
		}catch(Exception e) {
			logger.error("Exception Object :: "+e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
			logger.info("Response Object ::"+response);			
			logger.info("End :: Test for executing Post request using rest assured");
		}
	}
	
	
class PostData{
	public final String name;
	public final String job;
	public PostData(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
}
 