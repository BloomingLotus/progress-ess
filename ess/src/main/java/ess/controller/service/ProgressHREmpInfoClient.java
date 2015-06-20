package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

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
}
