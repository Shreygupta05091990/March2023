package ReadingJSON.Deserialisation;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserTestClass {

	@Test(enabled = true)
	public void APItest() throws JsonParseException, JsonMappingException, IOException {

		String filePath = "D:\\Testing\\LiveProjectsPractice\\BasicPrograms\\Resources\\DeSerialisationJson.json";
		ObjectMapper mapper = new ObjectMapper();
//		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		User user = mapper.readValue(new File(filePath), User.class); // De-serialisation happens behind the scenes .
		Assert.assertEquals(user.getAge().intValue(), 32,
				"User's age is either less than or greater than the mentioned age");

	}

	@Test(description = "Testing The Post API call ")
	public void POSTrequest() {
		String payload = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\",\r\n" + "}";

		Response response = given().baseUri("https://reqres.in/").auth().none().contentType(ContentType.JSON)
				.header("Content-Type", "Application/json").body(payload).log().all().post("api/users");

		System.out.println(response.statusCode());

	}

}
