package in.thiru;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

//contrl+shift+f

public class JavaToJson {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException 
	{
		Employee emp1=new Employee(1001, "thirumalesh", 10000.00, "hyderabad");
		File file = new File("employee.json");
		
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(file,emp1);
		System.out.println("convertd java object to json");
	}

}
