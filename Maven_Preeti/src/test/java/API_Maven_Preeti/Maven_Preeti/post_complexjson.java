//hit the post request 
//bodydata complex json using org.json
package API_Maven_Preeti.Maven_Preeti;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post_complexjson 
{
public static void main(String[] args) 
{
	JSONObject inner = new JSONObject();
	inner.put("Sector", "23");
	inner.put("Area", "Barara");
	inner.put("District", "Ambala");
	
	JSONObject outer = new JSONObject();
	outer.put("firstname", "Preeti");
	outer.put("Surname", "Chhabra");
	outer.put("id", "902");
	outer.put("course", "API");
	outer.put("Address", inner);
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(outer.toString())
			.when()
			.post("http://localhost:3000/Students");
			System.out.println("Status code is " +res.getStatusCode());
			System.out.println("data is");
			System.out.println(res.asString());
}
}
