package ess.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import ess.controller.service.ProgressHRClient;
import ess.controller.service.ProgressSSOClient;

@Configuration
public class WebServiceConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("progress.hrinfo.wsdl", "progress.hrsso.wsdl");
		return marshaller;
	}

	@Bean
	public ProgressHRClient hrINFOClient(Jaxb2Marshaller marshaller) {
		ProgressHRClient client = new ProgressHRClient();
		client.setDefaultUri("http://172.17.12.36:19008/HRMISwS/EmployeeInfo/Staff_GeneralFormWS.asmx");
		
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
}
