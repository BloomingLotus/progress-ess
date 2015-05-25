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
import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.Employee;
import ess.model.ProjectOnHand;
import ess.webUI.ResponseJSend;

@RestController
@RequestMapping("/service/ProjectOnHand")
public class ProjectOnHandRestController {

	@Autowired
	private EntityService entityService;
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
	public ProjectOnHand findProjectOnHandById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findProjectOnHandById(id);
	}
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.DELETE})
	public ResponseJSend<ProjectOnHand> deleteProjectOnHandById(@PathVariable Long id) throws JsonMappingException {
		return entityService.deleteProjectOnHand(id);
	}
}
