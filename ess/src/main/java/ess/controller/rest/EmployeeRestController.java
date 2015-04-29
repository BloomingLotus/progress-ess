package ess.controller.rest;

import java.util.List;

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
@RequestMapping("/service/Employee")
public class EmployeeRestController {
	
	@Autowired
	private EntityService entityService;
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
	public Employee findEmployeeById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEmployeeById(id);
	}
	
	@RequestMapping(value= "/{id}/Educations", method = {RequestMethod.GET})
	public Iterable<Education> findEmployeeEducationsById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEmployeeEducationsByEmpId(id);
	}
	
	@RequestMapping(value= "/{id}/Education", method = {RequestMethod.POST})
	public ResponseJSend<Education> saveEmployeeEducationsById(
			@PathVariable Long id,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeEducationsByEmpId(id, node);
	}
	
	@RequestMapping(value= "/{id}/Education/{eduId}", method = {RequestMethod.PUT})
	public ResponseJSend<Education> updateEmployeeEducationsByEduId(
			@PathVariable Long id,
			@PathVariable Long eduId,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeEducationsByEmpId(id, node);
	}
	
	@RequestMapping(value= "/{id}", method = {RequestMethod.PUT})
	public ResponseJSend<Employee> updateEmployeeById(@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployee(node);
	}
}
