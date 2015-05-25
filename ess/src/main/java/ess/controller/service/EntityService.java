package ess.controller.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.Employee;
import ess.model.ProjectOnHand;
import ess.webUI.ResponseJSend;

public interface EntityService {

	ResponseJSend<Employee> saveEmployee(JsonNode node) throws JsonMappingException;

	Employee findEmployeeById(Long id);

	Education findEducationById(Long id);

	ResponseJSend<Education> saveEducation(JsonNode node) throws JsonMappingException;
	
	ResponseJSend<Education> deleteEducation(Long id);

	Iterable<Education> findEmployeeEducationsByEmpId(Long id);

	ResponseJSend<Education> saveEmployeeEducationsByEmpId(Long id, JsonNode node) throws JsonMappingException;

	ComputerExperience findComputerExperienceById(Long id);

	ResponseJSend<ComputerExperience> deleteComputerExperience(Long id);

	Iterable<ComputerExperience> findEmployeeComputerExperiencesByEmpId(Long id);

	ResponseJSend<ComputerExperience> saveEmployeeComputerExperienceByEmpId(Long id,
			JsonNode node) throws JsonMappingException;

	ProjectOnHand findProjectOnHandById(Long id);

	ResponseJSend<ProjectOnHand> deleteProjectOnHand(Long id);

	ResponseJSend<ProjectOnHand> saveEmployeeProjectOnHandByEmpId(Long id,
			JsonNode node) throws JsonMappingException;

	Iterable<ProjectOnHand> findEmployeeProjectOnHandsByEmpId(Long id);
 
}
