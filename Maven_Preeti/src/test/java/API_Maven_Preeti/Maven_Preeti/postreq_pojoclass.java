package API_Maven_Preeti.Maven_Preeti;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postreq_pojoclass
{

	public static void main(String[] args) 
	{
		dummykeys dk = new dummykeys(); // has a relationship
		dk.setF_name("Reyansh");
		dk.setSur_name("Makkar");
		dk.setId("355");
		dk.setDesg("Lead");

		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(dk)
				.when()
				.post("http://localhost:3000/Students");
				System.out.println("Status code is " +res.getStatusCode());
				System.out.println("data is");
				System.out.println(res.asString());
	}
}
