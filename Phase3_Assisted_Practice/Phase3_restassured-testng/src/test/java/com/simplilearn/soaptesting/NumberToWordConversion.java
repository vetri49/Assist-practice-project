package com.simplilearn.soaptesting;
import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;

public class NumberToWordConversion {
	
	private static final String BASE_URL="https://www.dataaccess.com";
	
	private static final Logger logger = Logger.getLogger(GetCapitalByCountryCodeTest.class);
	@Test(description="Test POST Number Conversion   using XML")
	public void postXMLRequestTest() {
		logger.info("start :: Test POST Number Conversion   using XML");
		logger.info("GET :: URL"+ BASE_URL+"/webservicesserver/NumberConversion.wso");
		String response=null;
		double amount=327.87;
		logger.info("Amount to convert ::"+amount);
		try {
		
		String xmlRequest="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n"
				+ "    <soap:Body>\r\n"
				+ "        <NumberToDollars xmlns=\"http://www.dataaccess.com/webservicesserver/\">\r\n"
				+ "            <dNum>"+amount+"</dNum>\r\n"
				+ "        </NumberToDollars>\r\n"
				+ "    </soap:Body>\r\n"
				+ "</soap:Envelope>";
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post("/webservicesserver/NumberConversion.wso").then().assertThat().statusCode(200);

		 response=RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post("/webservicesserver/NumberConversion.wso").getBody().asString();
			XmlPath path=new XmlPath(response);
			assertEquals(path.getString("NumberToDollarsResult"),"three hundred and twenty seven dollars and eighty seven cents");
			logger.info("Amounts coverted in words ::"+path.getString("NumbersToDollarsResult"));
		}catch(Exception e) {
			logger.error("Exception Object :: "+e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
			logger.info("Response Object ::"+response);
			logger.info("End :: Test POST Number Conversion   using XML");
	}

}
