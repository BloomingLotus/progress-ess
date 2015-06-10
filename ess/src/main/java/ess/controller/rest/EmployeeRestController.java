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
import ess.model.Address;
import ess.model.Certified;
import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.EmergencyContact;
import ess.model.Employee;
import ess.model.Family;
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

	// ==== Certifed


		@RequestMapping(value= "/{id}/Certifieds", method = {RequestMethod.GET})
		public Iterable<Certified> findCertifiedById(
				@PathVariable Long id) throws JsonMappingException {
			return entityService.findCertifiedByEmpId(id);
		}
		
		@RequestMapping(value= "/{id}/Certified", method = {RequestMethod.POST})
		public ResponseJSend<Certified> saveCertifiedById(
				@PathVariable Long id,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeCertifiedByEmpId(id, node);
		}
		
		@RequestMapping(value= "/{id}/Certified/{compExpId}", method = {RequestMethod.PUT})
		public ResponseJSend<Certified> updateEmployeeCertifiedByEduId(
				@PathVariable Long id,
				@PathVariable Long compExpId,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeCertifiedByEmpId(id, node);
		}	

		// ==== Family


		@RequestMapping(value= "/{id}/Familys", method = {RequestMethod.GET})
		public Iterable<Family> findFmamliyById(
				@PathVariable Long id) throws JsonMappingException {
			return entityService.findFamilyByEmpId(id);
		}
		
		@RequestMapping(value= "/{id}/Family", method = {RequestMethod.POST})
		public ResponseJSend<Family> saveFamilyById(
				@PathVariable Long id,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeFamilyByEmpId(id, node);
		}
		
		@RequestMapping(value= "/{id}/Family/{compExpId}", method = {RequestMethod.PUT})
		public ResponseJSend<Family> updateEmployeeFamilyEduId(
				@PathVariable Long id,
				@PathVariable Long compExpId,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeFamilyByEmpId(id, node);
		}	
	
		
		// ==== Emergency Contact


		@RequestMapping(value= "/{id}/EmergencyContacts", method = {RequestMethod.GET})
		public Iterable<EmergencyContact> findEmergencyContactById(
				@PathVariable Long id) throws JsonMappingException {
			return entityService.findEmergencyContactByEmpId(id);
		}
		
		@RequestMapping(value= "/{id}/EmergencyContact", method = {RequestMethod.POST})
		public ResponseJSend<EmergencyContact> saveEmergencyContactById(
				@PathVariable Long id,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeEmergencyContactByEmpId(id, node);
		}
		
		@RequestMapping(value= "/{id}/EmergencyContact/{compExpId}", method = {RequestMethod.PUT})
		public ResponseJSend<EmergencyContact> updateEmployeeEmergencyContactById(
				@PathVariable Long id,
				@PathVariable Long compExpId,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeEmergencyContactByEmpId(id, node);
		}	
		
		
		// ==== Address

		@RequestMapping(value= "/{id}/RegisteredAddresss", method = {RequestMethod.GET})
		public Iterable<Address> findRegisteredAddress(
				@PathVariable Long id) throws JsonMappingException {
			return entityService.findRegisteredAddressByEmpId(id);
		}
		
		@RequestMapping(value= "/{id}/RegisteredAddress", method = {RequestMethod.POST})
		public ResponseJSend<Address> saveRegisteredAddressById(
				@PathVariable Long id,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeRegisteredAddressByEmpId(id, node);
		}
		
		@RequestMapping(value= "/{id}/RegisteredAddress/{compExpId}", method = {RequestMethod.PUT})
		public ResponseJSend<Address> updateEmployeeRegisteredAddressById(
				@PathVariable Long id,
				@PathVariable Long compExpId,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeRegisteredAddressByEmpId(id, node);
		}	
		
		@RequestMapping(value= "/{id}/CurrentAddresss", method = {RequestMethod.GET})
		public Iterable<Address> findCurrentAddress(
				@PathVariable Long id) throws JsonMappingException {
			return entityService.findCurrentAddressByEmpId(id);
		}
		
		@RequestMapping(value= "/{id}/CurrentAddress", method = {RequestMethod.POST})
		public ResponseJSend<Address> saveCurrentAddressById(
				@PathVariable Long id,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeCurrentAddressByEmpId(id, node);
		}
		
		@RequestMapping(value= "/{id}/CurrentAddress/{compExpId}", method = {RequestMethod.PUT})
		public ResponseJSend<Address> updateEmployeeCurrentAddressById(
				@PathVariable Long id,
				@PathVariable Long compExpId,
				@RequestBody JsonNode node) throws JsonMappingException {
			return entityService.saveEmployeeCurrentAddressByEmpId(id, node);
		}	
}
