package ReadingJSON;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class SimpleNodeJson {

	private static void readSimpleNode(JsonNode jsonNode, String BaseNodeName) {

		System.out.println("=========* ==============* ===========");

		System.out.println("Reading from Simple JSON");
		JsonNode shantanu = jsonNode.get(BaseNodeName); // BaseNode is Shantanu
		System.out.println(shantanu.get("dob").asText());

	}

	private static void readNestedJson(JsonNode jsonNode, String BaseNodeName) {

		System.out.println("=========* ==============* ===========");
		System.out.println("Reading from Nested  JSON");
		JsonNode shantanu = jsonNode.get(BaseNodeName);
		System.out.println(shantanu.get("name").asText());
		JsonNode addressNOde = shantanu.get("addressDetails");
		
		String address = addressNOde.get("addressLine2").asText();
		System.out.println(address);
	}

	public static void main(String[] args) throws JsonProcessingException, IOException {

		String filePath = "D:\\Testing\\LiveProjectsPractice\\BasicPrograms\\Resources\\JsonReader.json";

		ObjectMapper objectMapper = new ObjectMapper();

		JsonNode userName = objectMapper.readTree(new File(filePath));

		// Reading Simple JSON
		readSimpleNode(userName, "Shantanu");

		// Reading from Nested Json
		readNestedJson(userName, "Shantanu");
		
		
		// Reading from Json Array 
		readJsonArray(userName, "Shrey");
		

	}

	private static void readJsonArray(JsonNode userName, String baseNodeName) {
	
		System.out.println("=========* ==============* ===========");
		System.out.println("Reading from   JSON Array ");	
		
	JsonNode userNameNode  = userName.get(baseNodeName);
	JsonNode skills=  (ArrayNode)userNameNode.get("skills");
	
	String Skill2 = skills.get(1).asText();
	System.out.println("SKill No 2 for Shrey is  " + Skill2 );
	
	
	for(JsonNode skill : skills) {
		System.out.println(skill.asText());
		
		
	}
		
	}

}
