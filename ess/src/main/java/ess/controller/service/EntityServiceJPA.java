package ess.controller.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.h2.message.DbException;
import org.springframework.beans.BeanUtils;






import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import progress.hrEmployeeInfo.wsdl.GetListEmployeeAddressInfoResponse;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeCertificationInfoResponse;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeEducationInfoResponse;
import progress.hrEmployeeInfo.wsdl.ListEmployeeAddressInfo;
import progress.hrEmployeeInfo.wsdl.ListEmployeeCertificationInfo;
import progress.hrEmployeeInfo.wsdl.ListEmployeeEducationInfo;
import progress.hrStaffGeneral.wsdl.GetItemGeneralDetailDataResponse;
import progress.hrStaffPersonal.wsdl.EmployeePersonalInfo;
import progress.hrStaffPersonal.wsdl.GetItemEmployeePersonalResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mysema.query.BooleanBuilder;

import ess.controller.repository.AddressRepo;
import ess.controller.repository.CertifiedRepo;
import ess.controller.repository.ChangeRequestLogRepo;
import ess.controller.repository.ChangeRequestRepo;
import ess.controller.repository.ComputerExperienceRepo;
import ess.controller.repository.EducationRepo;
import ess.controller.repository.EmergencyContactRepo;
import ess.controller.repository.EmployeeRepo;
import ess.controller.repository.FamilyRepo;
import ess.controller.repository.ProjectOnHandRepo;
import ess.controller.repository.TrainingRepo;
import ess.controller.repository.WorkExperienceRepo;
import ess.model.Address;
import ess.model.Certified;
import ess.model.ChangeRequest;
import ess.model.ChangeRequestLog;
import ess.model.ChangeState;
import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.EmergencyContact;
import ess.model.Employee;
import ess.model.Family;
import ess.model.ProjectOnHand;
import ess.model.QAddress;
import ess.model.QChangeRequest;
import ess.model.QComputerExperience;
import ess.model.QEmergencyContact;
import ess.model.QFamily;
import ess.model.QProjectOnHand;
import ess.model.QTraining;
import ess.model.QWorkExperience;
import ess.model.Training;
import ess.model.WorkExperience;
import ess.webUI.DefaultProperty;
import ess.webUI.ResponseJSend;
import ess.webUI.ResponseStatus;

@Service
@Transactional
public class EntityServiceJPA implements EntityService {
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private EducationRepo educationRepo;
	
	@Autowired
	private ComputerExperienceRepo computerExperienceRepo;

	@Autowired
	private ProjectOnHandRepo projectOnHandRepo;
	
	@Autowired
	private TrainingRepo trainingRepo;
	
	@Autowired
	private WorkExperienceRepo workExperienceRepo;
	
	@Autowired
	private CertifiedRepo certifiedRepo;
	
	@Autowired
	private FamilyRepo familyRepo;
	
	@Autowired
	private EmergencyContactRepo emergencyContactRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ChangeRequestRepo changeRequestRepo;
	
	@Autowired
	private ChangeRequestLogRepo changeRequestLogRepo;
	
	@Autowired
	private ProgressSSOClient progressSSOClient;
	
	@Autowired
	private ProgressHRGeneralClient progressHrGeneralClient;
	
	
	@Autowired
	private ProgressHRPersonalClient hrPersonalClient;
	
	@Autowired
	private ProgressHREmpInfoClient hrEmpInfoClient;
	
	
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
		
		Employee hrModel = findEmployeeById(webModel.getId());
		
		ArrayList<String> properties = new ArrayList<String>();
		BeanWrapper webSrc = new BeanWrapperImpl(webModel);
		BeanWrapper hrSrc = new BeanWrapperImpl(hrModel);
		BeanWrapper dbSrc = new BeanWrapperImpl(dbModel);
		// find diferences!
		
		String[] prop = {"mobilePhone", "bankAccount"};
		
		Map<String,Object> newChangeSet = new HashMap<String, Object>();
		Map<String,Object> oldChangeSet = new HashMap<String, Object>();
		
		for(String p : prop) {
			if(!webSrc.getPropertyValue(p).equals(hrSrc.getPropertyValue(p))) {
				properties.add(p);
				dbSrc.setPropertyValue(p, webSrc.getPropertyValue(p));
				newChangeSet.put(p, webSrc.getPropertyValue(p));
				oldChangeSet.put(p, hrSrc.getPropertyValue(p));
			}
		}
		try {
			ChangeRequest request = new ChangeRequest();
			request.setNewChangeSet(mapper.writeValueAsString(newChangeSet));
			request.setOldChangeSet(mapper.writeValueAsString(oldChangeSet));
			request.setDomain(Employee.class.getSimpleName());
			request.setCreatedBy(dbModel);
			request.setCreatedTime(new Date());
			request.setCurrentState(ChangeState.REQUESTED_CHANGE);
			
			changeRequestRepo.save(request);
			
			ChangeRequestLog reqLog = new ChangeRequestLog();
			reqLog.setTimestamp(request.getCreatedTime());
			reqLog.setActor(dbModel);
			reqLog.setChangeRequest(request);
			reqLog.setToState(request.getCurrentState());
			reqLog.setRemark(null);
			changeRequestLogRepo.save(reqLog);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//BeanUtils.copyProperties(webModel, dbModel);

		
	
		employeeRepo.save(dbModel);
		
		ResponseJSend<Employee> response = new ResponseJSend<Employee>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public Employee findEmployeeById(Long id) {
		GetItemGeneralDetailDataResponse response = progressHrGeneralClient.getItemDetailDataResponse(id);
		
		GetItemEmployeePersonalResponse personalResponse = hrPersonalClient.getItemEmployeePersonal(id);
		
		Employee emp = new Employee(response.getGetItemGeneralDetailDataResult().getObj());
		
		EmployeePersonalInfo info = personalResponse.getGetItemEmployeePersonalResult().getObj();
		
		emp.setNationalityName(info.getNationalityName());
		emp.setBankAccount(info.getSalaryAccountNo());
		emp.setReligious(info.getReligionName());
		
		return emp;
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
//		QEducation q = QEducation.education;
		
//		Iterable<Education> educations = educationRepo.findAll(q.employee.id.eq(id));
		
		GetListEmployeeEducationInfoResponse eduInfoResponse = hrEmpInfoClient.getListEmployeeEducationInfo(id);
		
		ArrayList<Education> eduList = new ArrayList<Education>();
		
		for(ListEmployeeEducationInfo eduInfo : eduInfoResponse.getGetListEmployeeEducationInfoResult().getObj().getListEmployeeEducationInfo()) {
			Education edu = new Education(eduInfo);
			eduList.add(edu);
	}
		
		
		return eduList;
		
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

	@Override
	public ComputerExperience findComputerExperienceById(Long id) {
		ComputerExperience compExp = computerExperienceRepo.findOne(id);
		return compExp;
	}

	
	@Override
	public Iterable<ComputerExperience> findEmployeeComputerExperiencesByEmpId(
			Long id) {
		
		QComputerExperience q = QComputerExperience.computerExperience;
		
		Iterable<ComputerExperience> compexps = computerExperienceRepo.findAll(q.employee.id.eq(id));
		
		return compexps;
	}

	@Override
	public ResponseJSend<ComputerExperience> saveEmployeeComputerExperienceByEmpId(
			Long id, JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		ObjectNode object = (ObjectNode) node;
		
		ComputerExperience webModel;
		
		try {
			webModel = mapper.treeToValue(object, ComputerExperience.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		ComputerExperience dbModel = null;
				
		
		
		if(webModel.getId() == null) {
			dbModel = new ComputerExperience();
			
		} else {
			dbModel = computerExperienceRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");
		
		dbModel.setProgramingLanguage(webModel.getProgrammingLanguage());
				
		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		computerExperienceRepo.save(dbModel);
		
		ResponseJSend<ComputerExperience> response = new ResponseJSend<ComputerExperience>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public ResponseJSend<ComputerExperience> deleteComputerExperience(Long id) {
		ComputerExperience compExp = computerExperienceRepo.findOne(id);
		
		if(compExp != null) {
			computerExperienceRepo.delete(compExp);
		}
		
		ResponseJSend<ComputerExperience> response = new ResponseJSend<ComputerExperience>();
		response.data = compExp;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	}

	
	
	@Override
	public ResponseJSend<ProjectOnHand> saveEmployeeProjectOnHandByEmpId(
			Long id, JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		
		ObjectNode object = (ObjectNode) node;
		
		ProjectOnHand webModel;
		
		try {
			webModel = mapper.treeToValue(object, ProjectOnHand.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		ProjectOnHand dbModel = null;
				
		
		
		if(webModel.getId() == null) {
			dbModel = new ProjectOnHand();
			
		} else {
			dbModel = projectOnHandRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");
		
		
		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		projectOnHandRepo.save(dbModel);
		
		ResponseJSend<ProjectOnHand> response = new ResponseJSend<ProjectOnHand>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public Iterable<ProjectOnHand> findEmployeeProjectOnHandsByEmpId(Long id) {
		QProjectOnHand q = QProjectOnHand.projectOnHand;
		
		Iterable<ProjectOnHand> projects = projectOnHandRepo.findAll(q.employee.id.eq(id));
		
		return projects;
	}

	@Override
	public ProjectOnHand findProjectOnHandById(Long id) {
		ProjectOnHand proj = projectOnHandRepo.findOne(id);
		return proj;
	}

	@Override
	public ResponseJSend<ProjectOnHand> deleteProjectOnHand(Long id) {
		ProjectOnHand project = projectOnHandRepo.findOne(id);
		
		if(project != null) {
			projectOnHandRepo.delete(project);
		}
		
		ResponseJSend<ProjectOnHand> response = new ResponseJSend<ProjectOnHand>();
		response.data = project;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	}

	
	
	
	@Override
	public Iterable<Training> findEmployeeTrainingByEmpId(Long id) {
		QTraining q = QTraining.training;
		
		Iterable<Training> trainings = trainingRepo.findAll(q.employee.id.eq(id));
		
		return trainings;
	}

	@Override
	public ResponseJSend<Training> saveEmployeeTrainingByEmpId(Long id,
			JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		
		// Register default dateformat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(sdf);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		log.debug(node);
		
		ObjectNode object = (ObjectNode) node;
		
		Training webModel;
		
		try {
			webModel = mapper.treeToValue(object, Training.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Training dbModel = null;
				
		
		
		if(webModel.getId() == null) {
			dbModel = new Training();
			
		} else {
			dbModel = trainingRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");
		
		log.debug(">>>>>>>> " + webModel.getEndDate());
		log.debug(">>>>>>>> " + dbModel.getEndDate());
		
		
		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		trainingRepo.save(dbModel);
		
		log.debug(">>>>>>>> " + dbModel.getEndDate());
		ResponseJSend<Training> response = new ResponseJSend<Training>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public Training findTrainingById(Long id) {
		Training training = trainingRepo.findOne(id);
		return training;
	}

	@Override
	public ResponseJSend<Training> deleteTraining(Long id) {
		Training training = trainingRepo.findOne(id);
		
		if(training != null) {
			trainingRepo.delete(training);
		}
		
		ResponseJSend<Training> response = new ResponseJSend<Training>();
		response.data = training;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	}

	@Override
	public WorkExperience findWorkExperienceById(Long id) {
		WorkExperience workExp = workExperienceRepo.findOne(id);
		return workExp;
	}

	@Override
	public ResponseJSend<WorkExperience> deleteWorkExperience(Long id) {
		WorkExperience workExp = workExperienceRepo.findOne(id);
		
		if(workExp != null) {
			workExperienceRepo.delete(workExp);
		}
		
		ResponseJSend<WorkExperience> response = new ResponseJSend<WorkExperience>();
		response.data = workExp;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	
	}

	@Override
	public Iterable<WorkExperience> findEmployeeWorkExperienceByEmpId(Long id) {
		QWorkExperience q = QWorkExperience.workExperience;
		
		Iterable<WorkExperience> workExps = workExperienceRepo.findAll(q.employee.id.eq(id));
		
		return workExps;
	}

	@Override
	public ResponseJSend<WorkExperience> saveEmployeeWorkExperienceByEmpId(
			Long id, JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		
		// Register default dateformat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(sdf);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		
		ObjectNode object = (ObjectNode) node;
		
		WorkExperience webModel;
		
		try {
			webModel = mapper.treeToValue(object, WorkExperience.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		WorkExperience dbModel = null;
				
		
		
		if(webModel.getId() == null) {
			dbModel = new WorkExperience();
			
		} else {
			dbModel = workExperienceRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");
		
		
		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		workExperienceRepo.save(dbModel);
		
		ResponseJSend<WorkExperience> response = new ResponseJSend<WorkExperience>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;

	}

	@Override
	public ResponseJSend<Certified> deleteCertified(Long id) {
		Certified certified = certifiedRepo.findOne(id);
		
		if(certified != null) {
			certifiedRepo.delete(certified);
		}
		
		ResponseJSend<Certified> response = new ResponseJSend<Certified>();
		response.data = certified;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	
	}

	@Override
	public Certified findCertifiedById(Long id) {
		return certifiedRepo.findOne(id);
	}

	@Override
	public Iterable<Certified> findCertifiedByEmpId(Long id) {
//		QCertified q = QCertified.certified;
//		
//		Iterable<Certified> certifieds = certifiedRepo.findAll(q.employee.id.eq(id));
	GetListEmployeeCertificationInfoResponse response = hrEmpInfoClient.getListEmployeeCeritficationInfo(id);	
		ArrayList<Certified> certList = new ArrayList<Certified>();
		
		for(ListEmployeeCertificationInfo certInfo : response.getGetListEmployeeCertificationInfoResult().getObj().getListEmployeeCertificationInfo()) {
			Certified cert = new Certified(certInfo);
			certList.add(cert);
		}
		
		
		return certList;
	}

	@Override
	public ResponseJSend<Certified> saveEmployeeCertifiedByEmpId(Long id,
			JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		
		// Register default dateformat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(sdf);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		
		ObjectNode object = (ObjectNode) node;
		
		Certified webModel;
		
		try {
			webModel = mapper.treeToValue(object, Certified.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Certified dbModel = null;
				
		
		
		if(webModel.getId() == null) {
			dbModel = new Certified();
			
		} else {
			dbModel = certifiedRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");
		
		
		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		certifiedRepo.save(dbModel);
		
		ResponseJSend<Certified> response = new ResponseJSend<Certified>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public Family findFamilyById(Long id) {
		
		return familyRepo.findOne(id);
	}

	@Override
	public ResponseJSend<Family> deleteFamily(Long id) {
		Family family = familyRepo.findOne(id);
		
		if(family != null) {
			familyRepo.delete(family);
		}
		
		ResponseJSend<Family> response = new ResponseJSend<Family>();
		response.data = family;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	
	}

	@Override
	public Iterable<Family> findFamilyByEmpId(Long id) {
//		QFamily q = QFamily.family;
//		
//		Iterable<Family> familys = familyRepo.findAll(q.employee.id.eq(id));
//		
//		return familys;
		
		GetItemGeneralDetailDataResponse response = progressHrGeneralClient.getItemDetailDataResponse(id);
		
		ArrayList<Family> familyList = new ArrayList<Family>();
		if(response.getGetItemGeneralDetailDataResult().getObj() != null) {
			Family family = new Family(response.getGetItemGeneralDetailDataResult().getObj());
			familyList.add(family);
		}
		
		return familyList;
	}

	@Override
	public ResponseJSend<Family> saveEmployeeFamilyByEmpId(Long id,
			JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		
		// Register default dateformat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(sdf);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		
		ObjectNode object = (ObjectNode) node;
		
		Family webModel;
		
		try {
			webModel = mapper.treeToValue(object, Family.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Family dbModel = null;
				
		
		
		if(webModel.getId() == null) {
			dbModel = new Family();
			
		} else {
			dbModel = familyRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");
		
		
		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		familyRepo.save(dbModel);
		
		ResponseJSend<Family> response = new ResponseJSend<Family>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public EmergencyContact findEmergencyContactById(Long id) {
		
		return emergencyContactRepo.findOne(id);
	}

	@Override
	public ResponseJSend<EmergencyContact> deleteEmergencyContact(Long id) {
		EmergencyContact emerContact = emergencyContactRepo.findOne(id);
		
		if(emerContact != null) {
			emergencyContactRepo.delete(emerContact);
		}
		
		ResponseJSend<EmergencyContact> response = new ResponseJSend<EmergencyContact>();
		response.data = emerContact;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	}

	@Override
	public Iterable<EmergencyContact> findEmergencyContactByEmpId(Long id) {
		
		
		
//		QEmergencyContact q = QEmergencyContact.emergencyContact;
//		
//		Iterable<EmergencyContact> emergencyContacts = emergencyContactRepo.findAll(q.employee.id.eq(id));
//		
//		return emergencyContacts;
		
		ArrayList<EmergencyContact> contacts = new  ArrayList<EmergencyContact>();
		
		GetItemGeneralDetailDataResponse response = progressHrGeneralClient.getItemDetailDataResponse(id);
		if(response.getGetItemGeneralDetailDataResult().getObj() != null) {
			EmergencyContact contact = new EmergencyContact(response.getGetItemGeneralDetailDataResult().getObj());
			contacts.add(contact);
		}
		
		return contacts;
	
	}

	@Override
	public ResponseJSend<EmergencyContact> saveEmployeeEmergencyContactByEmpId(
			Long id, JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		
		// Register default dateformat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(sdf);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		ObjectNode object = (ObjectNode) node;
		
		EmergencyContact webModel;
		
		try {
			webModel = mapper.treeToValue(object, EmergencyContact.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		EmergencyContact dbModel = null;
				
		
		
		if(webModel.getId() == null) {
			dbModel = new EmergencyContact();
			
		} else {
			dbModel = emergencyContactRepo.findOne(webModel.getId());
		}
		
		BeanUtils.copyProperties(webModel, dbModel, "employee");
		
		
		Employee emp = employeeRepo.findOne(id);
		dbModel.setEmployee(emp);
		
		emergencyContactRepo.save(dbModel);
		
		ResponseJSend<EmergencyContact> response = new ResponseJSend<EmergencyContact>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public Address findAddressById(Long id) {
		return addressRepo.findOne(id);
	}

	@Override
	public ResponseJSend<Address> deleteAddress(Long id) {
		Address address = addressRepo.findOne(id);
		
		if(address != null) {
			addressRepo.delete(address);
		}
		
		ResponseJSend<Address> response = new ResponseJSend<Address>();
		response.data = address;
		response.status = ResponseStatus.SUCCESS;
		
		return response;
	}

	@Override
	public Iterable<Address> findRegisteredAddressByEmpId(Long id) {
//		QAddress q = QAddress.address;
//		
//		Employee emp = findEmployeeById(id);
//		if(emp != null && emp.getRegisteredAddress() != null) {
//			Iterable<Address> address = addressRepo.findAll(q.eq(emp.getRegisteredAddress()));
//			
//			return address;// TODO Auto-generated method stub
//		}
//		
//		return null;
		
		ArrayList<Address> addrList = new ArrayList<Address>();
		
		GetListEmployeeAddressInfoResponse response = hrEmpInfoClient.getListEmployeeAddressInfo(id);
		for(ListEmployeeAddressInfo addrInfo : response.getGetListEmployeeAddressInfoResult().getObj().getListEmployeeAddressInfo()) {
			if(addrInfo.getAddressType().equals("Registered")){
				Address addr = new Address(addrInfo);
				addrList.add(addr);
			} 
		}
		
		
		return addrList;
	}

	@Override
	public ResponseJSend<Address> saveEmployeeRegisteredAddressByEmpId(Long id,
			JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		
		// Register default dateformat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(sdf);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		ObjectNode object = (ObjectNode) node;
		
		Address webModel;
		
		try {
			webModel = mapper.treeToValue(object, Address.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Address dbModel = null;
				
		
		
		Employee emp = findEmployeeById(id);
		if(emp.getRegisteredAddress() == null) {
			dbModel = new Address();
		} else {
			dbModel = emp.getRegisteredAddress();
		}
		
		BeanUtils.copyProperties(webModel, dbModel);
		
		addressRepo.save(dbModel);
		emp.setRegisteredAddress(dbModel);
		employeeRepo.save(emp);
		
		ResponseJSend<Address> response = new ResponseJSend<Address>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public Iterable<Address> findCurrentAddressByEmpId(Long id) {
//		QAddress q = QAddress.address;
//		
//		Employee emp = findEmployeeById(id);
//		if(emp != null && emp.getCurrentAddress() != null) {
//			Iterable<Address> address = addressRepo.findAll(q.eq(emp.getCurrentAddress()));
//			
//			return address;// TODO Auto-generated method stub
//		}

		ArrayList<Address> addrList = new ArrayList<Address>();
		
		GetListEmployeeAddressInfoResponse response = hrEmpInfoClient.getListEmployeeAddressInfo(id);
		for(ListEmployeeAddressInfo addrInfo : response.getGetListEmployeeAddressInfoResult().getObj().getListEmployeeAddressInfo()) {
			if(addrInfo.getAddressType().equals("Current")){
				Address addr = new Address(addrInfo);
				addrList.add(addr);
			} 
		}
		
		
		return addrList;

	}

	@Override
	public ResponseJSend<Address> saveEmployeeCurrentAddressByEmpId(Long id,
			JsonNode node) throws JsonMappingException {
		ObjectMapper mapper = new ObjectMapper();
		
		// Register default dateformat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(sdf);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		ObjectNode object = (ObjectNode) node;
		
		Address webModel;
		
		try {
			webModel = mapper.treeToValue(object, Address.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		Address dbModel = null;
				
		
		
		Employee emp = findEmployeeById(id);
		if(emp.getCurrentAddress() == null) {
			dbModel = new Address();
		} else {
			dbModel = emp.getCurrentAddress();
		}
		
		BeanUtils.copyProperties(webModel, dbModel);
		
		addressRepo.save(dbModel);
		emp.setCurrentAddress(dbModel);
		employeeRepo.save(emp);
		
		ResponseJSend<Address> response = new ResponseJSend<Address>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel; 
		return response;
	}

	@Override
	public void saveEmployee(Employee emp) {
		employeeRepo.save(emp);
	}

	@Override
	public Employee findEmployeeFromDB(Long id) {
		return employeeRepo.findOne(id);
	}

	@Override
	public ChangeRequest findChangeRequestById(Long id) {
		return changeRequestRepo.findOne(id);
	}

	@Override
	public ResponseJSend<Page<ChangeRequest>> findChangeRequestByExample(
			JsonNode node, Integer pageNum) throws JsonMappingException {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		ObjectNode object = (ObjectNode) node;
		ChangeRequest webModel;
		
		try {
			webModel = mapper.treeToValue(object, ChangeRequest.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		QChangeRequest q = QChangeRequest.changeRequest;
		
		BooleanBuilder p = new BooleanBuilder();
		
		PageRequest pageRequest =
	            new PageRequest(pageNum -1, DefaultProperty.NUMBER_OF_ELEMENT_PER_PAGE, Sort.Direction.ASC, "createdTime");
		
		Page<ChangeRequest> requests = changeRequestRepo.findAll(p, pageRequest); 
		
		ResponseJSend<Page<ChangeRequest>> response = new ResponseJSend<Page<ChangeRequest>>();
		response.data=requests;
		response.status=ResponseStatus.SUCCESS;
		
		return response;

	}
	
	
	
	
	
	
}


