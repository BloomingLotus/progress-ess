package ess.controller;

import net.sf.jasperreports.engine.JRExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import com.googlecode.jthaipdf.jasperreports.engine.export.ThaiJRPdfExporter;


public class ThJasperReportsPdfView extends JasperReportsPdfView {

	public static Logger logger = LoggerFactory.getLogger(ThJasperReportsPdfView.class);
	
	@Override
	protected JRExporter createExporter() {
		// TODO Auto-generated method stub
		return new ThaiJRPdfExporter();
	}

}
