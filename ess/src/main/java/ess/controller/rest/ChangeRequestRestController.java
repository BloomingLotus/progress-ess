package ess.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import ess.controller.service.EntityService;
import ess.model.ChangeRequest;
import ess.security.model.CurrentUser;
import ess.security.model.User;
import ess.webUI.ResponseJSend;

@RestController
@RequestMapping("/service/ChangeRequest")
public class ChangeRequestRestController {
	@Autowired
	private EntityService entityService;
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
	public ChangeRequest findById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findChangeRequestById(id);
	}
	
	@RequestMapping(value = "/search/page/{pageNum}", method = {RequestMethod.POST}) 
	public ResponseJSend<Page<ChangeRequest>> findByExample(
			@RequestBody JsonNode node, @CurrentUser User user, @PathVariable Integer pageNum) throws JsonMappingException {
		return entityService.findChangeRequestByExample(node, pageNum);
	}
	
}
