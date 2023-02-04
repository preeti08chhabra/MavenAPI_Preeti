//hit the post request 
//bodydata simple json using org.json
package API_Maven_Preeti.Maven_Preeti;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class postrequest_maven
{
	public static void main(String[] args)
	{
		
		
		JSONObject ob = new JSONObject();
		ob.put("firstname", "Preeti");
		ob.put("Surname", "Chhabra");
		ob.put("id", "911");
		ob.put("course", "API");
		System.out.println(ob);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(ob.toString())
		.when()
		.post("http://localhost:3000/Students");
		System.out.println("Status code is " +res.getStatusCode());
		System.out.println("data is");
		System.out.println(res.asString());
	}
}
