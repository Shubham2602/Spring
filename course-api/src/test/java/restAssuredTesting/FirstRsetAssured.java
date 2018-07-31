package restAssuredTesting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstRsetAssured {
	@Test
	public void getTopics()
	{
		io.restassured.RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET, "/Hyderabad");
		
		Assert.assertEquals(200, response.getStatusCode());
	}

}
