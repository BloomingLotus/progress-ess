package ess.controller.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import ess.controller.service.EntityService;
import ess.controller.service.WebEntityService;
import ess.model.ChangeRequest;
import ess.model.Education;
import ess.security.model.CurrentUser;
import ess.security.model.EssUserDetails;
import ess.security.model.User;
import ess.webUI.ResponseJSend;
import ess.webUI.model.BlogPost;

@RestController
@RequestMapping("/service/BlogPost")
public class BlogPostRestController {
	@Autowired
	private WebEntityService webEntityService;
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
	public BlogPost findById(
			@PathVariable Long id) throws JsonMappingException {
		return webEntityService.findBlogPostBy(id);
	}
	
	
	@RequestMapping(value = "/search/page/{pageNum}", method = {RequestMethod.POST}) 
	public ResponseJSend<Page<BlogPost>> findByExample(
			@RequestBody JsonNode node, @CurrentUser User user, @PathVariable Integer pageNum) throws JsonMappingException {
		return webEntityService.findBlogPostByExample(node, pageNum);
	}
	
	@RequestMapping(value= "", method = {RequestMethod.POST})
	public ResponseJSend<Long> saveById(@RequestBody JsonNode node, @CurrentUser EssUserDetails user) throws JsonProcessingException, IOException {
		return webEntityService.updateBlogPost(node, user);
	}
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.PUT})
	public ResponseJSend<Long> updateById(@RequestBody JsonNode node, @CurrentUser EssUserDetails user) throws JsonProcessingException, IOException {
		return webEntityService.updateBlogPost(node, user);
	}
	
}
