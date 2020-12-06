package APITesting;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPostRequestUSingRestAssured {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Response response = given().auth().basic(
	 * "sk_test_51HnTLHBHGjX7fNspAFGWUhHbNahstLeU6yDN7g7kM6UPeWTFWKJ7pRD2f8fwJ7stTzlQYhha9aYS1T7rnPmhgj2c00KFSnzyGM",
	 * "").formParam("name", "Rahul Ezahwa").formParam("email",
	 * "rahul@way2automation.com") .formParam("description",
	 * "Testing this from eclipse - Rest Assured").post(
	 * "https://api.stripe.com/v1/customers");
	 * 
	 * response.prettyPrint();
	 */

	public static void main(String[] args) {

//String bodyString = "{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}";
//	Response response = given().contentType(ContentType.JSON).body(bodyString).post("https://reqres.in/api/register");

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "eve.holt@reqres.in");
		map.put("password", "pistol");

		Response response = given().contentType(ContentType.JSON).body(map).log().all().post("https://reqres.in/api/register");

		response.prettyPrint();
		System.out.println(response.statusCode());
	}

}
