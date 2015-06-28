package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

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
}
