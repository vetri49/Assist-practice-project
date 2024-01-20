package com.simplilearn.resttetsing;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteRequestTest {
	
	private static final String BASE_URL="https://reqres.in/api";
	
	@DataProvider(name="deleteUserRestAssured")
	public Iterator<Object[]> deleteUserRestAssured(){
		final List<Object[]> deleteData=new ArrayList<Object[]>();
		deleteData.add(new Object[] {2});
		deleteData.add(new Object[] {4});
		deleteData.add(new Object[] {6});
		return deleteData.iterator();
	}
	
	@Test(description="Test for executing Delete request using rest assured",dataProvider="deleteUserRestAssured")
	public void deleteRequestTest(final int userId) {
		
		
		
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.delete("/users/"+userId).then().assertThat().statusCode(204);

}
}
