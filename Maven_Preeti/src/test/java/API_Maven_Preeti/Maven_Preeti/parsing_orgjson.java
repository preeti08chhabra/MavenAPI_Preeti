package API_Maven_Preeti.Maven_Preeti;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Set;
public class parsing_orgjson 
{

	public static void main(String[] args) 
	{
		
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/Students");
			//System.out.println("Status Code is" +res.statusCode());
			//System.out.println(res.asString());
			
			//*********To extract particular value of all objects
			/*JSONArray ary = new JSONArray(res.asString());
			int l= ary.length();			//to get all ids of all objects, first find length
			for(int i =0; i<l;i++)			// loop till length
			{
			JSONObject ob = ary.getJSONObject(i); // extracting particular object value from json array
			System.out.println(ob.get("id"));    // extracting part id of that object
			}*/
			/*
			//*********To extract all values of particular object
			JSONArray ary = new JSONArray(res.asString());
			JSONObject ob= ary.getJSONObject(2);
			System.out.println(ob);  // to print values
			Set<String> pkey = ob.keySet(); //keyset method to extract keys, pkey is string variable
			for(String str : pkey)   // for each loop
			{
				System.out.println("key name is--" +str);
				System.out.println("key value is--" + ob.get(str));  // to get values
			}*/
			//*********To extract all values of all objects
			JSONArray ary = new JSONArray(res.asString());
			int l= ary.length();
			for(int i=0;i<l;i++) // loop for traversing array
			{
			JSONObject ob= ary.getJSONObject(i);
			System.out.println(ob);  // to print values
			Set<String> pkey = ob.keySet(); //keyset method to extract keys, pkey is string variable
			for(String str : pkey)   // for each loop---loop for traversing object
			{
				System.out.println("key name is--" +str);
				System.out.println("key value is--" + ob.get(str));  // to get values
			}
			}
	}
}
