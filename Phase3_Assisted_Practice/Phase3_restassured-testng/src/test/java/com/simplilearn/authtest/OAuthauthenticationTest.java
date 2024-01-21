package com.simplilearn.authtest;

import static org.hamcrest.CoreMatchers.*;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.simplilearn.data.model.UserInfo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class OAuthauthenticationTest {
	
private static final String BASE_URL = "https://dummyjson.com/auth";
private static final Logger logger = Logger.getLogger(OAuthauthenticationTest.class);
	
	@Test(description = "Test Login with rest assured")
	public void testAuthenticationToken() { 
		logger.info("Start :: Authentication with rest assured");
		logger.info("POST :: URL"+BASE_URL+"/login" );
	UserInfo user=new UserInfo("kminchelle","0lelplR");
	logger.info("Request Object :: "+user);
	RestAssured.given().baseUri(BASE_URL).when()
	.contentType(ContentType.JSON)
	.body(user)
	.log().uri()  
	.post("/login").then()
	.log().body()  // response logs
	.assertThat().statusCode(200).and()
	.assertThat().body ("id", notNullValue()).and()
	.assertThat().body ("token", notNullValue());
	
	String response = RestAssured.given().baseUri(BASE_URL).when()
			.contentType(ContentType.JSON)
			.body(user)
			.post("/register").getBody().asPrettyString();
	logger.info("Response Object :: "+response);
	logger.info("End :: Authentication with rest assured");

}
	
	@Test(description = "Get the current user")
	public void testAuthenticationBasedOnCredsToken() {
		
		logger.info("Start :: Get the current user from token");
		logger.info("POST :: URL"+BASE_URL+"/me" );
		String response="";
		try {
		UserInfo user=new UserInfo("kminchelle","0lelplR");	
		
		
		response = RestAssured.given().baseUri(BASE_URL).when()
				.contentType(ContentType.JSON)
				.body(user)
				.post("/register").getBody().asPrettyString();
		
		JsonPath jsonobj=new JsonPath(response);
		String Token=jsonobj.getString("token");
		logger.info("Request Object :: "+Token);

	
	RestAssured.given().baseUri(BASE_URL).when()
	.contentType(ContentType.JSON)
	.header("Authorization", "Boaror"+Token)
	.body(user)
	.log().uri()  
	.post("/login").then()
	.log().body()  // response logs
	.assertThat().statusCode(200).and().assertThat().body("id", notNullValue()).and().assertThat()
	.body("username", notNullValue()).and().assertThat().body("username", equalTo("kminchelle")).and()
	.assertThat().body("email", equalTo("kminchelle@qq.com"));
		}catch(Exception e) {
			logger.error("Exception Object :: "+e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		logger.info("Response Object :: "+response);
		logger.info("End :: Get the current user from token");
}
}