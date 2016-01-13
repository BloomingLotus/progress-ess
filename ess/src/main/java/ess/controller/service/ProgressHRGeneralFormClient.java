package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrStaffGeneral.form.wsdl.GetListMaritalStatus;
import progress.hrStaffGeneral.form.wsdl.GetListMaritalStatusResponse;
import progress.hrStaffGeneral.form.wsdl.GetListTitleName;
import progress.hrStaffGeneral.form.wsdl.GetListTitleNameResponse;
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
	
	
	public GetListTitleNameResponse getListTitleName() {
		GetListTitleName request = new GetListTitleName();
		
		GetListTitleNameResponse response = (GetListTitleNameResponse) getWebServiceTemplate().marshalSendAndReceive(
				request,  new SoapActionCallback("http://tempuri.org/GetListTitleName"));
		
		return response;
	}
	
	public GetListMaritalStatusResponse getListMaritalStatusResponse() {
		GetListMaritalStatus request = new GetListMaritalStatus();
		
		GetListMaritalStatusResponse response = (GetListMaritalStatusResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetListMaritalStatus"));
				
		return response;
	}
	
}
