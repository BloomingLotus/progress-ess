package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrStaffListInfo.wsdl.GetEmployeeList;
import progress.hrStaffListInfo.wsdl.GetEmployeeListResponse;

public class ProgressHRStaffListInfoClient extends WebServiceGatewaySupport {
	public GetEmployeeListResponse getEmployeeList(
			Integer pageSize, Integer pageIndex, String searchCriteria, String sortExpression) {
		GetEmployeeList request = new GetEmployeeList();
		request.setPageSize(pageSize);
		request.setSearchCriteria(searchCriteria);
		request.setSortExpression(sortExpression);
		request.setPageIndex(pageIndex);
	
		GetEmployeeListResponse response = (GetEmployeeListResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/getEmployeeList"));
				
		return response;
	}
}
