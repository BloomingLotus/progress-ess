package ess.controller.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import ess.model.Education;
import ess.model.Employee;
import ess.webUI.ResponseJSend;

public interface EntityService {

	ResponseJSend<Employee> saveEmployee(JsonNode node) throws JsonMappingException;

	Employee findEmployeeById(Long id);

	Education findEducationById(Long id);

	ResponseJSend<Education> saveEducation(JsonNode node) throws JsonMappingException;
	
	ResponseJSend<Education> deleteEducation(Long id);

	Iterable<Education> findEmployeeEducationsByEmpId(Long id);

	ResponseJSend<Education> saveEmployeeEducationsByEmpId(Long id, JsonNode node) throws JsonMappingException;
 
}
