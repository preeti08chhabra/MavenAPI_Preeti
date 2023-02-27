package API_Maven_Preeti.Maven_Preeti;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class postrequest
{
public static void main(String[] args) throws FileNotFoundException 
{
	File f = new File("../Maven_Preeti/update.json");
	FileReader fr= new FileReader(f);
	JSONTokener jt= new JSONTokener(fr);
	JSONObject j=  new JSONObject(jt);
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(j.toString())
	.when()
	.put(" http://localhost:3000/Students/703");
	System.out.println("Status Code-->" +res.getStatusCode());
	System.out.println(res.asString());
}
}
