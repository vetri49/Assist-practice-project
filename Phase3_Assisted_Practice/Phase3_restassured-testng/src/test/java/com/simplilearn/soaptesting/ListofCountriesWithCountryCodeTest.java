package com.simplilearn.soaptesting;

import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class ListofCountriesWithCountryCodeTest {

	private static final String BASE_URL="http://webservices.oorsprong.org";
	private static final Logger logger = Logger.getLogger(ListofCountriesWithCountryCodeTest.class);
	
	
	
	@Test(description="Test List of Countries with country code Soap request  using XML")
	public void postXMLRequestTest() {
		logger.info("start :: Test List of Countries with country code Soap request  using XML");
		logger.info("GET :: URL"+ BASE_URL+"/websamples.countryinfo/CountryInfoService.wso");
		String response=null;
		try {
		
		String xmlRequest="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n"
				+ "  <soap:Body>\r\n"
				+ "    <ListOfCountryNamesByName xmlns=\"http://www.oorsprong.org/websamples.countryinfo\">\r\n"
				+ "    </ListOfCountryNamesByName>\r\n"
				+ "  </soap:Body>\r\n"
				+ "</soap:Envelope>";
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post("/websamples.countryinfo/CountryInfoService.wso").then().assertThat().statusCode(200);
		
		 response=RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post().getBody().asPrettyString();
		}catch(Exception e) {
			logger.error("Exception Object :: "+e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
			logger.info("Response Object ::"+response);
			logger.info("End :: Test List of Countries with country code Soap request  using XML");

}
}