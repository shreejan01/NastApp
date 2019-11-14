package np.edu.nast.nast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
	
	@GetMapping("/home")
	public String home(){
		return "index";
	}

	@GetMapping("/notice")
	public String notice(){
		return "notice";
	}
	
	@GetMapping("/routine")
	public String routine(){
		return "routine";
	}
	
	@GetMapping("/result")
	public String result(){
		return "result";
	}
	
	@GetMapping("/gallery")
	public String gallery(){
		return "gallery";
	}
	
	@GetMapping("/calendar")
	public String calendar(){
		return "calendar";
	}
	
	@GetMapping("/videos")
	public String videos(){
		return "videos";
	}
	
	@GetMapping("/aboutUs")
	public String aboutUs(){
		return "aboutUs";
	}
	
	@GetMapping("/privacy-policy")
	public String privacy(){
		return "privacy-policy";
	}
	
	@GetMapping("/disclaimer")
	public String disclaimer(){
		return "disclaimer";
	}
	
}
