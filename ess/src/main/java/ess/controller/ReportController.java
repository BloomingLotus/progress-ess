package ess.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import com.fasterxml.jackson.databind.JsonMappingException;

import ess.controller.service.EntityService;
import ess.model.Education;
import ess.model.Employee;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import ess.controller.ThJasperReportsPdfView;
import ess.controller.rest.EmployeeRestController;

@Controller
public class ReportController {
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired 
	private ApplicationContext appContext;
	
	@Autowired
	private EntityService entityService;
	
	private EmployeeRestController empService;
	
	@RequestMapping(value = "/reports/staffProfile/{id}", method = RequestMethod.GET, produces = "application/pdf")
	public ModelAndView getQuotationReportPdf(
			@PathVariable Long id) throws JsonMappingException {
		
		log.debug("calling reports/staffProfile/" + id);
		
	    
	    final JasperReportsPdfView view = new ThJasperReportsPdfView();
	    

	    
	    view.setReportDataKey("employeeList");
	    view.setSubReportDataKeys("educationList");
	    view.setUrl("classpath:reports/staffProfile.jrxml");
	    view.setApplicationContext(appContext);

	    final Map<String, Object> params = new HashMap<>();
	    
	    
	    
	    Employee employee = new Employee(); 
	    employee.setId(122L);
	    employee.setEnLastName("yyy");
	    employee.setEnFirstName("xxx");
	    ArrayList<Employee> employeeList = new ArrayList<Employee>();
	    employeeList.add(employee);
	    params.put("employee",employee);
	    params.put("employeeList", employeeList);
	    
	    ArrayList<Education> eList = new ArrayList<Education>();
		Education e = new Education();
		e.setDegree("BS");
		e.setFaculty("นิเทศศาสตร์");
		e.setGpa( new BigDecimal( 2.25 ) );
		e.setInstituteName("มหาวิทยาลัยเชียงใหม่");
		Education e2 = new Education();
		e2.setDegree("MS");
		e2.setFaculty("นิเทศศาสตร์");
		e2.setGpa( new BigDecimal( 3.25 ) );
		e2.setInstituteName("มหาวิทยาลัยเชียงใหม่");
		eList.add(e);
		eList.add(e2);
		JRBeanCollectionDataSource educationlist = new JRBeanCollectionDataSource(eList);
		params.put("educationList", educationlist);
	    
	    return new ModelAndView(view, params);
	}
	
	
}
