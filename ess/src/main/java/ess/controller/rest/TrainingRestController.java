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
import ess.model.Training;
import ess.webUI.ResponseJSend;

@RestController
@RequestMapping("/service/Training")
public class TrainingRestController {

	@Autowired
	private EntityService entityService;
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
	public Training findTrainingeById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findTrainingById(id);
	}
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.DELETE})
	public ResponseJSend<Training> deleteTrainingById(@PathVariable Long id) throws JsonMappingException {
		return entityService.deleteTraining(id);
	}
}
