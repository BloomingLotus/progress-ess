package ess.controller.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import progress.hrsso.wsdl.GetStaffProfileByName;
import progress.hrsso.wsdl.GetStaffProfileByNameResponse;
import progress.hrsso.wsdl.LoginResponse;

import com.fasterxml.jackson.databind.JsonMappingException;

import ess.controller.service.ProgressHRGeneralClient;
import ess.controller.service.ProgressSSOClient;

@RestController
@RequestMapping("/service/HR")
public class HrWebServiceRestController {

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	ProgressHRGeneralClient progressHrClient;
	
	@Autowired
	ProgressSSOClient progressClient;
	
//	@RequestMapping(value= "/{id}", method = {RequestMethod.GET})
//	public GetItemByEmployeeIDResponse getItemById(@PathVariable Long id) throws JsonMappingException {
//		return progressHrClient.getItemByEmployeeId(id);
//	}
	
	@RequestMapping(value= "/sso/{username}/{password}", method = {RequestMethod.GET})
	public @ResponseBody LoginResponse login(@PathVariable String username, @PathVariable String password) throws JsonMappingException {
		return progressClient.getLogin(username, password);
	}
	
	@RequestMapping(value= "/staffProfile/{name}/get", method = {RequestMethod.GET})
	public @ResponseBody GetStaffProfileByNameResponse getStaffProfileByName(@PathVariable String name) throws JsonMappingException {
		return progressClient.getStaffProfileByName(name);
	}
	
}
