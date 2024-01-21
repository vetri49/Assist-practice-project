package com.simplilearn.soaptesting;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import io.restassured.RestAssured;


public class GetCapitalByCountryCodeTest {

	private static final String BASE_URL="http://webservices.oorsprong.org";
	private static final Logger logger = Logger.getLogger(GetCapitalByCountryCodeTest.class);
	
	@DataProvider(name="CountryCodes")
	public Iterator<Object[]> countryCodes(){
		final List<Object[]> countryCodes=new ArrayList<Object[]>();
		countryCodes.add(new Object[] {"IN"});
		countryCodes.add(new Object[] {"US"});
		countryCodes.add(new Object[] {"CA"});
		countryCodes.add(new Object[] {"ML"});
		return countryCodes.iterator();
	}
	
	@Test(description="Test POST Soap request  using XML",dataProvider="CountryCodes")
	public void postXMLRequestTest(final String ctryCode) {
		logger.info("start :: Test POST Soap request  using XML");
		logger.info("GET :: URL"+ BASE_URL+"/websamples.countryinfo/CountryInfoService.wso"+ "  for  "+ctryCode);
		String response=null;
		try {
		
		String xmlRequest="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n"
				+ "    <soap:Body>\r\n"
				+ "        <CapitalCity xmlns=\"http://www.oorsprong.org/websamples.countryinfo\">\r\n"
				+ "            <sCountryISOCode>"+ctryCode+"</sCountryISOCode>\r\n"
				+ "        </CapitalCity>\r\n"
				+ "    </soap:Body>\r\n"
				+ "</soap:Envelope>";
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post("/websamples.countryinfo/CountryInfoService.wso?WSDL").then().assertThat().statusCode(200);
		 response=RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post().getBody().asString();
		}catch(Exception e) {
			logger.error("Exception Object :: "+e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
			logger.info("Response Object ::"+response);
			logger.info("End :: Test POST Soap request  using XML");
	}
}
