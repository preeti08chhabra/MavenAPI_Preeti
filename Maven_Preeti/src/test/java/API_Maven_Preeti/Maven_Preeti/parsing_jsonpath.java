package API_Maven_Preeti.Maven_Preeti;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class parsing_jsonpath 
{
public static void main(String[] args)
{
	Response r=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/Students");
			//System.out.println(r.asString());
			String adds = r.jsonPath().getString("[4].Address.Area");
			System.out.println("Address is  " +adds);
			
			String sec = r.jsonPath().getString("[4].Address.Sector");
			System.out.println("Sector is  " +sec);
			}
}
