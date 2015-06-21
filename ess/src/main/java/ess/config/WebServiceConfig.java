package ess.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import ess.controller.service.ProgressHREmpInfoClient;
import ess.controller.service.ProgressHRGeneralClient;
import ess.controller.service.ProgressHRPersonalClient;
import ess.controller.service.ProgressSSOClient;

@Configuration
public class WebServiceConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths(
				"progress.hrStaffGeneral.wsdl",
				"progress.hrStaffGeneral.form.wsdl",
				"progress.hrEmployeeInfo.wsdl", 
				"progress.hrStaffAddress.form.wsdl",
				"progress.hrEducation.form.wsdl",
				"progress.hrCertification.form.wsdl",
				"progress.hrStaffPersonal.wsdl",
				"progress.hrStaffPersonal.form.wsdl",
				"progress.hrStaffWorkingInfo.wsdl",
				"progress.hrStaffWorkingInfo.form.wsdl",
				"progress.hrsso.wsdl"
				);
		return marshaller;
	}

	@Bean
	public ProgressHRGeneralClient hrGeneneralClient(Jaxb2Marshaller marshaller) {
		ProgressHRGeneralClient client = new ProgressHRGeneralClient();
		client.setDefaultUri("http://172.17.12.36:19008/HRMISWS/EmployeeInfo/Staff_GeneralWS.asmx");
		
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public ProgressSSOClient hrSSOClient(Jaxb2Marshaller marshaller) {
		ProgressSSOClient client = new ProgressSSOClient();
		client.setDefaultUri("http://172.17.12.39:19014/SSOWS/AuthenticationWS.asmx");
		
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public ProgressHREmpInfoClient hrEmpInfoClient(Jaxb2Marshaller marshaller) {
		ProgressHREmpInfoClient client = new ProgressHREmpInfoClient();
		                      
		client.setDefaultUri("http://172.17.12.36:19008/HRMISWS/EmployeeInfo/EmployeeInfoWS.asmx");
		
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public ProgressHRPersonalClient hrPersonalClient(Jaxb2Marshaller marshaller) {
		ProgressHRPersonalClient client = new ProgressHRPersonalClient();
		                      
		client.setDefaultUri("http://172.17.12.36:19008/HRMISWS/EmployeeInfo/Staff_PersonalWS.asmx");
		
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
