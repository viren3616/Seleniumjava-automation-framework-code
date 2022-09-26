package restcrudoperations;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class PutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reqbody=" {\"name\":\"Adithya\",\"salary\":\"6000\",\"age\":\"23\"}";
		
		
		String ename = given().
				contentType(ContentType.JSON).
				body(reqbody).
				
				
				when().
				put("http://dummy.restapiexample.com/api/v1/update/1235").
				
				
				then().extract().path("data.name");

		System.out.println(ename);

		@SuppressWarnings("unused")
		String expectedname="Adithya";

		if((ename.compareTo("Adithya"))==0) {
			System.out.println("Expected and actual names are matching");
		}
		else {
			System.out.println("Expected and actual names are not matching");
		}
				
			}

		}

	
