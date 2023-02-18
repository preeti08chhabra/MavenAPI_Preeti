package API_Maven_Preeti.Maven_Preeti;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postreq_pojoclass
{

	public static void main(String[] args) 
	{
		pojoaddress pa = new pojoaddress();
		pa.setHouseno("971");
		pa.setLandmark("Mandir");
		pa.setArea("Sajan Vihar");
		
		adds_arraypojo[] adds=new adds_arraypojo[2];
		adds[0]=new adds_arraypojo();
		
		adds[0].setVillage("Barara");
		adds[0].setSector("67");
		adds[0].setDistt("Ambala");
		
		adds[1]=new adds_arraypojo();
		
		adds[1].setVillage("Adhoya");
		adds[1].setSector("65");
		adds[1].setDistt("Pkl");
		
		dummykeys dk = new dummykeys(); // has a relationship
		dk.setF_name("Ruby");
		dk.setSur_name("Makkar");
		dk.setId("392");
		dk.setDesg("Lead");
		dk.setRef_address(pa);
		dk.setArrayadds(adds);
		
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
