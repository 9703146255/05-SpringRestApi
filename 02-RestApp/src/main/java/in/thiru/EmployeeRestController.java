package in.thiru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController 
{
	
	@GetMapping("/welcome/{location}")
	public String getWelcomeMsg(@PathVariable("location") String location)
	{
		return "welcome to hyderabad... you should watch :: "+location;
	}
	
	@GetMapping("/greet")
	public String greetMsg(@RequestParam("name") String name,@RequestParam("salary") Double salary)
	{
		return "wish you happy new year your dreams comes true these year :: "+name+"you will get sal of :: "+salary;
	}

}
