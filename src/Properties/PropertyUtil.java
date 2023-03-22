package Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.internal.support.FileReader;

public class PropertyUtil {
	
  public static Properties propLoader(String filePath) {
    
	  Properties prop = new Properties();
	  java.io.FileReader reader= null ;
	try {
		reader = new java.io.FileReader(filePath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		prop.load(reader);
		reader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return prop;  
  }
	
	
	
public static void main(String[] args) {
	
	
Properties 	properties = PropertyUtil.propLoader("D:\\Testing\\LiveProjectsPractice\\BasicPrograms\\Properties\\config.properties");
String url  = properties.getProperty("URL")	;
System.out.println(url);
	
	
 }
}
