package k24.iinesEka.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
public class MyController {
	
	@RequestMapping("main")
	@ResponseBody
	public String returnGreeting(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String etunimi, 
			@RequestParam int age) {
		return "Hei " + etunimi + ", " + age + " vuotta";
	} 
	
	@RequestMapping("index")
	@ResponseBody 
	public String indexPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody 
	public String contactPage() {
		return "This is the contact page";
	}
	
	/*@RequestMapping("hello")
	@ResponseBody 
	public String sayHello(@RequestParam String location,
			@RequestParam String name) {
		return "Welcome to the " + location + " " + name;
	}*/
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(@RequestParam(name="name") String name, @RequestParam(name="age") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
	
	
	// http://localhost:8080/main
}
