package ess.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import ess.controller.service.EntityService;
import ess.model.Education;
import ess.model.Employee;
import ess.webUI.ResponseJSend;

@RestController
@RequestMapping("/service/Education")
public class EducationRestController {

	@Autowired
	private EntityService entityService;
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
	public Education findEducationById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEducationById(id);
	}
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.PUT})
	public ResponseJSend<Education> updateEducationById(@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEducation(node);
	}
	
	@RequestMapping(value= "/", method = {RequestMethod.POST})
	public ResponseJSend<Education> saveEducationById(@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEducation(node);
	}
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.DELETE})
	public ResponseJSend<Education> deleteEducationById(@PathVariable Long id) throws JsonMappingException {
		return entityService.deleteEducation(id);
	}
}
