package APITesting;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
/*import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
*/

public class SendGetRequestUsingRestAssured {

	
	  public static void main(String[] args) {
	  
	  Response response = given().auth().basic(
	  "sk_test_51HnTLHBHGjX7fNspAFGWUhHbNahstLeU6yDN7g7kM6UPeWTFWKJ7pRD2f8fwJ7stTzlQYhha9aYS1T7rnPmhgj2c00KFSnzyGM",
	  "").get("https://api.stripe.com/v1/customers");
	  
	  //response.prettyPrint();
	  
	  String jsonResponse = response.asString(); System.out.println(jsonResponse);
	  System.out.println("Response from status code is: " +response.statusCode());
	  
	  
	 /* //param limit 3 ---- To limit the user to 3 results Content Type:
	  given().contentType(ContentType.JSON);
	  given().contentType("application/json"); given().header("content-type",
	  "application/json").auth().basic(userName, password);
	 */ 
	  }
	 
	 
	 
	 /* public static void main(String[] args) {
	 * 
	 * Response response = given().header("Authorization",
	 * "Bearer sk_test_51HnTLHBHGjX7fNspAFGWUhHbNahstLeU6yDN7g7kM6UPeWTFWKJ7pRD2f8fwJ7stTzlQYhha9aYS1T7rnPmhgj2c00KFSnzyGM"
	 * ) .get("https://api.stripe.com/v1/customers/cus_IPVzqJo3uQQitJ");
	 * 
	 * response.prettyPrint(); }
	 */}
