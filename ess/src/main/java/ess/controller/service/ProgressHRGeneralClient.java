package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrStaffGeneral.form.wsdl.GetListMaritalStatus;
import progress.hrStaffGeneral.form.wsdl.GetListMaritalStatusResponse;
import progress.hrStaffGeneral.wsdl.GetItem;
import progress.hrStaffGeneral.wsdl.GetItemGeneralDetailData;
import progress.hrStaffGeneral.wsdl.GetItemGeneralDetailDataResponse;
import progress.hrStaffGeneral.wsdl.GetItemResponse;

public class ProgressHRGeneralClient extends WebServiceGatewaySupport {
	
	
	public GetItemResponse getItemGeneral(Long id) {
		GetItem request = new GetItem();
		request.setEmployeeID(id.intValue());

	
		GetItemResponse response = (GetItemResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetItem"));
				
		return response;
	}
	
	public GetItemGeneralDetailDataResponse getItemDetailDataResponse(Long id) {
		GetItemGeneralDetailData request = new GetItemGeneralDetailData();
		request.setEmployeeID(id.intValue());

	
		GetItemGeneralDetailDataResponse response = (GetItemGeneralDetailDataResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetItemGeneralDetailData"));
				
		return response;
	}
	

	
}
