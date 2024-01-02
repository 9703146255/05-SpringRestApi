package in.thiru;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaObj {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		
		ObjectMapper mapper=new ObjectMapper();
		Employee readValue = mapper.readValue(new File("employee.json"), Employee.class);
		System.out.println(readValue);
		
	}

}
