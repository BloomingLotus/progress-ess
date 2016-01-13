package ess.controller.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import progress.hrsso.wsdl.GetAllApplicationName;
import progress.hrsso.wsdl.GetAllApplicationNameResponse;
import progress.hrsso.wsdl.GetCurrentRoleInApplication;
import progress.hrsso.wsdl.GetCurrentRoleInApplicationResponse;
import progress.hrsso.wsdl.GetStaffProfileByName;
import progress.hrsso.wsdl.GetStaffProfileByNameResponse;
import progress.hrsso.wsdl.Login;
import progress.hrsso.wsdl.LoginResponse;

public class ProgressSSOClient extends WebServiceGatewaySupport {
	public LoginResponse getLogin(String username, String password) {
		Login request = new Login();
		request.setUsername(username);
		request.setPassword(password);
		
		LoginResponse response = (LoginResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/Login"));
		

		return response;
	}
	
	public GetStaffProfileByNameResponse getStaffProfileByName(String username) {
		GetStaffProfileByName request = new GetStaffProfileByName();
		request.setName(username);
		
		GetStaffProfileByNameResponse response = (GetStaffProfileByNameResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://tempuri.org/GetStaffProfileByName"));
		
		return response;
	}
	
	public GetAllApplicationNameResponse getAllApplicationName() {
		GetAllApplicationName request = new GetAllApplicationName();
		GetAllApplicationNameResponse response = (GetAllApplicationNameResponse) getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback("http://tempuri.org/GetAllApplicationName"));
		
		return response;
	}
	
	public GetCurrentRoleInApplicationResponse getCurrentRoleInApplication(String token, String appName) {
		GetCurrentRoleInApplication request = new GetCurrentRoleInApplication();
		request.setToken(token);
		request.setApplicationName(appName);
		
		GetCurrentRoleInApplicationResponse response = (GetCurrentRoleInApplicationResponse) getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback("http://tempuri.org/GetCurrentRoleInApplication"));
		
		return response;
		
	}
	
}
