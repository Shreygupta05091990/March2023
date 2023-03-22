
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReadingFile {
	
	
	
	

	public static void main(String[] args) throws IOException {

		
		HashMap<String, String > mpa = new HashMap<String, String>();
		
		Properties prop  = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\Properties\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		
		prop.load(fis);
		
		for(Map.Entry<Object, Object> entry: prop.entrySet()) {
			
			
		}
		
		
		
		
		
		
		System.out.println(prop.getProperty("URL"));
		
		
		
		// Similar Way of using File reader 
		

		Properties prop_file_reader  = new Properties();
		File file1 = new File(System.getProperty("user.dir")+"\\Properties\\config.properties");
		FileReader filereader= new FileReader(file1);
		prop_file_reader.getProperty("URl");
		
		
		

	}

}
