package restcrudoperations;

import static io.restassured.RestAssured.given;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		given().delete("http://dummy.restapiexample.com/api/v1/delete/1245").
		then().
		log().all();
		
		
	}

}
