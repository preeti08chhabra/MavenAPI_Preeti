package API_Maven_Preeti.Maven_Preeti;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Del_request 
{
public static void main(String[] args) 
{
	Response rs=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete("http://localhost:3000/Students");
	System.out.println(rs.asString());
	System.out.println("Statuscode is---" +rs.getStatusCode());
	
}
}
