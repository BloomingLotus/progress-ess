package ess.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(
			@RequestParam(required=false) String error ,
			Model model) {
		
		if(error != null ) {
			model.addAttribute("error", error);
		}
		
		return "auth/login";
	}
}
