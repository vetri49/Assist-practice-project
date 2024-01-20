package com.simplilearn.soaptesting;
import static org.testng.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;

public class NumberToWordConversion {
	
	private static final String BASE_URL="https://www.dataaccess.com";
	@Test(description="Test POST Number Conversion   using XML")
	public void postXMLRequestTest() {
		
		String xmlRequest="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n"
				+ "    <soap:Body>\r\n"
				+ "        <NumberToDollars xmlns=\"http://www.dataaccess.com/webservicesserver/\">\r\n"
				+ "            <dNum>5092</dNum>\r\n"
				+ "        </NumberToDollars>\r\n"
				+ "    </soap:Body>\r\n"
				+ "</soap:Envelope>";
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post("/webservicesserver/NumberConversion.wso").then().assertThat().statusCode(200);

		String Response=RestAssured.given().baseUri(BASE_URL).when()
		.contentType("text/xml;charset=utf-8")
		.body(xmlRequest)
		.post("/webservicesserver/NumberConversion.wso").getBody().asString();
			XmlPath path=new XmlPath(Response);
			assertEquals(path.getString("NumberToDollarsResult"),"five thousand ninety two dollars");
		System.out.println(path.getString("NumberToDollarsResult"));
		System.out.println(Response);
	}

}
