package np.edu.nast.nast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/result")
public class ResultController {

	@GetMapping("/resultfirst")
	public String resultfirst(){
		return"resultfirst";
	}
	
	@GetMapping("/resultpre")
	public String resultpre(){
		return"resultpre";
	}
	
}
