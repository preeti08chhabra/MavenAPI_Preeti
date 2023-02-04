package API_Maven_Preeti.Maven_Preeti;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class apimaven
{
public static void main(String[] args) 
{
	//Response r= 
	given()
	.contentType(ContentType.JSON)
	.when()
	.get("http://localhost:3000/Students/704")
	//System.out.println("Status code is " +r.getStatusCode());
	//System.out.println("Response data is");
	//System.out.println(r.asString());
	.then()
	.statusCode(200);
	System.out.println("the status code is");
}
}
