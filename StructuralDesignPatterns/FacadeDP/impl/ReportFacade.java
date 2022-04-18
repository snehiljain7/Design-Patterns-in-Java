package DesignPatterns.StructuralDesignPatterns.FacadeDP.impl;

import java.sql.Connection;

import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.ExcelReport;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.HtmlReport;
import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.PdfReport;

public class ReportFacade {

	private ExcelReport excelReport;
	private HtmlReport htmlReport;
	private PdfReport pdfReport;
	public ReportFacade() {
		super();
		this.excelReport = new ExcelReportImpl();
		this.htmlReport = new HtmlReportImpl();
		this.pdfReport = new PdfReportImpl();
	};
	
	public void generatePdfReport(Connection connection, String tableName) {
		pdfReport.generatePdfReport(connection, tableName);

	}
	
	public void generateExcelReport(Connection connection, String tableName) {
		excelReport.generateExcelReport(connection, tableName);

	}
	
	public void generateHtmlReport(Connection connection, String tableName) {
		htmlReport.generateHtmlReport(connection, tableName);

	}
}
