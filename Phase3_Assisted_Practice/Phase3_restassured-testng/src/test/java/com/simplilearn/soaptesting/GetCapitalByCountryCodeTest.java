package com.simplilearn.soaptesting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetCapitalByCountryCodeTest {

	private static final String BASE_URL="http://webservices.oorsprong.org";
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

		String Response=RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post().getBody().asPrettyString();
		System.out.println(Response);
	}
}
