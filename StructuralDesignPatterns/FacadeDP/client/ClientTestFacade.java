package DesignPatterns.StructuralDesignPatterns.FacadeDP.client;

import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.ExcelReport;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.HtmlReport;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.PdfReport;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.impl.ExcelReportImpl;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.impl.HtmlReportImpl;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.impl.PdfReportImpl;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.impl.ReportFacade;

public class ClientTestFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tableName = "Demo";
		
		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateExcelReport(null, tableName);
		
		HtmlReport htmlReport = new HtmlReportImpl();
		htmlReport.generateHtmlReport(null, tableName);
		
		PdfReport pdfReport = new PdfReportImpl();
		pdfReport.generatePdfReport(null, tableName);
		
		System.out.println("--------------------------------------------------------------");
		//using facade design pattern
		
		ReportFacade reportFacade = new ReportFacade();
		reportFacade.generateExcelReport(null, tableName);
		reportFacade.generateHtmlReport(null, tableName);
		reportFacade.generatePdfReport(null, tableName);

	}

}
