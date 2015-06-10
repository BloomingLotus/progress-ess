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
import ess.model.Certified;
import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.EmergencyContact;
import ess.model.Employee;
import ess.model.Family;
import ess.model.Training;
import ess.model.WorkExperience;
import ess.webUI.ResponseJSend;

@RestController
@RequestMapping("/service/EmergencyContact")
public class EmergencyContactRestController {

	@Autowired
	private EntityService entityService;
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
	public EmergencyContact findById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEmergencyContactById(id);
	}
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.DELETE})
	public ResponseJSend<EmergencyContact> deleteById(@PathVariable Long id) throws JsonMappingException {
		return entityService.deleteEmergencyContact(id);
	}
}
