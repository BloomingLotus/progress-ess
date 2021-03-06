package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrStaffPersonal.form.wsdl.GetListRace;
import progress.hrStaffPersonal.form.wsdl.GetListRaceResponse;
import progress.hrStaffPersonal.form.wsdl.GetListReligion;
import progress.hrStaffPersonal.form.wsdl.GetListReligionResponse;
import progress.hrStaffPersonal.form.wsdl.ListEmployeePersonalInfo;
import progress.hrStaffPersonal.form.wsdl.Update;
import progress.hrStaffPersonal.form.wsdl.UpdateResponse;

public class ProgressHRPersonalFormClient extends WebServiceGatewaySupport {

	public UpdateResponse update(String userName, ListEmployeePersonalInfo info) {
		Update request = new Update();
		
		request.setObj(info);
		
		
		UpdateResponse response = (UpdateResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/Update"));
				
		return response;
		
	}
	public GetListReligionResponse getListReligion() {
		GetListReligion request = new GetListReligion();

	
		GetListReligionResponse response = (GetListReligionResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetListReligion"));
				
		return response;
	}
	public GetListRaceResponse getListRace() {
		GetListRace request = new GetListRace();

	
		GetListRaceResponse response = (GetListRaceResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetListRace"));
				
		return response;
	}
	
}
