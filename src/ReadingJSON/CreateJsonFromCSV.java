package ReadingJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;



public class CreateJsonFromCSV {

	public static void main(String[] args) throws IOException, CsvException {
		String filePath = "D:\\Testing\\LiveProjectsPractice\\BasicPrograms\\Resources\\EmployeeDetails.csv";
		LinkedHashMap<String, LinkedHashMap<String, String>> bigLinkedHashMap = readCSVFile(new File(filePath));
		MainPojo  service = 	convertLinkedHashMaptoPOJO(bigLinkedHashMap);
		//create Json file 
		
		String fileAtPath = "D:\\Testing\\LiveProjectsPractice\\BasicPrograms\\Resources\\JsonFromCsv.csv";
		FileWriter  fw = null;
		Gson gson = new Gson();
		
		
		fw = new FileWriter(fileAtPath);
		gson.toJson(service, fw);
		fw.close();
		System.out.println("The JSon file has been successfully created ");
	}

	private static MainPojo convertLinkedHashMaptoPOJO(
			LinkedHashMap<String, LinkedHashMap<String, String>> bigLinkedHashMap) {
		
		MainPojo service = new MainPojo();
		List<EmployeePOJO> emplist= new ArrayList<EmployeePOJO>();
		for(LinkedHashMap< String, String >    lhm :bigLinkedHashMap.values()  ) {
			
			
			EmployeePOJO employee = new EmployeePOJO();
			Address address = new Address();
			AddressGeo addressGeo = new AddressGeo();
			Office office  = new Office();
			OfficeA officeA = new OfficeA();
			OfficeB officeB = new OfficeB();
			
			for (Entry<String, String> entry :  lhm.entrySet()) {
				
				String key = entry.getKey();
				String value = entry.getValue();
				
				switch (key) {
				case "Name": employee.setName(value); 
						   	break;
				case "Surname": employee.setSurname(value);
				   			break;	
				case "Age": employee.setAge(value); 
				   			break;	
				case "Address#Hno" : address.setHno(value);  	
							break;
				case "Address#Block":address.setBlock(value);
							break;
				case "Address#State":address.setState(value);
							break;
				case "Address#AddressGeo#Lat":address.setState(value);								
							break;
				case "Address#AddressGeo#Long":addressGeo.setLongitude(value);		
							break;
					
				case "Office#OfficeA#Name" :  officeA.setClient(value);break;
				case "Office#OfficeA#Client" :officeA.setName(value);break;
				case "Office#OfficeA#Teamsize": officeA.setTeamsize(value);break;
				case "Office#OfficeB#Name" : officeB.setName(value);break;
				case "Office#OfficeB#Client": officeB.setClient(value);break;
				case "Office#OfficeB#Teamsize" : officeB.setTeamsize(value); break;
				
				
				}
				
			}
			
			address.setAddressGeo(addressGeo);
			office.setOfficeA(officeA);
			office.setOfficeB(officeB);
			
			employee.setAddress(address);
			employee.setOffice(office);
			
			emplist.add(employee);
			
		}
		service.setempListPojo(emplist);
		
		return service ; 
		
	}

	private static LinkedHashMap<String, LinkedHashMap<String, String>> readCSVFile(File file)
			throws IOException, CsvException, FileNotFoundException {

		FileReader fr = new FileReader(file);
		CSVReader csvReader = new CSVReader(fr);
		List<String[]> allCSVData = csvReader.readAll();
		csvReader.close();

		LinkedHashMap<String, LinkedHashMap<String, String>> bigLinkedHashMap = new LinkedHashMap<>();
		String[] headerArray = allCSVData.get(0);
		List<String> headersList = Arrays.asList(headerArray);
		LinkedHashMap<String, String> smallLinkedHashMap = new LinkedHashMap<>();
		for (int i = 1; i < allCSVData.size(); i++) {

			List<String> bodyRow = Arrays.asList(allCSVData.get(i));
			for (int j = 0; j < headersList.size(); j++) {
				smallLinkedHashMap.put(headersList.get(j), bodyRow.get(j));

			}
			bigLinkedHashMap.put(bodyRow.get(0), smallLinkedHashMap);

		}

		return bigLinkedHashMap;
	}

}
