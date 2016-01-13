package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrStaffWorkingInfo.wsdl.GetItemEmployeeWorkingInfo;
import progress.hrStaffWorkingInfo.wsdl.GetItemEmployeeWorkingInfoResponse;

public class ProgressHRWorkingInfoClient extends WebServiceGatewaySupport {
	public GetItemEmployeeWorkingInfoResponse getItemEmployeeWorkingInfo(Long empId) {
		GetItemEmployeeWorkingInfo request = new GetItemEmployeeWorkingInfo();
		request.setEmployeeID(empId.intValue());
		
		GetItemEmployeeWorkingInfoResponse response = (GetItemEmployeeWorkingInfoResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetItemEmployeeWorkingInfo"));
				
		return response;
	}
}
