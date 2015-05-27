package ess.controller.service;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import ess.model.Certified;
import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.Employee;
import ess.model.Family;
import ess.model.ProjectOnHand;
import ess.model.Training;
import ess.model.WorkExperience;
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

	Training findTrainingById(Long id);

	ResponseJSend<Training> deleteTraining(Long id);

	Iterable<Training> findEmployeeTrainingByEmpId(Long id);

	ResponseJSend<Training> saveEmployeeTrainingByEmpId(Long id, JsonNode node) throws JsonMappingException;

	WorkExperience findWorkExperienceById(Long id);

	ResponseJSend<WorkExperience> deleteWorkExperience(Long id);

	Iterable<WorkExperience> findEmployeeWorkExperienceByEmpId(Long id);

	ResponseJSend<WorkExperience> saveEmployeeWorkExperienceByEmpId(Long id,
			JsonNode node) throws JsonMappingException;

	ResponseJSend<Certified> deleteCertified(Long id);

	Certified findCertifiedById(Long id);

	Iterable<Certified> findCertifiedByEmpId(Long id);

	ResponseJSend<Certified> saveEmployeeCertifiedByEmpId(Long id, JsonNode node) throws JsonMappingException;

	Family findFamilyById(Long id);

	ResponseJSend<Family> deleteFamily(Long id);

	Iterable<Family> findFamilyByEmpId(Long id);

	ResponseJSend<Family> saveEmployeeFamilyByEmpId(Long id, JsonNode node) throws JsonMappingException;
 
}
