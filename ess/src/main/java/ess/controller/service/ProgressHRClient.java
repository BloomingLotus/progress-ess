package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrinfo.wsdl.GetItemByEmployeeID;
import progress.hrinfo.wsdl.GetItemByEmployeeIDResponse;

public class ProgressHRClient extends WebServiceGatewaySupport {
	public GetItemByEmployeeIDResponse getItemByEmployeeId(Integer id) {
		GetItemByEmployeeID request = new GetItemByEmployeeID();
		request.setEmployeeID(id);

	
		GetItemByEmployeeIDResponse response = (GetItemByEmployeeIDResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetItemByEmployeeID"));
				
		return response;
	}
	
}
