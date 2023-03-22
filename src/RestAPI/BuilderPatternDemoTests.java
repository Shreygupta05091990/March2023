package RestAPI;

import static io.restassured.RestAssured.given;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class BuilderPatternDemoTests {

	@Test
	public  void postJsonUsingExternalBuilderClassTest() {
		
		// Using conventional Employee Class object.
	   // Employee emp = new Employee("Shrey ", "228,Santosh Nagar Colony ", 1);  
	    
	    
		// Below example is using External Builder classs 
	    Employee emp =  new EmployeeBuilder().setName("Shrey").setId(25).setAddress("Santosh Nagar Colony ").build();
	    
	    
	    
	  Response response = given()
	      .baseUri("") 
	      .log()
	      .all()
	      .body(emp)
	      .post("/employees");
	    
	    Assertions.assertThat(response.getStatusCode()).isEqualTo(200);
	    
	    
	    
	}
	
	@Test
	public void  postJSONUsingStaticInnerCLassTest() {
		
	    Employee  emp =Employee.builder().setName("Shrey").setId(413).setAddress("Santosh Colony").build();
		
		
		
		
		  Response response = given()
		      .baseUri("") 
		      .log()
		      .all()
		      .body(emp)
		      .post("/employees");
		    
		    Assertions.assertThat(response.getStatusCode()).isEqualTo(200);
		
		
		
	}
	    
	    
	    


}
