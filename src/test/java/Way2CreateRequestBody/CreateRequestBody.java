package Way2CreateRequestBody;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateRequestBody {
	
	@Test
	void usingHashMap(){
		
		HashMap<String, String> data = new HashMap();
		
		data.put("name", "morpheus");
		data.put("job", "leader");
		
//		String coursar[]= {"c","c++"};
//		
//		data.put("courses", "coursar");
		
		given()
		 .contentType("application/json")
		 .body(data)
		
		.when()
		 .post("https://reqres.in/api/users")
		 
		.then()
		 .statusCode(201)
		 .body("name",equalTo("morpheus"))
		 .body("job",equalTo("leader"))
		
		 .log().all();
		
	}

	
	}

	

