//hit the post request by taking the data from the external json file with variables.
package API_Maven_Preeti.Maven_Preeti;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postrequest_jsonfile 
{
public static void main(String[] args) throws FileNotFoundException 
{
	File f = new File("../Maven_Preeti/postjsonfile.json");
	FileReader fr= new FileReader(f);
	JSONTokener js = new JSONTokener(fr);
	JSONObject ar= new JSONObject(js);
	System.out.println(ar);
	
	System.out.println("Enter value of ID");
	Scanner s= new Scanner(System.in);
	
	Integer idval= s.nextInt();

	System.out.println("Enter Firstname");
	String first = s.next();
	
	String bodydata = ar.toString();
	bodydata= bodydata.replaceAll(Pattern.quote("{{id}}"), idval.toString());
	bodydata= bodydata.replaceAll(Pattern.quote("{{f_name}}"),first );
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(bodydata)
			.when()
			.post("http://localhost:3000/Students");
			System.out.println("Status code is " +res.getStatusCode());
			System.out.println("data is");
			System.out.println(res.asString());
}
}
