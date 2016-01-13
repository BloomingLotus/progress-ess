package ess.controller.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import ess.model.ChangeRequest;
import ess.model.ChangeState;
import ess.model.Employee;
import progress.hrStaffPersonal.wsdl.EmployeePersonalInfo;
import progress.hrStaffPersonal.wsdl.GetItemEmployeePersonal;
import progress.hrStaffPersonal.wsdl.GetItemEmployeePersonalForm;
import progress.hrStaffPersonal.wsdl.GetItemEmployeePersonalFormResponse;
import progress.hrStaffPersonal.wsdl.GetItemEmployeePersonalResponse;
import progress.hrStaffPersonal.wsdl.ListEmployeePersonalInfoForm;

public class ProgressHRPersonalClient extends WebServiceGatewaySupport {
	private Log log = LogFactory.getLog(this.getClass());
	
	public GetItemEmployeePersonalResponse getItemEmployeePersonal(Long id) {
		GetItemEmployeePersonal request = new GetItemEmployeePersonal();
		request.setEmployeeID(id.intValue());
		
		
		
		GetItemEmployeePersonalResponse response = (GetItemEmployeePersonalResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetItemEmployeePersonal"));
		
		
		return response;
	}
	
	public GetItemEmployeePersonalFormResponse getItemEmployeePersonalForm(Long id) {
		GetItemEmployeePersonalForm request = new GetItemEmployeePersonalForm();
		request.setEmployeeID(id.intValue());
		
		
		
		GetItemEmployeePersonalFormResponse response = (GetItemEmployeePersonalFormResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetItemEmployeePersonalForm"));
		
		
		return response;
	}

	public ChangeRequest findChangeRequestByEmp(Long empId) {
		GetItemEmployeePersonalResponse personal = getItemEmployeePersonal(empId);
		GetItemEmployeePersonalFormResponse form = getItemEmployeePersonalForm(empId);
		
		EmployeePersonalInfo info = personal.getGetItemEmployeePersonalResult().getObj();
		ListEmployeePersonalInfoForm infoForm = form.getGetItemEmployeePersonalFormResult().getObj();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		ChangeRequest request = null;
		Map<String,Object> newChangeSet = new HashMap<String, Object>();
		Map<String,Object> oldChangeSet = new HashMap<String, Object>();
		
		log.debug("bankAccount:" + info.getSalaryAccountNo() + " " + infoForm.getSalaryAccountNo() );
		
		if(!info.getSalaryAccountNo().equals(infoForm.getSalaryAccountNo())) {
			
			newChangeSet.put("bankAccount", infoForm.getSalaryAccountNo());
			oldChangeSet.put("bankAccount", info.getSalaryAccountNo());
		}	
		
		try {
			if(!newChangeSet.isEmpty()) {
				request = new ChangeRequest();
				request.setNewChangeSet(mapper.writeValueAsString(newChangeSet));
				request.setOldChangeSet(mapper.writeValueAsString(oldChangeSet));
				request.setCurrentState(ChangeState.REQUESTED_CHANGE);
				request.setDomain(Employee.class.getSimpleName());
			}
			return request;
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	 
 }
