package ReadingJSON;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingDynamicJson {

	private static ProductPOJO getPlaceHolderObject(ObjectMapper mapper, String filePath) throws JsonParseException, JsonMappingException, IOException {
		
		
		ProductPOJO   product = mapper.readValue(new File(filePath),ProductPOJO.class);
		return product ; 
		
	}
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		// Reading from  shoes  file 
		String shoefilePath= "D:\\Testing\\LiveProjectsPractice\\BasicPrograms\\Resources\\Shoes.json";
		ObjectMapper mapper = new ObjectMapper();
		
	 
		
		ProductPOJO  productShoes = getPlaceHolderObject(mapper, shoefilePath);
		JsonNode materialValue  = productShoes.getSpecifications().get("material");
		System.out.println("The material used in shoe making is  " + materialValue.asText());
		
		
		String speakersfilePath= "D:\\Testing\\LiveProjectsPractice\\BasicPrograms\\Resources\\Speakers.json";
		ProductPOJO  productSpeakers =getPlaceHolderObject(mapper, speakersfilePath);
		
	    System.out.println("The category of this is : " + productSpeakers.getCategory());
	    System.out.println("The category of this is :  " + productSpeakers.getSpecifications().get("sound").asText());
		

	}

	

}
