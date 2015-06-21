package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrStaffPersonal.wsdl.GetItemEmployeePersonal;
import progress.hrStaffPersonal.wsdl.GetItemEmployeePersonalResponse;

public class ProgressHRPersonalClient extends WebServiceGatewaySupport {
	public GetItemEmployeePersonalResponse getItemEmployeePersonal(Long id) {
		GetItemEmployeePersonal request = new GetItemEmployeePersonal();
		request.setEmployeeID(id.intValue());
		
		
		
		GetItemEmployeePersonalResponse response = (GetItemEmployeePersonalResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetItemEmployeePersonal"));
		
		
		return response;
	}
	 
 }
