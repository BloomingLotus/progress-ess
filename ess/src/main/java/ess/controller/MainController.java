package ess.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonMappingException;

import ess.controller.service.WebEntityService;
import ess.security.model.CurrentUser;
import ess.security.model.EssUserDetails;
import ess.webUI.ResponseJSend;
import ess.webUI.ResponseStatus;
import ess.webUI.model.BlogPost;


@Controller
public class MainController {
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private WebEntityService webEntityService;
//	private EntityService entityService;
	
	@RequestMapping("/web/")
	public String index(Model model) throws JsonMappingException {
		log.debug("Entering : /");
		
		ResponseJSend<Page<BlogPost>> posts = webEntityService.findBlogPostByPageNum(1);
		
		log.debug(posts.toString());
		
		model.addAttribute("posts",posts.data);
		model.addAttribute("indexPage", true);
		
		return "index";
	}
	
	
	@RequestMapping("/web/personal")
	public String personal(Model model, 
			@CurrentUser EssUserDetails userDetails) {
		log.debug("Entering : /web/personal ");
		log.debug("User: " + userDetails.getUsername() + userDetails.getAuthorities());
		log.debug("empId: " + userDetails.getEmpId());
		
		model.addAttribute("personalPage", true);
		model.addAttribute("empId", userDetails.getEmpId());
		return "personal";
	}
	
	@RequestMapping("/web/hrForm")
	public String hrForm(Model model) {
		log.debug("Entering : /hrForm");
		
		model.addAttribute("formPage", true);
		return "hrForm";
	}

	@RequestMapping("/admin/")
	public String admin(Model model) {
		log.debug("Entering : /admin/main");
		
		model.addAttribute("adminPage", true);
		return "admin/main";
		
	}
	
	@RequestMapping("/admin/changeRequest")
	public String adminChangeRequest(Model model) {
		log.debug("Entering : /admin/changeRequest");
		
		model.addAttribute("adminPage", true);
		return "admin/changeRequest";
		
	}
	
	@RequestMapping("/admin/blogPost")
	public String adminBlogPost(Model model) {
		log.debug("Entering : /admin/blogPost");
		
		model.addAttribute("adminPage", true);
		return "admin/blogPost";
		
	}
	
	@RequestMapping("/admin/staffProfile")
	public String adminStaffProfile(Model model) {
		log.debug("Entering : /admin/staffProfile");
		
		model.addAttribute("adminPage", true);
		return "admin/staffProfile";
		
	}
	
	@RequestMapping("/web/form")
	public String form(Model model, @CurrentUser EssUserDetails userDetails) {
		log.debug("Entering : /");
		
		model.addAttribute("formPage", true);
		model.addAttribute("empId", userDetails.getEmpId());
		model.addAttribute("formPage", true);
		return "form";
	}
}
