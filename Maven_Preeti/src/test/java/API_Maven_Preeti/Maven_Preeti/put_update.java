package API_Maven_Preeti.Maven_Preeti;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class put_update 
{
public static void main(String[] args) throws FileNotFoundException 
{
	File f = new File("../Maven_Preeti/update.json");
	FileReader fr = new FileReader(f);
	JSONTokener js = new JSONTokener(fr);
	JSONObject jb= new JSONObject(js);
	Response rs=
	given()
	.contentType(ContentType.JSON)
	.body(jb.toString())
	.when()
	//.get("http://localhost:3000/Students/703");
	.put("http://localhost:3000/Students/703");
	System.out.println("Status Code is  " +rs.getStatusCode());
	System.out.println(rs.asString());
	
}
}
