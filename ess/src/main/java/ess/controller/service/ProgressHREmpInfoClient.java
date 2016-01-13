package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrEmployeeInfo.wsdl.GetEmployeeGeneralInfoContact;
import progress.hrEmployeeInfo.wsdl.GetEmployeeGeneralInfoContactResponse;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeAddressInfo;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeAddressInfoResponse;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeCertificationInfo;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeCertificationInfoResponse;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeEducationInfo;
import progress.hrEmployeeInfo.wsdl.GetListEmployeeEducationInfoResponse;

public class ProgressHREmpInfoClient extends WebServiceGatewaySupport {
	public GetListEmployeeEducationInfoResponse getListEmployeeEducationInfo(Long id) {
		GetListEmployeeEducationInfo request = new GetListEmployeeEducationInfo();
		request.setEmployeeID(id.intValue());

	
		GetListEmployeeEducationInfoResponse response = (GetListEmployeeEducationInfoResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/getListEmployeeEducationInfo"));

		return response;
	}
	
	public GetListEmployeeCertificationInfoResponse getListEmployeeCeritficationInfo(Long id) {
		GetListEmployeeCertificationInfo request = new GetListEmployeeCertificationInfo();
		request.setEmployeeID(id.intValue());

	
		GetListEmployeeCertificationInfoResponse response = (GetListEmployeeCertificationInfoResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/getListEmployeeCertificationInfo"));
				
		return response;
	}
	
	public GetListEmployeeAddressInfoResponse getListEmployeeAddressInfo(Long id) {
		GetListEmployeeAddressInfo request = new GetListEmployeeAddressInfo();
		request.setEmployeeID(id.intValue());

	
		GetListEmployeeAddressInfoResponse response = (GetListEmployeeAddressInfoResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/getListEmployeeAddressInfo"));
				
		return response;
	}
	
	public GetEmployeeGeneralInfoContactResponse getEmployeeGeneralInfoContact(Long id) {
		GetEmployeeGeneralInfoContact request = new GetEmployeeGeneralInfoContact();
		request.setEmployeeID(id.intValue());

	
		GetEmployeeGeneralInfoContactResponse response = (GetEmployeeGeneralInfoContactResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/getEmployeeGeneralInfoContact"));
				
		return response;
	}
	

	
	
	
}
