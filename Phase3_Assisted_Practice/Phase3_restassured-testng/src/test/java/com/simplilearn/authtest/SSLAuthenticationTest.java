package com.simplilearn.authtest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class SSLAuthenticationTest {
	
	private static final String BASE_URL = "https://dummyjson.com/auth";
	private static final String BASE_URL2 = "http://www.bupa.com.au";
	private static final Logger logger = Logger.getLogger(SSLAuthenticationTest.class);
	
	@Test(description="Test SSL Certificate for HTTPs")
	public void testSSlAuthenticate1() {
		logger.info("Start :: Test SSL Certificates for HTTPs");
		logger.info("POST :: URL "+BASE_URL+"/login");
		try {
		RestAssured.given().baseUri(BASE_URL)
		.relaxedHTTPSValidation()
		.when().get("/login")
		.then()
		.statusCode(403);
		}catch(Exception e) {
			logger.error("Exception Object :: "+e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		logger.info("End :: Test SSL Certificates for HTTPs");
	}
	@Test(description="Test SSL certificate for HTTP")
	public void testSSLAuthenticate() {
		logger.info("Start :: Test2 SSL Certificates for HTTPs");
		logger.info("POST :: URL "+BASE_URL2+"/");
		try {
		RestAssured.given()
		.baseUri(BASE_URL2)
        .relaxedHTTPSValidation()
        .when().get("/")
        .then()
        .statusCode(200);
	}catch(Exception e) {
		logger.error("Exception Object :: "+e.toString());
		logger.error("End Exception :: "+e.getLocalizedMessage());
	}
		
		
		
		logger.info("End :: Test2 SSL Certificates for HTTPs");
	
	}

}
