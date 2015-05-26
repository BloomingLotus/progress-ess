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
import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.Employee;
import ess.model.ProjectOnHand;
import ess.model.Training;
import ess.model.WorkExperience;
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
	

	
	@RequestMapping(value= "/{id}", method = {RequestMethod.PUT})
	public ResponseJSend<Employee> updateEmployeeById(@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployee(node);
	}
	
	// ==== Education 
	
	
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
	
	// ==== ComputerExperience 
	
	
	@RequestMapping(value= "/{id}/ComputerExperiences", method = {RequestMethod.GET})
	public Iterable<ComputerExperience> findEmployeeComputerExperiencesById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEmployeeComputerExperiencesByEmpId(id);
	}
	
	@RequestMapping(value= "/{id}/ComputerExperience", method = {RequestMethod.POST})
	public ResponseJSend<ComputerExperience> saveEmployeeComputerExperienceById(
			@PathVariable Long id,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeComputerExperienceByEmpId(id, node);
	}
	
	@RequestMapping(value= "/{id}/ComputerExperience/{compExpId}", method = {RequestMethod.PUT})
	public ResponseJSend<ComputerExperience> updateEmployeeComputerExperienceByEduId(
			@PathVariable Long id,
			@PathVariable Long compExpId,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeComputerExperienceByEmpId(id, node);
	}
	
// ==== ProjectOnHand 


	@RequestMapping(value= "/{id}/ProjectOnHands", method = {RequestMethod.GET})
	public Iterable<ProjectOnHand> findProjectOnHandsById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEmployeeProjectOnHandsByEmpId(id);
	}
	
	@RequestMapping(value= "/{id}/ProjectOnHand", method = {RequestMethod.POST})
	public ResponseJSend<ProjectOnHand> saveEmployeeProjectOnHandById(
			@PathVariable Long id,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeProjectOnHandByEmpId(id, node);
	}
	
	@RequestMapping(value= "/{id}/ProjectOnHand/{compExpId}", method = {RequestMethod.PUT})
	public ResponseJSend<ProjectOnHand> updateEmployeeProjectOnHandByEduId(
			@PathVariable Long id,
			@PathVariable Long compExpId,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeProjectOnHandByEmpId(id, node);
	}

// ==== Training 


	@RequestMapping(value= "/{id}/Trainings", method = {RequestMethod.GET})
	public Iterable<Training> findTrainingById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEmployeeTrainingByEmpId(id);
	}
	
	@RequestMapping(value= "/{id}/Training", method = {RequestMethod.POST})
	public ResponseJSend<Training> saveEmployeeTrainingById(
			@PathVariable Long id,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeTrainingByEmpId(id, node);
	}
	
	@RequestMapping(value= "/{id}/Training/{compExpId}", method = {RequestMethod.PUT})
	public ResponseJSend<Training> updateEmployeeTrainingByEduId(
			@PathVariable Long id,
			@PathVariable Long compExpId,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeTrainingByEmpId(id, node);
	}
	
// ==== WorkExperience


	@RequestMapping(value= "/{id}/WorkExperiences", method = {RequestMethod.GET})
	public Iterable<WorkExperience> findWorkExperienceById(
			@PathVariable Long id) throws JsonMappingException {
		return entityService.findEmployeeWorkExperienceByEmpId(id);
	}
	
	@RequestMapping(value= "/{id}/WorkExperience", method = {RequestMethod.POST})
	public ResponseJSend<WorkExperience> saveEmployeeWorkExperienceById(
			@PathVariable Long id,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeWorkExperienceByEmpId(id, node);
	}
	
	@RequestMapping(value= "/{id}/WorkExperience/{compExpId}", method = {RequestMethod.PUT})
	public ResponseJSend<WorkExperience> updateEmployeeWorkExperienceByEduId(
			@PathVariable Long id,
			@PathVariable Long compExpId,
			@RequestBody JsonNode node) throws JsonMappingException {
		return entityService.saveEmployeeWorkExperienceByEmpId(id, node);
	}	

	
}
