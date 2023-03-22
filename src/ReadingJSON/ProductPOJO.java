package ReadingJSON;

import com.fasterxml.jackson.databind.JsonNode;

public class ProductPOJO {

	private String name;

	private String category;
	
	private JsonNode specifications; //Variable node whose values may depend on the category chosen
	

	public JsonNode getSpecifications() {
		return specifications;
	}


	public void setSpecifications(JsonNode specifications) {
		this.specifications = specifications;
	}


	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}




}