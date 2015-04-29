package ess.controller.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mysema.query.BooleanBuilder;

import ess.controller.repository.EducationRepo;
import ess.controller.repository.EmployeeRepo;
import ess.model.Education;
import ess.model.Employee;
import ess.model.QEducation;
import ess.webUI.ResponseJSend;
import ess.webUI.ResponseStatus;

@Service
@Transactional
public class EntityServiceJPA implements EntityService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private EducationRepo educationRepo;
	
	@Override
	public ResponseJSend<Employee> saveEmployee(JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		ObjectNode object = (ObjectNode) node;
		
		Employee webModel;
		
		try {
			webModel = mapper.treeToValue(object, Employee.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Employee dbModel = null;
				
		if(webModel.getId() == null) {
			dbModel = new Employee();
			
		} else {
			dbModel = employeeRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel);

	
		employeeRepo.save(dbModel);
		
		ResponseJSend<Employee> response = new ResponseJSend<Employee>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public Employee findEmployeeById(Long id) {
		return employeeRepo.findOne(id);
	}

	@Override
	public Education findEducationById(Long id) {
		return educationRepo.findOne(id);
	}

	@Override
	public ResponseJSend<Education> saveEducation(JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		ObjectNode object = (ObjectNode) node;
		
		Education webModel;
		
		try {
			webModel = mapper.treeToValue(object, Education.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Education dbModel = null;
				
		if(webModel.getId() == null) {
			dbModel = new Education();
			
		} else {
			dbModel = educationRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel);

	
		educationRepo.save(dbModel);
		
		ResponseJSend<Education> response = new ResponseJSend<Education>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public ResponseJSend<Education> deleteEducation(Long id) {
		Education education = educationRepo.findOne(id);
		
		if(education != null) {
			educationRepo.delete(education);
		}
		
		ResponseJSend<Education> response = new ResponseJSend<Education>();
		response.data = education;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	}

	@Override
	public Iterable<Education> findEmployeeEducationsByEmpId(Long id) {
		QEducation q = QEducation.education;
		
		Iterable<Education> educations = educationRepo.findAll(q.employee.id.eq(id));
		
		return educations;
		
	}

	@Override
	public ResponseJSend<Education> saveEmployeeEducationsByEmpId(Long id,
			JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		ObjectNode object = (ObjectNode) node;
		
		Education webModel;
		
		try {
			webModel = mapper.treeToValue(object, Education.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Education dbModel = null;
				
		if(webModel.getId() == null) {
			dbModel = new Education();
			
		} else {
			dbModel = educationRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");

		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		educationRepo.save(dbModel);
		
		ResponseJSend<Education> response = new ResponseJSend<Education>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}
}
