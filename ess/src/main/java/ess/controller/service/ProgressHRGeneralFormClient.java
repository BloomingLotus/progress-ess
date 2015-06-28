package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrStaffGeneral.form.wsdl.ListEmployeeInfoGeneralForm;
import progress.hrStaffGeneral.form.wsdl.Update;
import progress.hrStaffPersonal.form.wsdl.UpdateResponse;

public class ProgressHRGeneralFormClient extends WebServiceGatewaySupport {

	public UpdateResponse update(String userName, ListEmployeeInfoGeneralForm info) {
		Update request = new Update();
		
		request.setObj(info);
		request.setUserName(userName);
		
		UpdateResponse response = (UpdateResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/Update"));
				
		return response;
		
	}
	
}
