package k2.toka.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import k2.toka.domain.*;
import java.util.*;

@Controller
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Iines", "Junttila"));
		students.add(new Student("Jaakko", "Jokinen"));
		
		model.addAttribute("students", students);
		return "studentlist";
	}
	
	
	// http://localhost:8080/hello
}
