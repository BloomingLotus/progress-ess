package ess.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	private Log log = LogFactory.getLog(this.getClass());
	
	@RequestMapping("/web/")
	public String index(Model model) {
		log.debug("Entering : /");
		
		model.addAttribute("indexPage", true);
		
		return "index";
	}
	
	
	@RequestMapping("/web/personal")
	public String personal(Model model) {
		log.debug("Entering : /");
		
		model.addAttribute("personalPage", true);
		return "personal";
	}
	

	@RequestMapping("/web/form")
	public String form(Model model) {
		log.debug("Entering : /");
		
		model.addAttribute("formPage", true);
		return "form";
	}
}
