package np.edu.nast.nast.controller;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import np.edu.nast.nast.entities.Login;

@Controller
@RequestMapping
public class LoginController {
	
	
	@GetMapping("/login")
	public String createLogin(Model model){
		
		model.addAttribute("loginForm", new Login());
		return "login";
	}

	@PostMapping("/login")
	public String checklogin(Model model, @Valid Login login){
		String email = login.getEmail();
		String password = login.getPassword();
		
		if(email.equals("admin@gmail.com") && password.equals("admin")){
			 return "dashboard";			 
		}
		else{
			String error= "invalid";
			model.addAttribute("invalidCredentials",error);
			return "login";
		}
			
	}

       
}
