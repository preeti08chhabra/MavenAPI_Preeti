//hit the post request 
//bodydata array json using org.json
package API_Maven_Preeti.Maven_Preeti;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post_arrayjson
{
	public static void main(String[] args)
	
	{
		JSONObject inner1 = new JSONObject();
		inner1.put("House No", "23");
		inner1.put("SEctor", "34");
		inner1.put("Type", "First Inner");
		

		JSONObject inner2 = new JSONObject();
		inner2.put("House No", "50");
		inner2.put("SEctor", "100");
		inner2.put("Type", "Second Inner");
		
		JSONArray array1 = new JSONArray();
		array1.put(0, inner1);
		array1.put(1, inner2);
		
		JSONObject outer = new JSONObject();
		outer.put("firstname", "Preeti");
		outer.put("Surname", "Chhabra");
		outer.put("id", "924");
		outer.put("course", "API");
		outer.put("Address", array1);
		
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